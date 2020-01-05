package com.practice.algorithm;

/* Given a list of integers, write a function that returns the largest sum of 
 * non-adjacent numbers. Numbers can be 0 or negative
 * 
 * For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5.
 * [5, 1, 1, 5] should return 10, since we pick 5 and 5
 * 
 * Bonus: can you do this in O(n) time?
 * 
 */
public class LargestNonAdjacentSum {
	
	//Time complexity - O(n) Space complexity - O(n)
	public static int largestNonAdjacentSum(int[] input) {
		if (input.length < 3) {
			return 0;
		}
		
		//compute odd sum
		int oddSum = 0;
		for (int i = 0, j = 1; j <= input.length; i += 2, j = i + 1) {
			if (i == 0 || i == input.length-1 || input[i] >= input[j]) {
				oddSum += input[i];
			} else {
				oddSum += input[j];
				i = j;		
			}
			
		}
		
		//compute even sum
		int evenSum = 0;
		for (int i = 1, j = 2; j <= input.length; i += 2, j = i + 1) {
			if (i == 1 || i == input.length-1 || input[i] >= input[j]) {
				evenSum += input[i];
			} else {
				evenSum += input[j];
				i = j;		
			}
		}
		
		return oddSum > evenSum ? oddSum : evenSum;
	}
	
	//2,4,6,2,5
	//5,1,1,5
	//5,5,10,100,10,5
	public static int largestNonAdjacentSum_solution(int arr[]) { 
        int include = arr[0]; 
        int exclude = 0; 
        int excludeTemp; 
  
        for (int i = 1; i < arr.length; i++) { 
            /* current max excluding i */
        	excludeTemp = (include > exclude) ? include : exclude; 
  
            /* current max including i */
        	include = exclude + arr[i]; 
        	exclude = excludeTemp; 
        } 
  
        /* return max of incl and excl */
        return ((include > exclude) ? include : exclude); 
    } 

}
