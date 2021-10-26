package io.github.maxwelsantana.travelsjavaapi.factory;

import io.github.maxwelsantana.travelsjavaapi.model.Travel;

public interface TravelFactory {
	Travel createTravel(String type);
}
