package com.practice.algorithm;

import java.util.function.Function;

/*Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Input: [-2],
Output: -2

Input: [-2,1],
Output: 1

Input: [-1,-2],
Output: -1
*/
public class MaxSubArray {
	
	//brute force
	public static int maxSubArray(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int sum = Integer.MIN_VALUE;
		for(int i = 0; i < nums.length; i++) {
            int runningSum = 0;
			for(int j = i; j < nums.length; j++) {
				runningSum += nums[j];
				if(runningSum > sum) {
					sum = runningSum;
				}
			}
		}
        return sum;
    }
	
	public static int maxSubArray_kadane(int[] nums) {
		int maxSoFar = Integer.MIN_VALUE;
		int maxEndingHere = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > maxEndingHere + nums[i]) {
				maxEndingHere = nums[i];
			} else {
				maxEndingHere += nums[i];
			}
			
			if(maxEndingHere > maxSoFar) {
				maxSoFar = maxEndingHere;
			}
			
		}
		return maxSoFar;
	}
	
	public static void main(String[] args) {
		test((e) -> maxSubArray(e), new int[]{-2,1,-3,4,-1,2,1,-5,4}); //6
		test((e) -> maxSubArray(e), new int[]{-2}); //-2
		test((e) -> maxSubArray(e), new int[]{-2,1}); //1
		test((e) -> maxSubArray(e), new int[]{-1,-2}); //-1
		
		//test kadane method
		test((e) -> maxSubArray_kadane(e), new int[]{-2,1,-3,4,-1,2,1,-5,4}); //6
		test((e) -> maxSubArray_kadane(e), new int[]{-2}); //-2
		test((e) -> maxSubArray_kadane(e), new int[]{-2,1}); //1
		test((e) -> maxSubArray_kadane(e), new int[]{-1,-2}); //-1
	}
	
	private static void test(Function<int[], Integer> func, int[] nums) {
		int sum = func.apply(nums);
		System.out.println(sum);
	}
}
