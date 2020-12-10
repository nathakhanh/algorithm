package com.practice.algorithm;

import java.util.function.BiFunction;

/*Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: [-1,-100,3,99] and k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
Note:

Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?
*/
public class ArrayRotation {
	public static int[] rotate(int[] nums, int k) {
        if(nums.length == 0 || nums.length == 1) {
            return nums;
        }
        
        int rotateBy = k%nums.length;
        if (rotateBy == 0) {
            return nums;
        }
        
        int[] temp = new int[nums.length-rotateBy];
        
        //temp = [1,2,3,4]
        for(int i = 0; i < nums.length-rotateBy; i++) {
            temp[i] = nums[i];
        }
        
        int index = 0;
        
        //nums = [5,6,7,4,5,6,7]
        for(int i = nums.length-rotateBy; i < nums.length; i++) {
            nums[index] = nums[i];
            index++;
        }
        
        //nums = [5,6,7,1,2,3,4]
        for(int i = 0; i < temp.length; i++) {
            nums[index] = temp[i];
            index++;   
        }
        
        return nums;
    }
	
	public static int[] rotate_cyclic(int[] nums, int k) {
		k = k % nums.length;
		int count = 0;
		for (int start = 0; count < nums.length; start++) {
			int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
	        } while (start != current);
	    }
	    return nums;
	}
	
	public static void main(String... args) {
		test((a, b) -> rotate(a,b), new int[] {1,2,3,4,5,6,7}, 3);
		test((a, b) -> rotate(a,b), new int[] {1,2}, 3);
		test((a, b) -> rotate_cyclic(a,b), new int[] {1,2,3,4,5,6,7}, 3);
		test((a, b) -> rotate_cyclic(a,b), new int[] {1,2}, 3);
	}
	
	private static void test(BiFunction<int[], Integer, int[]> func, int[] nums, int k) {
		int[] output = func.apply(nums, k);
		for(int i : output) {
			System.out.print(i);		
		}
		System.out.println();
	}
}


