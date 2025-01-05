package com.lambda.example;

import java.util.Arrays;
import java.util.List;

public class Demo33 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to find the sum of squares of even numbers in a list of integers
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		int sum = numbers.stream().filter(num->num%2==0).map(n->n*n).reduce(0, (a,b)->a+b);
		
		System.out.println("Sum: "+sum);
		
	}

}
