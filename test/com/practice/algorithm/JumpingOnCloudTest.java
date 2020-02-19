package com.practice.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JumpingOnCloudTest {

	@Test
	public void test_1() {
		int[] path = { 0,1,0,0,0,1,0};
		int expectedOutput = 3;
		int output = JumpingOnCloud.getMinimumJumps(path);
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_2() {
		int[] path = { 0,0,1,0,0,1,0};
		int expectedOutput = 4;
		int output = JumpingOnCloud.getMinimumJumps(path);
		
		assertEquals(expectedOutput, output);
	}
	
}
