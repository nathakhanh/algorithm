package com.practice.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhudithMaxToy {
	//O(nlogn)
	public static int getMaxToy(int[] prices, int budget) {
		int toyCount = 0;
		int currentPrice = 0;
		Arrays.parallelSort(prices);
		for(int i = 0; i < prices.length; i++) {
			if (prices[i] + currentPrice <= budget) {
				currentPrice += prices[i];
				toyCount++;
			}
		}
		
		return toyCount;
	}
}
