package com.practice.algorithm;

import java.util.HashMap;
import java.util.Map;

public class WordSearch {
	public static boolean wordSearch(String[] s1, String[] s2) {
		Map<String, Integer> magazine = new HashMap<>();
		for(String word : s1) {
			if(magazine.containsKey(word)) {
				magazine.put(word, magazine.get(word) + 1);
			} else {
				magazine.put(word, 1);
			}
		}
		
		for(String word: s2) {
			if(!magazine.containsKey(word) || magazine.get(word) <= 0) {
				return false;
			} else {
				magazine.put(word, magazine.get(word) - 1);
			}
		}
		return true;
	}
}
