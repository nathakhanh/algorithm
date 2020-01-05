package com.practice.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstMissingPositiveIntegerTest {
	
	@Test
	public void test_1() {
		int[] input = {3, 4, -1, 1};
		int output = FirstMissingPositiveInteger.firstMissingPositiveInteger(input);
		int expectedOutput = 2;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_2() {
		int[] input = {1, 2, 0};
		int output = FirstMissingPositiveInteger.firstMissingPositiveInteger(input);
		int expectedOutput = 3;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_3() {
		int[] input = {-2,-4,-6,5,7,9};
		int output = FirstMissingPositiveInteger.firstMissingPositiveInteger(input);
		int expectedOutput = 1;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_1_Ankit() {
		int[] input = {1, 2, 0};
		int output = FirstMissingPositiveInteger.getMissingNumber_Ankit(input);
		int expectedOutput = 3;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_2_Ankit() {
		int[] input = {3, 4, -1, 1};
		int output = FirstMissingPositiveInteger.getMissingNumber_Ankit(input);
		int expectedOutput = 2;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_3_Ankit() {
		int[] input = {-2,-4,-6,5,7,9};
		int output = FirstMissingPositiveInteger.getMissingNumber_Ankit(input);
		int expectedOutput = 1;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_1_Sindhu() {
		int[] input = {1, 2, 0};
		int output = FirstMissingPositiveInteger.findInteger_Sindhu(input);
		int expectedOutput = 3;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_2_Sindhu() {
		int[] input = {3, 4, -1, 1};
		int output = FirstMissingPositiveInteger.findInteger_Sindhu(input);
		int expectedOutput = 2;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_3_Sindhu() {
		int[] input = {-2, -4, -6, 5, 7, 9};
		int output = FirstMissingPositiveInteger.findInteger_Sindhu(input);
		int expectedOutput = 1;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_1_Brandon() {
		int[] input = {1, 2, 0};
		int output = FirstMissingPositiveInteger.firstMissingPositiveInteger_Brandon(input);
		int expectedOutput = 3;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_2_Brandon() {
		int[] input = {3, 4, -1, 1};
		int output = FirstMissingPositiveInteger.firstMissingPositiveInteger_Brandon(input);
		int expectedOutput = 2;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_3_Brandon() {
		int[] input = {-2, -4, -6, 5, 7, 9};
		int output = FirstMissingPositiveInteger.firstMissingPositiveInteger_Brandon(input);
		int expectedOutput = 1;
		assertEquals(expectedOutput, output);
	}

}
