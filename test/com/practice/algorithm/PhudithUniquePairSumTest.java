package com.practice.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PhudithUniquePairSumTest {
	@Test
	public void test_1() {
		int[] input = {1,2,3};
		int expectedOutput = 2;
		int output = PhudithUniquePairSum.bruteForce(1, input);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_2() {
		int[] input = {1,3,2,5,6,5,4,3,1};
		int expectedOutput = 5;
		int output = PhudithUniquePairSum.bruteForce(1, input);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_3() {
		int[] input = {1,1,1,4,4,4,6,6,6,1,1,3,3,2,2,6,6,4,7};
		int expectedOutput = 3;
		int output = PhudithUniquePairSum.bruteForce(2, input);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_4() {
		int[] input = {1,1,1,4,4,4,6,6,6,1,1,3,3,2,2,6,6,4,7};
		int expectedOutput = 3;
		int output = PhudithUniquePairSum.optimized(2, input);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_5() {
		int[] input = {1,3,2,5,6,5,4,3,1};
		int expectedOutput = 5;
		int output = PhudithUniquePairSum.optimized(1, input);
		assertEquals(expectedOutput, output);
	}
	

}
