package com.lambda.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo35 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to find the first non-empty string in a list of strings
		
		List<String> strings = Arrays.asList("", "", "", "", "", "", "");
		
		String firstnonemptyString = strings.stream().filter(s->!s.isEmpty()).findFirst().orElse("No non-empty string found");
		
		System.out.println("First non empty string: "+firstnonemptyString);
		
		
		
	}

}
