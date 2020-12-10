package com.practice.algorithm;


public class BinaryToInteger {
	public static int binaryToInteger(String b) {
		char[] c = b.toCharArray();
		int output = 0;
		for(int i = c.length-1; i >= 0; i--) {
			output += (c[i] - '0') * Math.pow(2, c.length-1 - i);
		}
		
		return output;
	}
	
	public static void main(String... args) {
		test("0");
		test("1");
		test("10");
		test("11");
		test("100");
		test("101");
		test("110");
		test("111");
	}
	
	private static void test(String b) {
		System.out.println(binaryToInteger(b));
	}
}
