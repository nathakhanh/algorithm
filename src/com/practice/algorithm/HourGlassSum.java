package com.practice.algorithm;


public class HourGlassSum {
	public static int getHourGlassSum(int[][] m) {
		int r = m.length;
		int c = m[0].length;
		int biggestSum = Integer.MIN_VALUE;
		for(int i = 0; i < r - 2; i++) {
			for (int j = 0; j < c - 2; j++) {
				int firstRowSum = m[i][j] + m[i][j+1] + m[i][j+2];
				int secondRowSum = m[i+1][j+1];
				int thirdRowSum = m[i+2][j] + m[i+2][j+1] + m[i+2][j+2];
				int sum = firstRowSum + secondRowSum + thirdRowSum;
				if (biggestSum < sum) {
					biggestSum = sum;
				}
			}
		}
		
		return biggestSum;
	}
}
