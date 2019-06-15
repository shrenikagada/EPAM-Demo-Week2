package com.epam.tests;

import com.epam.pep.RemoveCharacterA;

import static org.junit.Assert.*;

import org.junit.Test;
public class RemoveCharacterATest {
	
	@Test
	public void testcase1() {
		RemoveCharacterA removedata = new RemoveCharacterA();
		String actual = removedata.remove("ABCD");
		assertEquals("BCD",actual);
	}
	@Test
	public void testcase2() {
		RemoveCharacterA removedata = new RemoveCharacterA();
		String actual = removedata.remove("AACD");
		assertEquals("CD",actual);
	}
	@Test
	public void testcase3() {
		RemoveCharacterA removedata = new RemoveCharacterA();
		String actual = removedata.remove("BACD");
		assertEquals("BCD",actual);
	}
	@Test
	public void testcase4() {
		RemoveCharacterA removedata = new RemoveCharacterA();
		String actual = removedata.remove("BBAA");
		assertEquals("BBAA",actual);
	}
	@Test
	public void testcase5() {
		RemoveCharacterA removedata = new RemoveCharacterA();
		String actual = removedata.remove("AABAA");
		assertEquals("BAA",actual);
	}
}
