package com.practice.algorithm;

import java.util.Arrays;

/*Given a sorted array nums, remove the duplicates in-place such that each element 
 * appear only once and return the new length.

Do not allocate extra space for another data structure, you must do this by modifying the input 
array in-place with O(1) extra memory.

Example:
input: [1,1,2]
output: 2

input: [0,0,1,1,1,2,2,3,3,4]
output: 5
*/
public class RemoveDuplicates {
	
	//O(nlogn) where n is the length of input nums
	public static int removeDuplicates(int[] nums) {
        for(int i = 0, j = 1; i < nums.length-1; i++,j++) {
        	if(nums[i] == nums[j]) {
        		nums[i] = Integer.MAX_VALUE;
        	}
        }
        
        Arrays.sort(nums);
        
        int length = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != Integer.MAX_VALUE) {
                length++;
            }
        }
        return length;
    }
	
	//O(n) where n is the length of input nums
	public static int removeDuplicates2(int[] nums) {
		int i = 0;
		for(int j = 1; j < nums.length; j++) {
			if(nums[i] != nums[j]) {
				nums[i+1] = nums[j];
				i++;
			}
		}
		return i+1;
		
	}

}
