package com.lambda.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo17 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to check if a given string is a palindrome , ignoring spaces and case
		
		StringChecker isPalindrom = str->{
			String cleanedStr = str.replaceAll("\\s", "").toLowerCase();
			
			return cleanedStr.equals(new StringBuffer(cleanedStr).reverse().toString());
		};
		
		System.out.println("nitin is palindrom: "+isPalindrom.check("nitin"));
		System.out.println("apple is palindrom: "+isPalindrom.check("apple"));
		
	}

}

interface StringChecker{
	boolean check(String str);
}
