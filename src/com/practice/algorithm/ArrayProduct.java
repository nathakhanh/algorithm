package com.practice.algorithm;

/* Given an array of intergers, return a new array such that each element 
 * at index i of the new array is the product of all the numbers in the original
 * array except the one at i 
 *  
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be
 * [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would
 * be [3, 2, 1] 
 *  
 * Bonus: Can you do this in less than O(n^2) time complexity?
 * */

public class ArrayProduct {
	
	// this algorithm takes O(n) time complexity
	public static int[] arrayProduct(int[] input) {
		if (input.length == 0 || input.length == 1) {
			return null;
		}
		
		int product = 1;
		
		for (int i = 0; i < input.length; i++) {
			product *= input[i];
		}
		
		int[] output = new int[input.length];
		
		for (int i = 0; i < input.length; i++) {
			output[i] = product / input[i];
		}
		
		return output;
	}

}
