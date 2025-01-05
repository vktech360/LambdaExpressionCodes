package com.lambda.example;

import java.util.Arrays;
import java.util.List;

public class Demo31 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to find the difference between the maximum and minimum values in a list of doubles
		
		List<Double> num = Arrays.asList(10.0, 5.0, 8.0, 15.0, 3.0);
		
		double max = num.stream().max(Double::compareTo).orElse(0.0);
		
		double min = num.stream().min(Double::compareTo).orElse(0.0);
		
		System.out.println("Max value: "+max);
		System.out.println("Min value: "+min);
		double difference = max-min;
		System.out.println("Difference: "+difference);
		
		
		
	}

}
