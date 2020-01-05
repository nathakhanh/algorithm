package com.practice.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IsPrimeTest {
	
	@Test
	public void test_1() {
		assertEquals(false, IsPrime.isPrime(1));
		assertEquals(true, IsPrime.isPrime(2));
		assertEquals(true, IsPrime.isPrime(3));
		assertEquals(false, IsPrime.isPrime(4));
		assertEquals(true, IsPrime.isPrime(5));
		assertEquals(false, IsPrime.isPrime(6));
		assertEquals(true, IsPrime.isPrime(7));
		assertEquals(false, IsPrime.isPrime(8));
		assertEquals(false, IsPrime.isPrime(9));
		assertEquals(false, IsPrime.isPrime(10));
		assertEquals(true, IsPrime.isPrime(11));
		assertEquals(false, IsPrime.isPrime(36));
	}

}
