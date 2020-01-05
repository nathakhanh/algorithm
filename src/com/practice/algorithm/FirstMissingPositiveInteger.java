package com.practice.algorithm;

import java.util.Arrays;
import java.util.Hashtable;

/* Given an array of integers, find the first missing positive integer. 
 * In other words, find the lowest positive integer that does not exist
 * in the array. The array can contain duplicates and negative numbers as well.
 * 
 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] 
 * should give 3.
 * 
 * Bonus: find solution in O(n) time
 * */

public class FirstMissingPositiveInteger {
	
	// Time complexity - O(n) in most cases unless elements were hashed in the same key
	public static int firstMissingPositiveInteger(int[] input) {
		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				table.put(input[i], input[i]);
			}
		}
		
		for (int i = 1; i <= input.length; i++) {
			if (table.get(i) == null) {
				return i;
			}
		}
		return input.length + 1;
	}
	
	public static int getMissingNumber_Ankit(int[] a) {
        int sum = 0;
        int n = a.length;
        for (int i = 0; i < a.length; i++) {
          if(a[i] > 0){
            sum += a[i];
          }
        }
        return (n * n + n) / 2 - sum;
    }
	
	public static int findInteger_Sindhu(int[] numArray) {
        int length = numArray.length;
        int result = 0;
        Arrays.sort(numArray);
        for (int i = 0; i < length - 1; i++) {
            if (numArray[i] > 0 && numArray[i + 1] != numArray[i]
                    && numArray[i + 1] != numArray[i] + 1) {
                result = numArray[i] + 1;
            }
        }
        if (result == 0)
            result = numArray[length - 1] + 1;
        return result;
    }
	
	public static int firstMissingPositiveInteger_Brandon (int[] input) {
        int lowestInt = input[0];
        int highestInt = input[0];
        boolean ansFound = false;
        int answer = 0;
        
        for (int i = 0; i < input.length; i++) {
            int num = input[i];
                    
            if (num < 0)
                continue;
            if (num > highestInt)
                highestInt = num;
            else if (num < lowestInt && lowestInt - num > 1) {
                    lowestInt = num;
                    ansFound = true;
            }
        }
        
        if (!ansFound)
            answer = highestInt + 1;
        else        
            answer = lowestInt + 1;
        
        return answer;
    }

}
