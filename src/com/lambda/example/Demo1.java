package com.lambda.example;

public class Demo1 {

	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to find the sum of two integers
		
		CalculateNumbers calculate = (a,b)-> a+b;
		
		int sum = calculate.sum(10, 20);
		
		System.out.println("Sum= "+sum);
	}
}

interface CalculateNumbers{
	int sum(int a, int b);
}
