package com.test.calculate;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTesting {

	
	@Test
	public void test() {
		//fail("Not yet implemented");
		Calculator calci = new Calculator();
		int output = calci.testCalculator(5,7,'+');
		assertEquals(12,output);
		assertEquals(60,calci.testCalculator(12, 5, '*'));
		assertEquals(4,calci.testCalculator(16, 4, '/'));
		assertEquals(-1,calci.testCalculator(12, 5, '-'));
		assertEquals(2,calci.testCalculator(17, 8, '/'));
	}

}
