package com.practice.sorting;

//https://www.geeksforgeeks.org/bubble-sort/
public class BubbleSort {
	private static void sort(int[] nums) {		
		boolean keepGoing = true;
		int numPass = 0;
		
		while(keepGoing) {
			keepGoing = false;
			for(int i = 0; i < nums.length-1-numPass; i++) {
				if(nums[i+1] < nums[i]) {
					int temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
					keepGoing = true;
				}
			}
			numPass++;
		}
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
