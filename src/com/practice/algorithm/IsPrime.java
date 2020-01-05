package com.practice.algorithm;

/* Given an integer, return true if the input is a prime number and false
 * otherwise
 */
public class IsPrime {
	
	//Time Complexity - O(sqrt(n))
	public static boolean isPrime(int input) {
		if (input < 2) {
			return false;
		}
		 
		for(int i = 2; i * i <= input; i++) {
			if (input % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
