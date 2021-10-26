package io.github.maxwelsantana.travelsjavaapi.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Statistic {
	private BigDecimal sum;
	private BigDecimal avg;
	private BigDecimal max;
	private BigDecimal min;
	private long count;
}
