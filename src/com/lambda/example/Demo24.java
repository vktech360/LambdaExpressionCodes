package com.lambda.example;

public class Demo24 {
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to count the number of words in a given sentence (words are separated by spaces)
		
		WordCount wordCount = sentence-> sentence.split(" ").length;
		
		System.out.println("Word count: "+wordCount.count("Write a Java program using Lambda Expression to count the number of words in a given sentence"));
		
	}

}

interface WordCount{
	int count(String str);
}
