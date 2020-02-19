package com.practice.algorithm;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class StockPriceTest {
	
	@Test
	public void test_1() {
		double[] stockPrices = {6.0, 8.0, 7.0, 3.0, 5.0, 4.0};
		int[] days = {1,2,4};
		int[] lowerStockPriceDays = StockPrice.getLowerStockPriceDays(stockPrices, days);
		int[] expectedOutput = {4,1,-1};
		assertArrayEquals(expectedOutput, lowerStockPriceDays);
	}
	
	@Test
	public void test_2() {
		double[] stockPrices = {6.0, 8.0, 7.0, 3.0, 5.0, 4.0};
		int[] days = {1,2,4};
		int[] lowerStockPriceDays = StockPrice.getLowerStockPriceDays2(stockPrices, days);
		int[] expectedOutput = {4,1,-1};
		assertArrayEquals(expectedOutput, lowerStockPriceDays);
	}
	
	@Test
	public void test_3() {
		double[] stockPrices = {6.0, 8.0, 7.0, 3.0, 5.0, 4.0};
		int[] days = {3,4,5};
		int[] lowerStockPriceDays = StockPrice.getLowerStockPriceDays2(stockPrices, days);
		int[] expectedOutput = {4,-1, 4};
		assertArrayEquals(expectedOutput, lowerStockPriceDays);
	}
	
	@Test
	public void test_4() {
		double[] stockPrices = {1, 5, 4, 6, 7, 8};
		int[] days = {3,4,5};
		int[] lowerStockPriceDays = StockPrice.getLowerStockPriceDays2(stockPrices, days);
		int[] expectedOutput = {1,3, 4};
		assertArrayEquals(expectedOutput, lowerStockPriceDays);
	}

}
