package com.edubridge.maven_project1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringReverseTest {
	private Object reversedStr = null;
	
	@BeforeEach  
	public void setup() {
	StringReverse s = new StringReverse();
		System.out.println("BeforeEach");
 }
	@Test
	public void teststr() {
		String actual = "Hello world";
	    String expected = "dlrow olleH";
		assertEquals(expected, actual);
	}
}
  