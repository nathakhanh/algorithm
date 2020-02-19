package com.practice.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class PhudithUniquePairSum {
	//O(n^2)
	public static int bruteForce(int n, int[] input) {
		Set<Integer> output = new HashSet<Integer>();
		for(int i = 0; i < input.length; i++) {
			for(int j = 0; j < input.length; j++) {
				if (n + input[i] == input[j]) {
					output.add(input[j]);
				}
			}
		}
		return output.size();
	}
	//O(n)
	public static int optimized(int n, int[] input) {
		HashSet<Integer> set = new HashSet<Integer>();
		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
		Arrays.stream(input).forEach(each -> table.put(each, each));
		Arrays.stream(input).forEach(each -> {
			if (table.get(each + n) != null) {
				set.add(table.get(each + n));
			}
		});
		return set.size();
	}
	
	

}
