package com.practice.algorithm;

import java.util.Hashtable;

/* Given the mapping a = 1, b = 2, ... z = 26, and an encoded message (String),  
 * count the number of ways it can be decoded.
 * 
 * For example, the message '111' would give 3, since it could be decoded as
 * 'aaa', 'ka', and 'ak'
 * 
 * You can assume that the messages are decodable. For example, '001' is not allowed
 * */

public class EncodedMessageCount {

	//This solution takes O(n) time complexity
	public static int encodedMessageCount(String s) {
		// DP solution, using two arrays to record the number of decodings 
        // when the i-th position is used as itself or a combination.
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
        	return 0;
        }
        
        int[] notSingle = new int[s.length()];
        int[] single = new int[s.length()];
        
        single[0] = 1;
        notSingle[0] = 0;
        
        for (int i = 1; i < s.length(); i++) {
            int combination = (s.charAt(i - 1) - '0') * 10 + (s.charAt(i) - '0');
            //check if the first two digit is a valid alphabet
            if (combination >= 10 && combination <= 26) {
            	//increment count
                notSingle[i] = single[i - 1];
            }
            //check if the encoded message is equal to 0
            if (s.charAt(i) != '0') {
            	//increment count if the encoded message does not equal to 0
                single[i] = notSingle[i - 1] + single[i - 1];
            }
        }
        //sum up the last index of single and not single array
        return single[s.length() - 1] + notSingle[s.length() - 1];
	}
	
	
	public static int encodedMessageCount_2(String input) {
		if (input.length() == 1) {
			return 1;	
		} else if (input.length() == 2) {
			return 1 + isChar(input);
		} else {
			int count = encodedMessageCount_2(input.substring(1));
			if (isChar(input.substring(0,1)) == 1) {
				count += encodedMessageCount_2(input.substring(2));
			}
			return count;
		}
		
	}
	
	private static int isChar(String input) {
		int inputAsInt = Integer.parseInt(input);
		if (inputAsInt > 26 || inputAsInt < 1) {
			return 0;
		}
		return 1;
	}
		
}
