package com.practice.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PhudithMaxToyTest {
	@Test
	public void test_1() {
		int[] prices = {1,2,3,4};
		int budget = 7;
		int expectedOutput = 3;
		int output = PhudithMaxToy.getMaxToy(prices, budget);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_2() {
		int[] prices = {1,12,5,111,200,1000,10};
		int budget = 50;
		int expectedOutput = 4;
		int output = PhudithMaxToy.getMaxToy(prices, budget);
		assertEquals(expectedOutput, output);
	}

}
