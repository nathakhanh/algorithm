package com.practice.algorithm;
/*
 * Lilah has a string, s, of lowercase English letters that she repeated infinitely many times.
 * Given an integer, n, find and print the number of letter a's in the first n letters of Lilah's infinite string.
 * For example, if the string s='abcac' and n=10, the substring we consider is 'abcacabcac', the first  characters of her infinite string. There are 4 occurrences of a in the substring.
 * Function Description
 * Complete the repeatedString function in the editor below. It should return an integer representing the number of occurrences of a in the prefix of length  in the infinitely repeating string.
 * repeatedString has the following parameter(s):
 * s: a string to repeat
 * n: the number of characters to consider
 * Input Format
 * The first line contains a single string, s.
 * The second line contains an integer, n.
 * Sample Input 0
 * aba
 * 10
 * Sample Output 0
 * 7
 * Sample Input 1
 * a
 * 1000000000
 * Sample Output 1
 * 1000000000
 */
public class PhudithNumberOfA {
	
	//O(n)
	public static int printNumberOfA(int n, String s) {
		int count = 0;
		for(int i = 0; i < n; i++) {
			if (s.charAt(i % s.length()) == 'a') {
				count++;
			}
		}
		return count;
	}
	
	//O(n)
	public static long printNumberOfA_InspiredByPrasad(long n, String s) {
		long countForA = 0;
		for(int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				countForA++;
			}
		}
		
		long numberOfWords = n / s.length();
		long totalCount = countForA * numberOfWords;
		String remainderChars = s.substring(0, (int) n % s.length());
		
		
		for(int i = 0; i < remainderChars.length(); i++) {
			if (remainderChars.charAt(i) == 'a') {
				totalCount++;
			}
		}
		return totalCount;
	}
}
