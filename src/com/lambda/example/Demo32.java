package com.lambda.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo32 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to find the number of words that start with a vowel in a list of strings
		
		List<String> strings = Arrays.asList("Pineapple", "Apple", "Banana", "Orange", "Raspberries", "Grape", "Blueberry");
		
		long count = strings.stream().filter(s->s.matches("(?i)[aeiou].*")).count();
		
		System.out.println("List: "+strings);
		System.out.println("Word starts with vowel: "+count);
		
		
	}

}
