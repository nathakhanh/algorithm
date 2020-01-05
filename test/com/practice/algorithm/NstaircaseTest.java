package com.practice.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NstaircaseTest {

	@Test
	public void test_1() {
		int n = 4;
		int output = NStaircase.nStaircase(n);
		int expectedOutput = 5;
		
		assertEquals(output, expectedOutput);
	}
}
