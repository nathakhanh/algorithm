package com.practice.algorithm;

/*Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 4:

Input: [1,3,5,6], 0
Output: 0*/
public class SearchInsert {
	public static int searchInsert(int[] nums, int target) {
        if(nums.length == 0) {
            return 0;
        }
        
        if(nums.length == 1) {
            if(nums[0] == target || nums[0] > target) {
                return 0;
            } else {
                return 1;
            }
        }
        
        for(int i = 0, j = 1; i < nums.length; i++,j++) {
            if(i == 0 && nums[i] > target) {
                return i;
            }
            
            if(nums[i] == target) {
                return i;
            }
            
            if(i == nums.length-1) {
                return i+1;
            }
            
            if(nums[i] < target && nums[j] > target) {
                return j;
            }
        }
        return 0;
    }
	
	public static void main(String[] args) {
		test(new int[]{1,3,5,6}, 5);
		test(new int[]{1,3,5,6}, 2);
		test(new int[]{1,3,5,6}, 7);
		test(new int[]{1,3,5,6}, 0);
	}
	
	public static void test(int[] nums, int target) {
		int output = searchInsert(nums, target);
		System.out.println(output);
	}
}
