package com.practice.algorithm;

import java.util.HashSet;

/* Given an integer k and a string s, find the length of the
 * longest substring that contains at most k distinct characters
 * 
 * For example, given s = 'abcba' and k = 2, the longest 
 * substring with k distinct characters is 'bcb'. If k = 3, the
 * longest substring with k distinct characters is 'abcba'
 */
public class PhudithLongestSubstring {
	//O(n^2)
	public static String bruteForce(String s, int k) {
		String longestSubstring = "";
		for (int i = 0; i < s.length(); i++) {
			HashSet<Character> set = new HashSet<>();
			set.add(s.charAt(i));
			for (int j = i+1; j < s.length(); j++) {
				set.add(s.charAt(j));
				//If the size of the unique char is more than k
				if (set.size() > k) {
					if (s.substring(i, j).length() > longestSubstring.length()) {
						longestSubstring = s.substring(i, j);
					}
					break;
				}
				
				//In case the longest substring is to the end of the string
				if (j == s.length()-1 && s.substring(i, j+1).length() > longestSubstring.length()) {
					longestSubstring = s.substring(i, j+1);
				}
			}
		}
		return longestSubstring;
	}
}
