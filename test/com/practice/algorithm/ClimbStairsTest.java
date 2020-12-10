package com.practice.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClimbStairsTest {

	@Test
	public void test_1() {
		int n = 4;
		int output = ClimbStairs.nStaircase(n);
		int expectedOutput = 5;
		
		assertEquals(output, expectedOutput);
	}
}
