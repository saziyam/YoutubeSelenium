package org.testing.utilities;

public class Assertions {
public static void assertion(String expected, String actual) {
	if(expected.equals(actual)) {
		System.out.println("Assertion pass");
		
	}
	else
	{
		System.out.println("Assertion Fail");
	}
}
}
