package com.practice.algorithm;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class AdvancedFizzBuzzTest {
	@Test
	public void test_1() {
		Map<Integer, String> m = new HashMap<>();
		m.put(5, "Buzz");
		m.put(3, "Fizz");
		AdvancedFizzBuzz.printAdvancedFizzBuzz(m);
	}
}
