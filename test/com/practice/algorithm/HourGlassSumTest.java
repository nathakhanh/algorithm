package com.practice.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HourGlassSumTest {
	
	@Test
	public void test_1() {
		int[][] m = new int[][] {{1,1,1,0,0}, {0,1,0,0,0}, {1,1,1,0,0}, {0,0,0,0,0}, {0,0,0,0,0}};
		int sum = HourGlassSum.getHourGlassSum(m);
		assertEquals(7, sum);
	}
	
	@Test
	public void test_2() {
		int[][] m = new int[][] {{0,3,0,0,0}, {0,1,0,0,0}, {1,1,1,0,0}, {0,0,2,4,4}, {0,0,0,2,4}};
		int sum = HourGlassSum.getHourGlassSum(m);
		assertEquals(11, sum);
	}

}
