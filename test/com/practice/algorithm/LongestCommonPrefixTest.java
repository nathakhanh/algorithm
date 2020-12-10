package com.practice.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestCommonPrefixTest {
	@Test
	public void test_1() {
		String[] strs = {"flower","flow","flight"};
		assertEquals("fl", LongestCommonPrefix.getLongestCommonPrefix(strs));
	}
	
	@Test
	public void test_2() {
		String[] strs = {"dog","racecar","car"};
		assertEquals("", LongestCommonPrefix.getLongestCommonPrefix(strs));
	}
	
	@Test
	public void test_3() {
		String[] strs = {"flower","flow","flight"};
		assertEquals("fl", LongestCommonPrefix.getLongestCommonPrefix2(strs));
	}
	
	@Test
	public void test_4() {
		String[] strs = {"dog","racecar","car"};
		assertEquals("", LongestCommonPrefix.getLongestCommonPrefix2(strs));
	}
}
