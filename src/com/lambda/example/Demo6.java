package com.lambda.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo6 {

	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to find the average of a list of doubles
		
		List<Double> num = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
		
		double sum = num.stream().mapToDouble(Double::doubleValue).sum();
		
		double avg = sum/num.size();
		
		System.out.println("avg="+avg);
		
	}
}
