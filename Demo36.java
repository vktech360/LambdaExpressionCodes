package com.lambda.example;

import java.util.Arrays;
import java.util.List;

public class Demo36 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to find the longest palindrome string in a list of strings
		
		List<String> list = Arrays.asList("java", "racecar", "level", "bob","nitin");
		
		String palindromString = list.stream().filter(str-> str.equalsIgnoreCase(new StringBuffer(str).reverse().toString()))
				.max((s1,s2)->s1.length()-s2.length()).orElse("No Palindrom string founds");
		
		System.out.println("Longest Palindrom string: "+palindromString);
	}

}
