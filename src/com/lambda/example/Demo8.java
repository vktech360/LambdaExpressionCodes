package com.lambda.example;

import java.util.Arrays;
import java.util.List;

public class Demo8 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to sort a list of strings in alphabetical order
		
		List<String> str = Arrays.asList("Mango", "Cherry", "Apple", "Banana");
		
		System.out.println("Unsorted List="+str);
		
		str.sort((s1,s2)-> s1.compareTo(s2));
		
		System.out.println("Sorted List="+str);
	}

}
