package com.lambda.example;

import java.util.Arrays;
import java.util.List;

public class Demo30 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to find the sum of squares of all numbers from 1 to 10
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		int sum = numbers.stream().map(num->num*num).reduce(0, (a,b)-> a+b);
		
		System.out.println("Sum of all squares :"+sum);
	}

}
