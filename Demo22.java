package com.lambda.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo22 {
	
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to convert a list of integers to their corresponding binary strings
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Number List: "+numbers);
		
		List<String> binaryString =convertToBinary(numbers,Integer::toBinaryString);
		
		System.out.println("Binary String List: "+binaryString);
	}
	
	public static List<String> convertToBinary(List<Integer> intList,ConvertNumber converter ){
		List<String> result = new ArrayList<>();
		
		for(Integer num:intList) {
			
			result.add(converter.convert(num));
		}
		
		return result;
	}
}
interface ConvertNumber{
	String convert(int num);
}
