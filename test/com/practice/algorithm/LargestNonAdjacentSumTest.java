package com.practice.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestNonAdjacentSumTest {
	
	@Test
	public void test_1() {
		int[] input = {2, 4, 6, 2, 5};
		int output = LargestNonAdjacentSum.largestNonAdjacentSum(input);
		int expectedOutput = 13;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_2() {
		int[] input = {5, 1, 1, 5};
		int output = LargestNonAdjacentSum.largestNonAdjacentSum(input);
		int expectedOutput = 10;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_3() {
		int[] input = {5, 5, 10, 100, 10, 5};
		int output = LargestNonAdjacentSum.largestNonAdjacentSum(input);
		int expectedOutput = 110;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_1_solution() {
		int[] input = {2, 4, 6, 2, 5};
		int output = LargestNonAdjacentSum.largestNonAdjacentSum_solution(input);
		int expectedOutput = 13;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_2_solution() {
		int[] input = {5, 1, 1, 5};
		int output = LargestNonAdjacentSum.largestNonAdjacentSum_solution(input);
		int expectedOutput = 10;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_3_solution() {
		int[] input = {5, 5, 10, 100, 10, 5};
		int output = LargestNonAdjacentSum.largestNonAdjacentSum_solution(input);
		int expectedOutput = 110;
		assertEquals(expectedOutput, output);
	}
	

}
