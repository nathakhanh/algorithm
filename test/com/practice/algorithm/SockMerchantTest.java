package com.practice.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SockMerchantTest {
	
	@Test
	public void test_1() {
		int n = 7;
		int[] ar = { 1,2,1,2,1,3,2 };
		int expectedOutput = 2;
		
		int output = SockMerchant.getTotalSockPair(n, ar);
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_2() {
		int n = 9;
		int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		int expectedOutput = 3;
		
		int output = SockMerchant.getTotalSockPair(n, ar);
		
		assertEquals(expectedOutput, output);
	}

}
