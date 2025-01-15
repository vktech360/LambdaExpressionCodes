package com.lambda.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo41 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to find the second largest number in a list of integers
		
		List<Integer> num = Arrays.asList(35, 20, 10, 15, 25);
		System.out.println("Given list: "+num);
		List<Integer> sortedList = num.stream().distinct().sorted().collect(Collectors.toList());
		
		if(sortedList.size() >= 2) {
			int secondLargestNumber = sortedList.get(sortedList.size()-2);
			System.out.println("Second largest number from list: "+secondLargestNumber);
		}else {
			System.out.println("List does not have second largest number");
		}
		
		
	}

}
