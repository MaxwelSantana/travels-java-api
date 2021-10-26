package io.github.maxwelsantana.travelsjavaapi.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.springframework.stereotype.Service;

import io.github.maxwelsantana.travelsjavaapi.model.Statistic;
import io.github.maxwelsantana.travelsjavaapi.model.Travel;

@Service
public class StatisticService {
	public Statistic create(List<Travel> travels) {

		var statistics = new Statistic();
		statistics.setCount(travels.stream().count());
		statistics.setAvg(
				BigDecimal.valueOf(travels.stream().mapToDouble(t -> t.getAmount().doubleValue()).average().orElse(0.0))
						.setScale(2, RoundingMode.HALF_UP));
		statistics.setMin(
				BigDecimal.valueOf(travels.stream().mapToDouble(t -> t.getAmount().doubleValue()).min().orElse(0.0))
						.setScale(2, RoundingMode.HALF_UP));
		statistics.setMax(
				BigDecimal.valueOf(travels.stream().mapToDouble(t -> t.getAmount().doubleValue()).max().orElse(0.0))
						.setScale(2, RoundingMode.HALF_UP));
		statistics.setSum(BigDecimal.valueOf(travels.stream().mapToDouble(t -> t.getAmount().doubleValue()).sum())
				.setScale(2, RoundingMode.HALF_UP));

		return statistics;
	}
}
