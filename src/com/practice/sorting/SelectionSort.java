package com.practice.sorting;

//https://www.geeksforgeeks.org/selection-sort/
public class SelectionSort {
	private static void sort(int[] nums) {		
		for(int i = 0; i < nums.length-1; i++) {
			int minIndex = i;
			for(int j = i+1; j < nums.length; j++) {
				if(nums[j] < nums[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = temp;
			
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
