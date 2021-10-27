package io.github.maxwelsantana.travelsjavaapi.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.maxwelsantana.travelsjavaapi.model.Statistic;
import io.github.maxwelsantana.travelsjavaapi.model.Travel;
import io.github.maxwelsantana.travelsjavaapi.service.StatisticService;
import io.github.maxwelsantana.travelsjavaapi.service.TravelService;

@RestController
@RequestMapping("/api-travels/statistics")
public class StatisticController {
	private static final Logger logger = Logger.getLogger(StatisticController.class);

	@Autowired
	private TravelService travelService;

	@Autowired
	private StatisticService statisticsService;

	@GetMapping(produces = { "application/json" })
	public ResponseEntity<Statistic> getStatistics() {

		List<Travel> travels = travelService.find();
		Statistic statistics = statisticsService.create(travels);

		logger.info(statistics);

		return ResponseEntity.ok(statistics);
	}
}
