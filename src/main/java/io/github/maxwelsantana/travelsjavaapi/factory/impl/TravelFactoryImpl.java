package io.github.maxwelsantana.travelsjavaapi.factory.impl;

import io.github.maxwelsantana.travelsjavaapi.enumeration.TravelTypeEnum;
import io.github.maxwelsantana.travelsjavaapi.factory.TravelFactory;
import io.github.maxwelsantana.travelsjavaapi.model.Travel;

public class TravelFactoryImpl implements TravelFactory {
	
	@Override
	public Travel createTravel(String type) {
		
		if (TravelTypeEnum.ONE_WAY.getValue().equals(type)) {
			return new Travel(TravelTypeEnum.ONE_WAY);
		} else if (TravelTypeEnum.MULTI_CITY.getValue().equals(type)) {
			return new Travel(TravelTypeEnum.MULTI_CITY); 
		}
		
		return new Travel(TravelTypeEnum.RETURN);
	}
}
