package com.practice.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveDuplicatesTest {

	@Test
	public void test_1() {
		int[] nums = {1,1,2};
		int length = RemoveDuplicates.removeDuplicates(nums);
		assertEquals(2, length);
	}
	
	@Test
	public void test_2() {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int length = RemoveDuplicates.removeDuplicates(nums);
		assertEquals(5, length);
	}
	
	@Test
	public void test_3() {
		int[] nums = {1,1};
		int length = RemoveDuplicates.removeDuplicates(nums);
		assertEquals(1, length);
	}
	
	@Test
	public void test_4() {
		int[] nums = {1,1,2};
		int length = RemoveDuplicates.removeDuplicates2(nums);
		assertEquals(2, length);
	}
	
	@Test
	public void test_5() {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int length = RemoveDuplicates.removeDuplicates2(nums);
		assertEquals(5, length);
	}
	
	@Test
	public void test_6() {
		int[] nums = {1,1};
		int length = RemoveDuplicates.removeDuplicates2(nums);
		assertEquals(1, length);
	}
}
