package com.lambda.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo13 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to find the maximum values in a list of integers
		
		List<Integer> list = Arrays.asList(12,33,34,55,9,42,68,20,21);
		
		Optional<Integer> num = list.stream().reduce((a,b)->a>b?a:b);
		
		if(num.isPresent()) {
			System.out.println("Maximum value is: "+num.get());
		}else {
			System.out.println("No value available");
		}
		
	}

}
