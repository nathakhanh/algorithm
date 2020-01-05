package com.practice.algorithm;

import java.util.Arrays;
import java.util.List;

/* Given a list of numbers and a number k, return whether any two numbers 
 * from the list add up to k
 * 
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17 
 * 
 * Bonus: can you do this in less than O(n^2) time complexity? 
 * */

public class TargetSum {
	
	//This algorithm takes O(nlogn) time complexity since the sorting takes O(nlogn) time
	public static boolean targetSum(int[] input, int k) {
		if (input.length == 0 || input.length == 1) {
			return false;
		}
		
		int l = 0;
		int r = input.length-1;
		
		Arrays.sort(input);
		
		while (l < r) {
			if (input[l] + input[r] == k) {
				return true;
			} else if (input[l] + input[r] < k) {
				l++;
			} else {
				r--;
			}
		}
		
		return false;
	}
	
	// This algorithm takes O(n^2) since list.contains takes O(n) by itself and 
	// it is nested inside a for loop
	public static boolean sindhu_isValidList(List<Integer> list, int k) {
        int size = list.size();
        if (size == 0 || list.isEmpty()) {
            return false;
        }
        int temp = 0;
        for (int value : list) {
            temp = k - value;
             if(list.contains(temp)) {
                 return true;
             }
            
        }
        return false;
    }
}

