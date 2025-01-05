package com.lambda.example;

import java.util.HashMap;
import java.util.Map;

public class Demo45 {
	
	public static void main(String[] args) {
		//Write a Java program using Lambda Expression to iterate a map and print key and value
		
		Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        
        map.forEach((K,V)->{
        	System.out.println("Key: "+K+" , Value: "+V);
        });
        
	}

}
