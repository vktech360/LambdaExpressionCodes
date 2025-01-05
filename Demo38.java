package com.lambda.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo38 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to check if all strings in a list start with an uppercase letter
		
		List<String> list = Arrays.asList("Mango", "Cherry", "apple", "Banana");
		
		boolean isUpperCase = list.stream().allMatch(str-> Character.isUpperCase(str.charAt(0)));
		
		System.out.println("Starts with upper case: "+isUpperCase);
		
		
	}

}
