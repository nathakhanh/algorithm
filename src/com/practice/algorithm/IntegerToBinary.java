package com.practice.algorithm;


public class IntegerToBinary {
	public static String integerToBinary(int n) {
		if(n == 0) {
			return "0";
		}
		
		String output = "";
		while(n > 0) {
			output = n % 2 + output;
			n /= 2;
		}
		return output;
	}
	

	public static void main(String... args) {
		test(0);
		test(1);
		test(2);
		test(3);
		test(4);
		test(5);
		test(6);
		test(7);
	}
	
	private static void test(int n) {
		System.out.println(integerToBinary(n));
	}
}
