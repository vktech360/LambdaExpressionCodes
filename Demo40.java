package com.lambda.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo40 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to find the largest even number in a list of integers
		
		List<Integer> list = Arrays.asList(12,33,5,34,55,9,42,7,68,23,21);
		
		 Optional<Integer> optional = list.stream().filter(num->num%2==0).max(Integer::compareTo);
		 
		 if(optional.isPresent()) {
			 System.out.println("Largest even number is: "+optional.get());
		 }else {
			 System.out.println("No even number found");
		 }
		 
	}

}
