package com.practice.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumerOfInfiniteStringTest {
	
	@Test
	public void test_1() {
		String s = "abcac";
		int n = 10;
		int expectedOutput = 4;
		assertEquals(expectedOutput, PhudithNumberOfA.printNumberOfA(n, s));
	}
	
	@Test
	public void test_2() {
		String s = "a";
		long n = 1000000000;
		long expectedOutput = 1000000000;
		assertEquals(expectedOutput, PhudithNumberOfA.printNumberOfA_InspiredByPrasad(n, s));
	}
	
	@Test
	public void test_3() {
		String s = "abcaaaaaaaaaaaa";
		long n = 5;
		long expectedOutput = 3;
		assertEquals(expectedOutput, PhudithNumberOfA.printNumberOfA_InspiredByPrasad(n, s));
	}
	
	@Test
	public void test_4() {
		String s = "abcaa";
		long n = 10;
		long expectedOutput = 6;
		assertEquals(expectedOutput, PhudithNumberOfA.printNumberOfA_InspiredByPrasad(n, s));
	}
	
	
}
