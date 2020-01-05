package com.practice.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EncodedMessageCountTest {
	
	@Test
	public void test_1() {
		String encodedMessage = "111";
		int output = EncodedMessageCount.encodedMessageCount(encodedMessage);
		int expectedOutput = 3;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_2() {
		String encodedMessage = "1111";
		int output = EncodedMessageCount.encodedMessageCount(encodedMessage);
		int expectedOutput = 5;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_3() {
		String encodedMessage = "123";
		int output = EncodedMessageCount.encodedMessageCount(encodedMessage);
		int expectedOutput = 3;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_4() {
		String encodedMessage = "106";
		int output = EncodedMessageCount.encodedMessageCount(encodedMessage);
		int expectedOutput = 1;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_5() {
		String encodedMessage = "106111";
		int output = EncodedMessageCount.encodedMessageCount(encodedMessage);
		int expectedOutput = 3;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_6() {
		String encodedMessage = "2222";
		int output = EncodedMessageCount.encodedMessageCount(encodedMessage);
		int expectedOutput = 5;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_7() {
		String encodedMessage = "3333";
		int output = EncodedMessageCount.encodedMessageCount(encodedMessage);
		int expectedOutput = 1;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_8() {
		String encodedMessage = "11111";
		int output = EncodedMessageCount.encodedMessageCount(encodedMessage);
		int expectedOutput = 8;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_1_Phudith() {
		String encodedMessage = "111";
		int output = EncodedMessageCount.encodedMessageCount_2(encodedMessage);
		int expectedOutput = 3;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_2_Phudith() {
		String encodedMessage = "1111";
		int output = EncodedMessageCount.encodedMessageCount_2(encodedMessage);
		int expectedOutput = 5;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_3_Phudith() {
		String encodedMessage = "261";
		int output = EncodedMessageCount.encodedMessageCount_2(encodedMessage);
		int expectedOutput = 2;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_4_Phudith() {
		String encodedMessage = "106";
		int output = EncodedMessageCount.encodedMessageCount_2(encodedMessage);
		int expectedOutput = 1;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_5_Phudith() {
		String encodedMessage = "106111";
		int output = EncodedMessageCount.encodedMessageCount_2(encodedMessage);
		int expectedOutput = 3;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_6_Phudith() {
		String encodedMessage = "2222";
		int output = EncodedMessageCount.encodedMessageCount_2(encodedMessage);
		int expectedOutput = 5;
		assertEquals(expectedOutput, output);
	}
	
	
	@Test
	public void test_7_Phudith() {
		String encodedMessage = "3333";
		int output = EncodedMessageCount.encodedMessageCount_2(encodedMessage);
		int expectedOutput = 1;
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void test_8_Phudith() {
		String encodedMessage = "11111";
		int output = EncodedMessageCount.encodedMessageCount_2(encodedMessage);
		int expectedOutput = 8;
		assertEquals(expectedOutput, output);
	}

}
