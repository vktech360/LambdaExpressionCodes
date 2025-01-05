package com.lambda.example;

import java.util.function.Function;

public class Demo11 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to calculate the factorial of a given number
		
		int num=5;
		
		Function<Integer,Integer> function = n->{
			int result=1;
			for(int i=1;i<=num;i++) {
				result*=i;
			}
			return result;
		};
		int fact = function.apply(num);
		
		System.out.println("Factorial of "+num+" = "+fact);
		
	}

}
