package com.practice.algorithm;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PhudithShiftedArrayTest {
	@Test
	public void test_1() {
		int[] a = {1,2,3,4,5};
		int d = 2;
		int[] expectedOutput = {3,4,5,1,2};
		int[] output = PhudithShiftedArray.shiftArray(a, d);
		assertArrayEquals(expectedOutput, output);
	}
	
	@Test
	public void test_2() {
		int[] a = {1,2,3,4,5};
		int d = 4;
		int[] expectedOutput = {5,1,2,3,4};
		int[] output = PhudithShiftedArray.shiftArray(a, d);
		assertArrayEquals(expectedOutput, output);
	}

}
