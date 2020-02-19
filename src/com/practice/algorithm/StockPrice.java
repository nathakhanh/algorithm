package com.practice.algorithm;

import java.util.Arrays;

public class StockPrice {
	public static int[] getLowerStockPriceDays(double[] stockPrices, int[] days) {
		int[] output = new int[days.length];
		for (int i = 0; i < days.length; i++) {
			double priceToExamine = stockPrices[days[i]-1];
			for(int j = 0; j < stockPrices.length; j++) {
				if (stockPrices[j] < priceToExamine) {
					output[i] = j + 1;
					break;
				}
				output[i] = -1;
			}		
		}
		
		return output;
	}
	
	public static int[] getLowerStockPriceDays2(double[] stockPrices, int[] days) {
		int[] output = new int[days.length];
		Arrays.fill(output, -1);
		for (int i = 0; i < days.length; i++) {
			double priceToEximine = stockPrices[days[i]-1];
			int leftIndex = -1;
			int rightIndex = -1;
			for(int j = days[i]-1; j >= 0; j--) {
				if (stockPrices[j] < priceToEximine) {
					leftIndex = j+1;
					break;
				}
			}
			for (int j = days[i]-1; j < stockPrices.length; j++) {					
				if (stockPrices[j] < priceToEximine) {
					rightIndex = j+1;
					break;
				}
			}
			if (leftIndex == -1) {
				output[i] = rightIndex;
			} else if (rightIndex == -1) {
				output[i] = leftIndex;
			} else if (days[i] - leftIndex <= rightIndex - days[i]) {
				output[i] = leftIndex;
			} else {
				output[i] = rightIndex;
			}
			
			
			
		}
		return output;
	}
	
	protected static int[] examineStockPrices(int[] stockPrices, int[] days) {
		  int resultDays[] = new int[days.length];
		  for (int i = 0; i < days.length; i++) {
		   int currentDay = days[i];
		   resultDays[i] = -1;
		   for (int j = currentDay - 1; j < stockPrices.length; j++) {
		    if (j - 1 >= 0 && stockPrices[j - 1] < stockPrices[currentDay - 1]) {
		     resultDays[i] = j;
		     break;
		    } else if (j + 1 < stockPrices.length && stockPrices[j + 1] < stockPrices[currentDay - 1]) {
		     resultDays[i] = j + 1 + 1;
		     break;
		    }
		   }
		   
		  }
		  return resultDays;
		 }

}
