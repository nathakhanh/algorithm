package com.practice.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PhudithLongestSubstringTest {
	@Test
	public void test_1() {
		String s = "abcba";
		int k = 2;
		String expectedOutput = "bcb";
		String output = PhudithLongestSubstring.bruteForce(s, k);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_2() {
		String s = "abcba";
		int k = 3;
		String expectedOutput = "abcba";
		String output = PhudithLongestSubstring.bruteForce(s, k);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_3() {
		String s = "paara";
		int k = 2;
		String expectedOutput = "aara";
		String output = PhudithLongestSubstring.bruteForce(s, k);
		assertEquals(expectedOutput, output);
	}
}
