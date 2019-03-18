package com.test.houseprice;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTesting {

	@Test
	public void test() {
		//fail("Not yet implemented");
		CalculateHousePrice price = new CalculateHousePrice();
		assertEquals(540000,price.HousePriceCalculator(450, 1, false));
		assertEquals(135000,price.HousePriceCalculator(90, 2, false));
		assertEquals(360000,price.HousePriceCalculator(200, 3, false));
		assertEquals(500000,price.HousePriceCalculator(200, 3, true));
	}

}
