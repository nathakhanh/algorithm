package com.practice.algorithm;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WordSearchTest {
	@Test
	public void test_1() {
		String[] s1 = {"give", "me", "one", "grand", "today", "night"};
		String[] s2 = {"give", "one", "grand", "today"};
		boolean output = WordSearch.wordSearch(s1, s2);
		assertTrue(output);
	}
	
	@Test
	public void test_2() {
		String[] s1 = {"two", "times", "three", "is", "not", "four"};
		String[] s2 = {"two", "times" ,"two", "is", "four"};
		boolean output = WordSearch.wordSearch(s1, s2);
		assertFalse(output);
	}
	
	@Test
	public void test_3() {
		String[] s1 = {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
		String[] s2 = {"ive", "got", "some", "coconuts"};
		boolean output = WordSearch.wordSearch(s1, s2);
		assertFalse(output);
	}
	
	@Test
	public void test_4() {
		String[] s1 = {"ive", "got", "a", "lovely", "bunch", "of", "ive", "coconuts"};
		String[] s2 = {"ive", "got", "ive", "some", "coconuts"};
		boolean output = WordSearch.wordSearch(s1, s2);
		assertFalse(output);
	}
}
