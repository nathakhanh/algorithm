package com.practice.algorithm;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TargetSumTest {
	
	@Test
	public void test_1() {
		int[] inputArray = {10, 15, 3, 7};
		int k = 13;
		boolean output = TargetSum.targetSum(inputArray, k);
		assertTrue(output);
	}
	
	@Test
	public void test_2() {
		int[] inputArray = {};
		int k = 17;
		boolean output = TargetSum.targetSum(inputArray, k);
		assertFalse(output);
	}
	
	@Test
	public void test_3() {
		int[] input = {17};
		int k = 17;
		boolean output = TargetSum.targetSum(input, k);
		assertFalse(output);
	}
	
	@Test
	public void test_4() {
		int[] inputArray = {-3, -4, -5, -6};
		int k = -7;
		boolean output = TargetSum.targetSum(inputArray, k);
		assertTrue(output);
	}
	
	@Test
	public void test_1_sindhu() {
		Integer[] inputArray = new Integer[]{10, 15, 3, 7};
		List<Integer> inputList = Arrays.asList(inputArray);
		int k = 13;
		boolean output = TargetSum.sindhu_isValidList(inputList, k);
		assertTrue(output);
	}
	
	@Test
	public void test_2_sindhu() {
		Integer[] inputArray = new Integer[]{-3, -4, -5, -6};
		List<Integer> inputList = Arrays.asList(inputArray);
		int k = -7;
		boolean output = TargetSum.sindhu_isValidList(inputList, k);
		assertTrue(output);
	}

}
