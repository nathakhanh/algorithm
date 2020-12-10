package com.practice.sorting;


public class BubbleSortRecursion {
	private static void sort(int[] nums) {		
		sort_recursive(nums, nums.length);
	}
	
	private static void sort_recursive(int[] nums, int length) {
		if(length == 1) {
			return;
		}
		
		for(int i = 0; i < length-1; i++) {
			if(nums[i+1] < nums[i]) {
				int temp = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = temp;
			}
		}
		
		sort_recursive(nums, length-1);
	}
	
	private static void print(int[] nums) {
		for(int num : nums) {
			System.out.println(num);
		}
		System.out.println();
	}
	
	private static void test(int[] nums) {
		sort(nums);
		print(nums);
	}
	
	public static void main(String... args) {
		test(new int[] {64,25,12,22,11});
		test(new int[] {1,3,1,2,3,2,1});	
	}
}
