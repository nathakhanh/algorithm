package com.practice.algorithm;

import java.util.Stack;

/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
*/

public class ValidParentheses {
	public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(stack.isEmpty()) {
                if(c == ')' || c == '}' || c == ']') {
                    return false;
                } else {
                    stack.push(c);
                }
            } else {
                if(c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if(c == ')') {
                    if(stack.pop() != '(') {
                        return false;
                    }
                } else if(c == '}') {
                    if(stack.pop() != '{') {
                        return false;
                    }
                } else if(c == ']') {
                    if(stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }  
        return stack.isEmpty() ? true : false;
    }
}
