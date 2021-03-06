package com.practice.algorithm;

/* There exists a staircase with N steps, and you can climb up either
 * 1 or 2 steps at a time. Given N, write a function that returns the
 * number of unique ways you can climb the staircase. The order of the
 * steps matters.
 * 
 * For example, if N is 4, then there are 5 unique ways:
 * 1, 1, 1, 1
 * 2, 1, 1
 * 1, 2, 1
 * 1, 1, 2
 * 2, 2
 * 
 * Bonus: What if, instead of being able to climb 1 or 2 steps at a 
 * time, you could climb any number from a set of positive integers X?
 * For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at 
 * a time.
 */

public class ClimbStairs {
	
	//Recursive with memoization O(n) time and space
    public static int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return climbStairs_recursive(0, n, memo);
    }
    
    private static int climbStairs_recursive(int current, int target, int[] memo) {
        if(current > target) {
            return 0;
        }
        
        if(current == target) {
            return 1;
        }
        
        if(memo[current] > 0) {
            return memo[current];
        }
        
        memo[current] = climbStairs_recursive(current+1, target, memo) + climbStairs_recursive(current+2, target, memo);
        
        return memo[current];
    }
    
    
    public static void main(String... args) {
    	System.out.println(climbStairs(5));
    }
}
