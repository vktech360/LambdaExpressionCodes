package com.lambda.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo25 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to convert a list of strings to uppercase if the string length is even and to lowercase if the string length is odd
		
		List<String> strings = Arrays.asList("Pineapple", "Apple", "Banana", "Orange", "Raspberries", "Grape", "Blueberry");
		
		List<String> mappedList = strings.stream().map(str-> str.length()%2==0 ? str.toUpperCase():str.toLowerCase()).collect(Collectors.toList());
		
		System.out.println("Old List: "+strings);
		
		System.out.println("Mapped List: "+mappedList);
	}

}
