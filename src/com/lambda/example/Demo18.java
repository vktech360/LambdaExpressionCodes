package com.lambda.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo18 {
	public static void main(String[] args) {
		//write a Java program using Lambda Expression to sort the strings based on their lengths in ascending order
		
		List<String> strings = Arrays.asList("Pineapple", "Apple", "Banana", "Orange", "Raspberries", "Grape", "Blueberry");
		
		System.out.println("Unsorted List: "+strings);
		
		Collections.sort(strings, (s1,s2)->s1.length()-s2.length());
		
		System.out.println("Sorted List: "+strings);
		
	}

}
