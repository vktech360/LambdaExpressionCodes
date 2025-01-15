package com.lambda.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo5 {
	public static void main(String[] args) {
		
		//Write a Java program using Lambda Expression to check if a given string is empty
		
		Predicate<String> isEmpty = (str)-> str.isEmpty();
		
		if(isEmpty.test("")) {
			System.out.println("String is empty");
		}else {
			System.out.println("String is not empty");
		}
				
		
	}

}
