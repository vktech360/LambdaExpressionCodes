package com.lambda.example;

import java.util.Arrays;
import java.util.List;

public class Demo44 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to find the smallest palindrome string in a list of strings
		
		List<String> list = Arrays.asList("java", "racecar", "level", "bob", "nitin");
		
		String palindromStr = list.stream().filter(str-> str.equalsIgnoreCase(new StringBuffer(str).reverse().toString()))
		.min((s1,s2)->s1.length()-s2.length()).orElse("No palindrom string found");
		
		System.out.println("Smallest palindrom string: "+palindromStr);
	}

}
