package com.lambda.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to convert a list of strings to uppercase and lowercase
		
		List<String> list = new ArrayList<>();
		list.add("Delhi");
		list.add("Mumbai");
		list.add("Kolkata");
		list.add("Chennai");
		list.add("Delhi");
		list.add("Uttar Pradesh");
		
		List<String> upperCaseList = list.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
		System.out.println("upperCaseList= "+upperCaseList);

		List<String> lowerCaseList = list.stream().map(str->str.toLowerCase()).collect(Collectors.toList());
		System.out.println("lowerCaseList= "+lowerCaseList);
	}

}
