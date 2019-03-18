package com.test.sici;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTesting {

	@Test
	public void test() {
		//fail("Not yet implemented");
		SimpleCompound sc = new SimpleCompound();
		assertEquals(2000,sc.SimpleInterestCalculator(10000, 4, 5));
		assertEquals(122019,sc.CompoundInterestCalculator(100000, 0.04, 5, 4));
	}

}
