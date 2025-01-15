package com.lambda.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

public class Demo10 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to calculate the sum of all Odd numbers
		
		List<Integer> list = Arrays.asList(12,33,34,55,9,42,68,20,21);
		
		int sum = list.stream().filter(num->num%2!=0).mapToInt(Integer::intValue).sum();
		System.out.println("sum="+sum);
		
	}

}
