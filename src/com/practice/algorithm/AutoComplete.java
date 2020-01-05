package com.practice.algorithm;

import java.util.Arrays;

/* Implement an autocomplete system. That is, given a query string s and a set of all 
 * possible query strings, return all strings in the set that have s as a prefix
 * 
 * For example, given the query string "de" and the set of strings
 * ["dog", "deer", "deal"], return ["deer", "deal"]
 * 
 * Bonus: try to optimize the data structure to speed up the queries.
 */

public class AutoComplete {
	
	// Time Complexity - O(n^2)
	public static String[] autoComplete(String query, String[] queryStrings) {
		return Arrays.stream(queryStrings).filter(each -> each.contains(query)).toArray(String[] :: new);
	}

}
