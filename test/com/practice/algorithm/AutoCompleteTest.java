package com.practice.algorithm;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AutoCompleteTest {
	
	@Test
	public void test_1() {
		String query = "de";
		String[] queryStrings = {"dog", "deer", "deal"};
		String[] output = AutoComplete.autoComplete(query, queryStrings);
		String[] expectedOutput = {"deer", "deal"};
		assertArrayEquals(expectedOutput, output);
	}

}
