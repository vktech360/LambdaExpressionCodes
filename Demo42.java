package com.lambda.example;

import java.util.Arrays;
import java.util.List;

public class Demo42 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to check if all strings in a list start with the letter 'S'
		
		List<String> str = Arrays.asList("sugar Apple", "Sapodilla Fruit", "Strawberry", "asalmonberry");
		
		boolean flag = str.stream().allMatch(s-> s.startsWith("S") || s.startsWith("s"));
		
		if(flag) {
			System.out.println("All strings starts with 'S' or 's'");
		}else {
			System.out.println("Not all strings starts with 'S' or 's'");
		}
	}

}
