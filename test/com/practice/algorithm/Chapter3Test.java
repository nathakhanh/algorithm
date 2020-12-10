package com.practice.algorithm;

import java.util.Stack;

import org.junit.Test;

public class Chapter3Test {
	@Test
	public void test_3_6_1() {
		Stack<Integer> s = new Stack<>();
		s.push(4);
		s.push(1);
		s.push(3);
		Chapter3.sort(s);
		System.out.println(s);
	}
}
