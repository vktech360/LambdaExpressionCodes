package com.lambda.example;

import java.util.Arrays;
import java.util.List;

public class Demo29 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to calculate the product of all even numbers in a list of integers
		List<Integer> list = Arrays.asList(12,33,5,34,55,9,42,7,68,23,21);
		
		int product = list.stream().filter(num-> num%2==0).reduce(1, (a ,b)->a*b);
		
		System.out.println("Product of even numbers: "+product);
		
	}

}
