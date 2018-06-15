package com.jasokan.jdk10.examples;

public class JVarExample1 {
	
	public static void main(String[] args) {
		var jString = "test";
		var jInteger = Integer.getInteger("1000",1000);
		var jInt = 1000;
		
		int a = 100;
		Integer testA = Integer.getInteger("1000",1000);
		
		System.out.println(jString.getClass());
		System.out.println(jInteger.getClass());
		System.out.println(((Object)jInt).getClass().getName());
		
		System.out.println(a);
		System.out.println(testA);
	}

}
