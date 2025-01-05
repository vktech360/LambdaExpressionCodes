package com.lambda.example;

import java.util.Arrays;
import java.util.List;

public class Demo37 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to find the sum of all positive integers in a list of numbers
		
		List<Integer> numbers = Arrays.asList(1, -2, 3, 2, -4, -5, 1, 6, -4);
		
		int sum = numbers.stream().filter(num-> num>0).mapToInt(Integer::intValue).sum();
		
		System.out.println("Sum of positive Integer: "+sum);
	}

}
