package com.lambda.example;

import java.util.Arrays;
import java.util.List;

public class Demo20 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to find the minimum string in a list of strings
		
		List<String> strings = Arrays.asList("Pineapple", "Apple", "Banana", "Orange", "Raspberries", "Blueberry");
		
		String minLengthStr = strings.stream().min((s1,s2)->Integer.compare(s1.length(), s2.length())).orElse(null);
		
		System.out.println("List: "+strings);
		System.out.println("Min length str: "+minLengthStr);
	}

}
