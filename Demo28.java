package com.lambda.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo28 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to remove the vowels from a list of strings
		
		List<String> list = Arrays.asList("Mango", "Cherry", "Apple", "Banana");
		
		List<String> mappedList =  list.stream().map(str->str.replaceAll("[AEIOUaeiou]", "")).collect(Collectors.toList());
		
		System.out.println("List: "+list);
		System.out.println("Mapped List: "+mappedList);
	}

}
