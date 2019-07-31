package com.practice.algorithm;

import java.util.Arrays;
import java.util.List;

public class TargetSum {
	
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

