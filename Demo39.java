package com.lambda.example;

import java.util.Arrays;
import java.util.List;

public class Demo39 {
	public static void main(String[] args) {
		// Write a Java program using Lambda Expression to find the square root of each number in a list of doubles
		
		List<Double> list = Arrays.asList(16.0, 5.0, 25.0, 47.0, 50.0);
		
		list.forEach(num->{
			double squareRoot = Math.sqrt(num);
			System.out.println("Square root of "+num+" is :"+squareRoot);
		});
	}

}
