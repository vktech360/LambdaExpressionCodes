package com.lambda.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;

public class Demo12 {
	
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to concatenate two strings
		
		String str1 = "Hello";
		String str2 = "World";
		
		BiFunction<String, String, String> biFunction = (s1,s2)-> s1+" "+s2;
		
		String concatStr = biFunction.apply(str1,str2);
		
		System.out.println("Concanated String= "+concatStr);
		
	}

}
