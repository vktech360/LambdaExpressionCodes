package com.lambda.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo7 {

	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to remove duplicates from a list of integers
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 4);
		
		List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
		
		System.out.println("distinctNumbers="+distinctNumbers);
		
		
		
	}
}
