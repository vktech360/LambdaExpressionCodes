package com.lambda.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo14 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to find the minimum values in a list of integers
		
		List<Integer> list = Arrays.asList(12,33,34,55,9,42,68,20,21);
		
		Optional<Integer> num = list.stream().reduce((a,b)->a<b?a:b);
		
		if(num.isPresent()) {
			System.out.println("Minimum value is: "+num.get());
		}else {
			System.out.println("No minimum value is available");
		}

	}

}
