package com.practice.sorting;

//Use as a template when creating new file
public class Template {
	private static void sort(int[] nums) {		
		//implementation goes here
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
