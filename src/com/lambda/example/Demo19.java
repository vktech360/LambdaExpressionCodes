package com.lambda.example;

import java.util.Arrays;
import java.util.List;

public class Demo19 {
	
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to find the maximum string in a list of strings
		
		List<String> strings = Arrays.asList("Pineapple", "Apple", "Banana", "Orange", "Raspberries", "Blueberry");
		
		System.out.println("List Of Strings: "+strings);
		
		String maxLengthStr = strings.stream().max((s1,s2)-> Integer.compare(s1.length(), s2.length())).orElse(null);
		
		System.out.println("Max Length string: "+maxLengthStr);
	}

}
