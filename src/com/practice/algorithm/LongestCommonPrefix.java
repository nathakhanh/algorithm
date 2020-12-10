package com.practice.algorithm;


/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.
*/
public class LongestCommonPrefix {
	public static String getLongestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        
        int shortestWordLength = Integer.MAX_VALUE;
        for(String word : strs) {
            if(word.length() < shortestWordLength) {
                shortestWordLength = word.length();
            }
        }
        
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for(int i = 0; i < shortestWordLength; i++) {
            char c = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].charAt(i) != c) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                break;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
	
	public static String getLongestCommonPrefix2(String[] strs) {
		if (strs.length == 0) {
			 return "";
		}
	    String prefix = strs[0];
	    for (int i = 1; i < strs.length; i++)
	        while (strs[i].indexOf(prefix) != 0) {
	            prefix = prefix.substring(0, prefix.length() - 1);
	            if (prefix.isEmpty()) {
	            	return "";
	            }
	        }        
	    return prefix;
	}
	
}
