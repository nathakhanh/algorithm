package com.practice.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Chapter1 {
	
	/* Implement an algorithm to determine if a string has all unique characters.
	 * 
	 * Bonus: what if you cannot use any data structure?
	 */
	public static boolean isUnique(String s) {
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		for(int i = 0; i < charArray.length-1; i++) {
			if (charArray[i] == charArray[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	/* Given two strings, write a method to decide if one is permutation of the other
	 * 
	 * Example: "abcd" is a permutation of "bcda"
	 */
	public static boolean isPermutation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		
		char[] ca1 = s1.toCharArray();
		char[] ca2 = s2.toCharArray();
		Arrays.sort(ca1);
		Arrays.sort(ca2);
		for(int i = 0; i < s1.length(); i++) {
			if (ca1[i] != ca2[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isPermutation2(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		
		int[] characters = new int[128];
		char[] ca1 = s1.toCharArray();
		for(int i = 0; i < s1.length(); i++) {
			characters[ca1[i]]++;
		}
		char[] ca2 = s2.toCharArray();
		for(int i = 0; i < s2.length(); i++) {
			characters[ca2[i]]--;
			if (characters[ca2[i]] < 0) {
				return false;
			}
		}
		
		return true;
	}
	
	/* Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is
	 * the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to
	 * just dictionary words
	 * 
	 * Example
	 * Input: "tactcoa"
	 * Output: True ("tacocat", "atcocta")
	 */
	public static boolean isPermutationPalindrome(String s) {
		Map<Character, Integer> charCount = new HashMap<>();
		for(char c : s.toCharArray()) {
			if (!charCount.containsKey(c)) {
				charCount.put(c, 1);
			} else {
				charCount.remove(c);
			}
		}	
		
		return charCount.size() > 1 ? false : true;
	}
	
	public static boolean isPermutationPalindrome2(String s) {
		int[] charCount = new int['z' - 'a' + 1];
		for(char c : s.toCharArray()) {
			charCount[c - 'a']++;
		}
		
		int oddCount = 0;
		
		for(char c : s.toCharArray()) {
			if (charCount[c - 'a'] % 2 > 0) {
				oddCount++;
			}
		}
		
		return oddCount > 1 ? false : true;
	}
	
	/* There are three types of edits that can be performed on strings: insert a character,
	 * remove a character, or replace a character. Given two strings, write a function to check
	 * if they are one edit (or zero edits) away.
	 * 
	 * Example:
	 * pale, ple -> true
	 * pales, pale -> true
	 * pale, bale -> true
	 * pale, bake -> false
	 * 
	 */
	public static boolean isOneAway(String s1, String s2) {
		
		//if same length
		if(s1.length() == s2.length()) {
			boolean foundDifference = false;
			for(int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					if (foundDifference) {
						return false;
					}
					foundDifference = true;
				}
			}
		}
		//if length difference is more than 1
		else if(Math.abs(s1.length() - s2.length()) > 1) {
			return false;
		}
		//if first string is longer
		else if (s1.length() > s2.length()) {
			boolean foundDifference = false;
			for(int i = 0, j = 0; i < s2.length(); i++, j++) {
				if (s1.charAt(i) != s2.charAt(j)) {
					if (foundDifference) {
						return false;
					}
					foundDifference = true;
					j--;
				}
			}
		//if second string is longer	
		} else if (s2.length() > s1.length()) {
			boolean foundDifference = false;
			for(int i = 0, j = 0; i < s1.length(); i++, j++) {
				if (s2.charAt(i) != s1.charAt(j)) {
					if (foundDifference) {
						return false;
					}
					foundDifference = true;
					j--;
				}
			}
		}
		return true;
	}
	
	/* Implement a method to perform basic string compression using the counts of 
	 * repeated characters. For example, the string aabcccccaaa would become a2b1c5a3.
	 * If the compressed string is longer than the original string, your method should
	 * return the original string. Assume that you will only get lowercase String
	 */
	public static String stringCompression(String s) {
		Map<Character, Integer> charCount = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= s.length(); i++) {
			char c = s.charAt(i-1);
			
			int count = charCount.containsKey(c) ? charCount.get(c) : 0;
			charCount.put(c, count + 1);
			
			if(i == s.length() || c != s.charAt(i)) {
				sb.append(c).append(charCount.get(c));
				charCount.remove(c);
			}
		}
		
		return sb.length() < s.length() ? sb.toString(): s;
	}
	
	/* Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
	 * write a method to rotate the image by 90 degrees. Can you do this in place?
	 * 
	 * Notes: you can treat NxN matrix as a two dimensional array
	 */
	public static boolean rotateMatrix(int[][] matrix) {
		if (matrix.length == 0 || matrix.length != matrix[0].length) {
			return false;
		}
		int n = matrix.length;
		for(int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; i++) {
				int offset = i - first;
				//save top
				int top = matrix[first][i]; 
				
				//left -> top
				matrix[first][i] = matrix[last - offset][first];
				
				//bottom -> left
				matrix[last - offset][first] = matrix[last][last - offset];
				
				//right -> bottom
				matrix[last][last - offset] = matrix[i][last];
				
				//top -> right
				matrix[i][last] = top;
			}
		}
		return true;
	}
	
	/* Write an algorithm such that if an element in an MxN matrix is 0,
	 * its entire row and column are set to 0
	 */
	public static int[][] zeroMatrix(int[][] matrix) {
		List<Integer[]> zeroLocations = new ArrayList<>();
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					zeroLocations.add(new Integer[] {i,j});
				}
			}
		}
		
		for(int i = 0; i < zeroLocations.size(); i++) {
			Integer[] zeroLocation = zeroLocations.get(i);
			setRow(matrix, zeroLocation[0]);
			setColumn(matrix, zeroLocation[1]);
		}
		
		return matrix;
	}
	
	private static void setRow(int[][] matrix, int row) {
		for(int i = 0; i < matrix[row].length; i++) {
			matrix[row][i] = 0;
		}
	}
	
	private static void setColumn(int[][] matrix, int column) {
		for(int i = 0; i < matrix.length; i++) {
			matrix[i][column] = 0;
		}
	}
	
	/* Given two strings, s1 and s2, write code to check if s2 is a rotation of s1.
	 * Assume all input is in lowercase
	 * 
	 * Example: 
	 * Input: s1 = "waterbottle", s2 = "erbottlewat"
	 * "erbottlewat" is a rotation of "watterbottle"
	 * 
	 */
	public static boolean stringRotation(String s1, String s2) {
		String s = s1 + s1;
		if (s.indexOf(s2) > 0) {
			return true;
		}
		
		return false;
	}
	
	
	
	

}
