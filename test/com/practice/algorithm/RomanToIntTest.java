package com.practice.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanToIntTest {
	@Test
	public void test_1() {
		String s = "III";
		int output = RomanToInt.romanToInt(s);
		assertEquals(3,output);
	}
	
	@Test
	public void test_2() {
		String s = "IV";
		int output = RomanToInt.romanToInt(s);
		assertEquals(4,output);
	}
	
	@Test
	public void test_3() {
		String s = "IX";
		int output = RomanToInt.romanToInt(s);
		assertEquals(9,output);
	}
	
	@Test
	public void test_4() {
		String s = "LVIII";
		int output = RomanToInt.romanToInt(s);
		assertEquals(58,output);
	}
	
	@Test
	public void test_5() {
		String s = "MCMXCIV";
		int output = RomanToInt.romanToInt(s);
		assertEquals(1994,output);
	}
}
