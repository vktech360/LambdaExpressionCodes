package com.lambda.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo21 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to filter out all strings from a list that have a length greater than 5 characters
		
		
		List<String> strings = Arrays.asList("Pineapple", "Apple", "Banana", "Orange", "Raspberries", "Blueberry");
		
		System.out.println("Original List: "+strings);
		
		List<String> filteredList = strings.stream().filter(str->str.length()>5).collect(Collectors.toList());
		
		System.out.println("Filtered List: "+filteredList);
		
		String sentence = "Welcome Tutor Joes Computer Education";
		int length = sentence.split(" ").length;
		
		System.out.println(length);
		
		
	}

}
