package com.lambda.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to filter out even numbers from a list of integers
		
		List<Integer> list = Arrays.asList(12,33,34,55,9,42,68,20,21);
		
		List<Integer> evenNumList = list.stream().filter(num->num%2==0).collect(Collectors.toList());
		
		System.out.println("evenNumList= "+evenNumList);
		
	}

}
