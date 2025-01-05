package com.lambda.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo16 {

	public static void main(String[] args) {
		//Write a Java program using Lambda Expression that takes a list of numbers and returns the square of each number
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		List<Integer> sqNumbers = numbers.stream().map(num->num*num).collect(Collectors.toList());
		
		System.out.println("sqNumbers="+sqNumbers);
		
	}
}
