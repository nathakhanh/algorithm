package com.practice.algorithm;

import java.util.Map;
import java.util.TreeMap;

/* Given a set of unknown length with keys of type integer and values of type string, 
 * loop through 1-100. If the number is evenly divisible by the key, append the corresponding string. 
 */
public class AdvancedFizzBuzz {
	public static void printAdvancedFizzBuzz(Map<Integer, String> m) {
		Map<Integer, String> sortedMap = new TreeMap<>(m);
    	for(int i = 1; i <= 100; i++) {
    		StringBuilder sb = new StringBuilder();
    		for(Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
    			if (i % entry.getKey() == 0) {
    				sb.append(entry.getValue());
    			}
    		}
    		
    		if (sb.length() == 0) {
    			sb.append(i);
    		}
    		System.out.println(sb.toString());
    	}
	}
}
