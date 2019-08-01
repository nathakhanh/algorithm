package com.practice.algorithm;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayProductTest {
	
	@Test
	public void test_1() {
		int[] input = {1, 2, 3, 4, 5};
		int[] output = ArrayProduct.arrayProduct(input);
		int[] expectedOutput = {120, 60, 40, 30, 24};
		
		assertArrayEquals(output, expectedOutput);
	}
	
	@Test
	public void test_2() {
		int[] input = {3, 2, 1};
		int[] output = ArrayProduct.arrayProduct(input);
		int[] expectedOutput = {2, 3, 6};
		
		assertArrayEquals(output, expectedOutput);
	}

}
