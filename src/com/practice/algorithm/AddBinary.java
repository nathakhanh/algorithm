package com.practice.algorithm;

import java.util.function.BiFunction;

/*Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"

Input: a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", 
	   b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
Output: "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000"
*/
public class AddBinary {
	//this method doesn't work when binary a and binary b exceeded 2^64-1
	public static String addBinary_api(String a, String b) {
		long b1 = Long.parseLong(a, 2);
        long b2 = Long.parseLong(b, 2);
        long sum = b1 + b2;
        return Long.toBinaryString(sum);
	}
	
	public static String addBinary(String a, String b) {
		int aLength = a.length();
		int bLength = b.length();
		int maxLength = Math.max(aLength, bLength);
		String output = "";
		int carry = 0;
		for(int i = 0; i < maxLength; i++) {
			int b1 = i < aLength ? a.charAt(aLength - 1 - i) - '0' : 0;
			int b2 = i < bLength ? b.charAt(bLength - 1 - i) - '0' : 0;
			int sum = b1 + b2 + carry;
			carry = sum / 2;
			output = sum % 2 + output;
		}

		return carry == 0 ? output : 1 + output;
	}
	
	 public static void main(String... args) {
		 test((a, b) -> addBinary_api(a,b), "11","1");
		 test((a, b) -> addBinary(a,b), "11","1");
		 test((a, b) -> addBinary(a,b), "111","110");
		 test((a, b) -> addBinary(a,b), 
				 "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
				 "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");
	 }
	 
	 private static void test(BiFunction<String, String, String> func, String a, String b) {
		 String output = func.apply(a,b);
		 System.out.println(output);
	 }
}
