package com.practice.algorithm;


/* given an array of numbers, write a method that returns the top two maximum numbers. 
 * Ex. Given [15, 30, 45, 90, 120], return: [120, 90]
 * Test Scenario 2: [25, 2, 50, 5, 25, 90, 85, 90, 3, 100] return [100, 90]
 * Test Scenario 3: [0, 1, 1, 0] return [1, 0]
 * Note that arrays provided will not be sorted, and numbers may be duplicated. Be sure to handle potential edge cases as well. 
 */

public class TopTwoMaxNumber {
	public static int[] getTwoMaxNumber(int[] input) {
		int maxNumber = Integer.MIN_VALUE;
		int secondMaxNumber = Integer.MIN_VALUE;
		int temp = Integer.MIN_VALUE;
		for(int i = 0; i < input.length; i++) {
			if(input[i] > maxNumber) {
				temp = maxNumber;
				maxNumber = input[i];
			}
			if(temp > secondMaxNumber) {
				secondMaxNumber = temp;
			}
		}
		
		return new int[] {maxNumber, secondMaxNumber};
	}
}
