package com.java8.Stream;

/* Check if Character at 1st index is UpperCase in all strings or not */
import java.util.stream.Stream;

class UpperCaseEx 
{
	public static void main(String[] args) 
	{
		
	// Creating a Stream of Strings
	Stream<String> stream = Stream.of("Pune", "Maharashtra","India");
		
	boolean answer = stream.allMatch(str-> Character.isUpperCase(str.charAt(0)));
	
	// Displaying the result
	System.out.println(answer);
}
}
