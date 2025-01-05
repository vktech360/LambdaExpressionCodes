package com.lambda.example;

import java.util.Arrays;
import java.util.List;

public class Demo43 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to find the sum of squares of odd numbers in a list of integers
		
		List<Integer> list = Arrays.asList(12,33,5,34,55,9,42,7,68,23,21);
		
		int sum = list.stream().filter(num->num%2!=0).map(n->n*n).mapToInt(Integer::intValue).sum();
		
		System.out.println("Sum of all squares of odd numbers: "+sum);
		
	}

}
