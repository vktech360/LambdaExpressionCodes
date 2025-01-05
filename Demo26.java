package com.lambda.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo26 {
	
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to find the square of each odd number in a list of integers
		
		List<Integer> list = Arrays.asList(12,33,34,55,9,42,68,20,21);
		
		List<Integer> mappedList = list.stream().map(num-> num%2!=0 ? num*num : num).collect(Collectors.toList());
		
		System.out.println("Old List: "+list);
		System.out.println("Mapped List: "+mappedList);
		
	}

}
