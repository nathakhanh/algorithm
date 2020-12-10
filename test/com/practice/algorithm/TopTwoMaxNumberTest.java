package com.practice.algorithm;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TopTwoMaxNumberTest {
	@Test
	public void test_1() {
		int[] input = new int[] { 15, 30, 45, 90, 120 };
		int[] expectedOutput = new int[] {120, 90};
		int[] output = TopTwoMaxNumber.getTwoMaxNumber(input);
		assertArrayEquals(expectedOutput, output);
	}
	
	@Test
	public void test_2() {
		int[] input = new int[] { 25, 2, 50, 5, 25, 90, 85, 90, 3, 100 };
		int[] expectedOutput = new int[] {100, 90};
		int[] output = TopTwoMaxNumber.getTwoMaxNumber(input);
		assertArrayEquals(expectedOutput, output);
	}
	
	@Test
	public void test_3() {
		int[] input = new int[] { 0, 1, 1, 0 };
		int[] expectedOutput = new int[] { 1, 0 };
		int[] output = TopTwoMaxNumber.getTwoMaxNumber(input);
		assertArrayEquals(expectedOutput, output);
	}
}
