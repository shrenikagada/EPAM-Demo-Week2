package com.test.houseprice;

public class CalculateHousePrice {
	public int HousePriceCalculator(int area,int materialStandard , boolean fullyAutomated) {
		if(materialStandard == 1) {
			return 1200*area;
		} else if(materialStandard == 2) {
			return 1500*area;
		} else if(materialStandard == 3 && fullyAutomated) {
			return 2500*area;
		} else {
			return 1800*area;
		}
	}
}