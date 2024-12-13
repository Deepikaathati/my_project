package com.edubridge.maven_project1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CountDigitsTest {
	private CountDigits c = null;

	@BeforeEach
	public void setup() {
		c = new CountDigits();
		System.out.println("BeforeEach");
		
		@Test
		public static void findCountDigit() {
			int actual = c.findCountDigit(2345);
			int expected = 4;
			assertEquals(expected, actual);
		}
	}
}
