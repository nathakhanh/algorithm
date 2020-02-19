package com.practice.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayList {
	public static void main(String args[]) {
		List<Integer> arrL = Arrays.asList(1,2,3,4);
		arrL.forEach(n -> System.out.println(n));
		arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); });
	}

}
