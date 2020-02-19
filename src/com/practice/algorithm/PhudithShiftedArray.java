package com.practice.algorithm;

/* A left rotation operation on an array shifts each of the array's elements 1 unit to the left. 
 * For example, if  2 left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2].
 * Given an array a of n integers and a number, d, perform  d left rotations on the array. Return the updated array 
 * to be printed as a single line of space-separated integers.
 * Sample Input
 * 5 4
 * 1 2 3 4 5
 * Sample Output
 * 5 1 2 3 4
 * 
 */
public class PhudithShiftedArray {
	//O(n)
	public static int[] shiftArray(int[] a, int d) {
		int[] tempArray = new int[d];
		int[] output = new int[a.length];
		for(int i = 0, j = 0; i < a.length; i++) {
			if (i < d) {
				tempArray[i] = a[i];
			} else {
				output[j] = a[i];
				j++;
			}
		}
		
		for(int i = 0; i < d; i++) {
			output[output.length - d + i] = tempArray[i];
		}
		
		
		return output;
	}
}
