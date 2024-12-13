package com.edubridge.maven_project1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumOfDigitsTest {
	private SumOfDigits s = null;

	@BeforeEach
	public void setup() {
		s = new SumOfDigits();
		System.out.println("BeforeEach");
	}
	@AfterEach
	public void tearup() {
		s = null;
		System.out.println("AfterEach");
	}

		
		@Test
		public void testSumOfDigits() {
			int actual = s.findSumOfDigits(2345);
			int expected = 14;
			assertEquals(expected, actual);
		}
}
