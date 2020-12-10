package com.practice.algorithm;

import java.util.function.Function;

/*Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
Example 2:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.*/
public class MaxProfit {
	
	public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            for(int j = i+1; j < prices.length; j++) {
                if(prices[j] - prices[i] > maxProfit) {
                    maxProfit = prices[j] - prices[i];
                }
            }
        }
        return maxProfit;
    }
	
	public static int maxProfit_onePass(int[] prices) {
		int min = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int i = 0; i < prices.length; i++) {
			if(prices[i] < min) {
				min = prices[i];
			} else if(prices[i] - min > maxProfit) {
				maxProfit = prices[i] - min;
			}
		}
		
		return maxProfit;
	}
	
	public static int maxProfit_kadane(int[] prices) {
		int max = 0;
		int profit = 0;
		
		for(int i = 1; i < prices.length; i++) {
			int currentProfit =  prices[i] - prices[i-1];
			profit = (profit + currentProfit) > currentProfit ? (profit + currentProfit) : currentProfit;
			max = max > profit ? max : profit;
		}
		
		return max;
	}
	
	public static void main(String... args) {
		//Brute Force
		test((a) -> maxProfit(a), new int[] {7,1,5,3,6,4});
		test((a) -> maxProfit(a), new int[] {7,6,4,3,1});
		
		//One Pass
		test((a) -> maxProfit_onePass(a), new int[] {7,1,5,3,6,4});
		test((a) -> maxProfit_onePass(a), new int[] {7,6,4,3,1});
		
		//Kadane
		test((a) -> maxProfit_kadane(a), new int[] {7,1,5,3,6,4});
		test((a) -> maxProfit_kadane(a), new int[] {7,6,4,3,1});
	}
	
	private static void test(Function<int[], Integer> func, int[] prices) {
		System.out.println(func.apply(prices));
	}
}

