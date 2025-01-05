package com.lambda.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo27 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to calculate the sum of all prime numbers in a list of integers
		
		List<Integer> list = Arrays.asList(12,33,5,34,55,9,42,7,68,23,21);
		
		int sum = list.stream().filter(Demo27::isPrime).mapToInt(Integer::intValue).sum();
		
		System.out.println("Sum of all prime numbers: "+sum);
		
	}
	
	public static boolean isPrime(int num) {
		
		if(num <=1) return false;
		
		for(int i=2;i<= Math.sqrt(num);i++) {
			
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
		
	}

}
