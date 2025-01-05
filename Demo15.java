package com.lambda.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo15 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to multiply and sum all elements in a list of integers
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		int multiple = numbers.stream().reduce(1, (subTotal,nextElement)->subTotal*nextElement);
		
		System.out.println("Multiplication of elements: "+multiple);
		
		int addition = numbers.stream().reduce(0, (subTotal,nextElement)->subTotal+nextElement);
		
		System.out.println("Addition of elements: "+addition);

	}

}
