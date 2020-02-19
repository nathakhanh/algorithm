package com.practice.algorithm;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Chapter1Test {
	@Test
	public void test_1_1_1() {
		String s = "cbcd";
		boolean output = Chapter1.isUnique(s);
		assertFalse(output);
	}
	
	@Test
	public void test_1_1_2() {
		String s = "aaaa";
		boolean output = Chapter1.isUnique(s);
		assertFalse(output);
	}
	
	@Test
	public void test_1_1_3() {
		String s = "aaac";
		boolean output = Chapter1.isUnique(s);
		assertFalse(output);
	}
	
	@Test
	public void test_1_1_4() {
		String s = "aabbccdd";
		boolean output = Chapter1.isUnique(s);
		assertFalse(output);
	}
	
	@Test
	public void test_1_2_1() {
		String s1 = "abcd";
		String s2 = "bcda";
		boolean output = Chapter1.isPermutation(s1, s2);
		assertTrue(output);
	}
	
	@Test
	public void test_1_2_2() {
		String s1 = "abcd";
		String s2 = "bcde";
		boolean output = Chapter1.isPermutation(s1, s2);
		assertFalse(output);
	}
	
	@Test
	public void test_1_2_3() {
		String s1 = "abcde";
		String s2 = "bcda";
		boolean output = Chapter1.isPermutation(s1, s2);
		assertFalse(output);
	}
	
	@Test
	public void test_1_2_4() {
		String s1 = "abcd";
		String s2 = "bcda";
		boolean output = Chapter1.isPermutation2(s1, s2);
		assertTrue(output);
	}
	
	@Test
	public void test_1_2_5() {
		String s1 = "abcd";
		String s2 = "bcde";
		boolean output = Chapter1.isPermutation2(s1, s2);
		assertFalse(output);
	}
	
	@Test
	public void test_1_2_6() {
		String s1 = "abcde";
		String s2 = "bcda";
		boolean output = Chapter1.isPermutation2(s1, s2);
		assertFalse(output);
	}
	
	@Test
	public void test_1_4_1() {
		String s = "tacocat";
		boolean output = Chapter1.isPermutationPalindrome(s);
		assertTrue(output);
	}
	
	@Test
	public void test_1_4_2() {
		String s = "test";
		boolean output = Chapter1.isPermutationPalindrome(s);
		assertFalse(output);
	}
	

	@Test
	public void test_1_4_3() {
		String s = "tacocat";
		boolean output = Chapter1.isPermutationPalindrome2(s);
		assertTrue(output);
	}
	
	@Test
	public void test_1_4_4() {
		String s = "test";
		boolean output = Chapter1.isPermutationPalindrome2(s);
		assertFalse(output);
	}
	
	@Test
	public void test_1_4_5() {
		String s = "zabtbaz";
		boolean output = Chapter1.isPermutationPalindrome2(s);
		assertTrue(output);
	}
	
	@Test
	public void test_1_5_1() {
		String s1 = "pale";
		String s2 = "ple";
		boolean output = Chapter1.isOneAway(s1, s2);
		assertTrue(output);
	}
	
	@Test
	public void test_1_5_2() {
		String s1 = "pales";
		String s2 = "pale";
		boolean output = Chapter1.isOneAway(s1, s2);
		assertTrue(output);
	}
	
	@Test
	public void test_1_5_3() {
		String s1 = "pale";
		String s2 = "bale";
		boolean output = Chapter1.isOneAway(s1, s2);
		assertTrue(output);
	}
	
	@Test
	public void test_1_5_4() {
		String s1 = "pale";
		String s2 = "bake";
		boolean output = Chapter1.isOneAway(s1, s2);
		assertFalse(output);
	}
	
	@Test
	public void test_1_6_1() {
		String s = "aabcccccaaa";
		String expectedOutput = "a2b1c5a3";
		String output = Chapter1.stringCompression(s);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_1_6_2() {
		String s = "abcdefg";
		String expectedOutput = "abcdefg";
		String output = Chapter1.stringCompression(s);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_1_7_1() {
		int[][] matrix = {{1,2,3,4}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
		boolean output = Chapter1.rotateMatrix(matrix);
		assertTrue(output);
	}
	
	@Test
	public void test_1_7_2() {
		int[][] matrix = {{1,2,3,4}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
		boolean output = Chapter1.rotateMatrix(matrix);
		assertFalse(output);
	}
	
	@Test
	public void test_1_8_1() {
		int[][] matrix = {{1,0,3,4}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
		int[][] expectedOutput = {{0,0,0,0},{1,0,3,4},{1,0,3,4},{1,0,3,4}};
		int[][] output = Chapter1.zeroMatrix(matrix);
		assertArrayEquals(expectedOutput, output);
	}
	
	@Test
	public void test_1_8_2() {
		int[][] matrix = {{1,0,3,4}, {1,2,3,0}, {1,2,3,4}, {1,2,3,4}};
		int[][] expectedOutput = {{0,0,0,0},{0,0,0,0},{1,0,3,0},{1,0,3,0}};
		int[][] output = Chapter1.zeroMatrix(matrix);
		assertArrayEquals(expectedOutput, output);
	}
	
	@Test
	public void test_1_9_1() {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		boolean output = Chapter1.stringRotation(s1,s2);
		assertTrue(output);
	}



}
