package com.lambda.example;

import java.util.Arrays;
import java.util.List;

public class Demo34 {
	
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to find the product of all odd numbers in a list of integers
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		int product = numbers.stream().filter(num->num%2 != 0).reduce(1, (a,b)->a*b);
		
		System.out.println("Product of add numbers: "+product);
		
		
	}

}
