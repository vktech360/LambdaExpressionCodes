package com.lambda.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo23 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to find the prime numbers in a list of integers
		
		List<Integer> list = Arrays.asList(12,33,5,34,55,9,42,68,7,20,11,21);
		
		List<Integer> primeNumList = findPrimeNumber(list);
		
		System.out.println("Number List: "+list);
		
		System.out.println("Prime Number List: "+primeNumList);
		
	}
	
	
	static List<Integer> findPrimeNumber(List<Integer> list){
		
		Predicate<Integer> isPrime = num->{
			
			if(num <=1) {
				return false;
			}
			for(int i=2;i<= Math.sqrt(num);i++) {
				
				if(num%i==0) {
					return false;
				}
			}
			return true;
		};
		
		List<Integer> primeNumList = new ArrayList<>();
		
		for(int eachNum : list) {
			if(isPrime.test(eachNum)) {
				primeNumList.add(eachNum);
			}
		}
		
		return primeNumList;
	}

}
