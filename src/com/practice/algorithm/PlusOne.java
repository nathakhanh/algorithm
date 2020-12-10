package com.practice.algorithm;

import java.math.BigInteger;
import java.util.function.Function;

/*Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

Input: [9,9,9]
Output: [1,0,0,0]
Explanation: The array represents the integer 999.
*/
public class PlusOne {
	
	//use BigInteger in case the number is too big for int or long
	public static int[] plusOne_bigInteger(int[] digits) {
        BigInteger num = new BigInteger("0");
        for(int d : digits) {
           num = num.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(d)); 
        }
        num = num.add(BigInteger.valueOf(1));
		 
        String numString = num.toString();
        int nums[] = new int[numString.length()];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = Character.getNumericValue(numString.charAt(i));
        }
        
        return nums;
	}
	 
	//without conversion for type
	public static int[] plusOne(int[] digits) {
		digits[digits.length-1] += 1;
		int carry = 0;
		for(int i = digits.length-1; i >= 0; i--) {
			digits[i] += carry;
			if(digits[i] == 10) {
				digits[i] = 0;
				carry = 1;
			} else {
				carry = 0;
			}
		}
		
		if(carry == 1) {
			int[] output = new int[digits.length+1];
			output[0] = carry;
			return output;
		}
		return digits;
	}
	
	public static void main(String... args) {
		Function<int[],int[]> method_1 = (e) -> plusOne_bigInteger(e);
		test(method_1, new int[] {1,2,3});
		test(method_1, new int[] {9,9,9});
		test(method_1, new int[] {9,8,7,6,5,4,3,2,1,0});
		test(method_1, new int[] {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6});
		
		Function<int[],int[]> method_2 = (e) -> plusOne(e);
		test(method_2, new int[] {1,2,3});
		test(method_2, new int[] {9,9,9});
		test(method_2, new int[] {9,8,7,6,5,4,3,2,1,0});
		test(method_2, new int[] {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6});
	}
	
	private static void test(Function<int[], int[]> func, int[] digits) {
		int[] nums = func.apply(digits);
		for(int num : nums) {
			System.out.print(num);
		}
		System.out.println();
		
	}
}
