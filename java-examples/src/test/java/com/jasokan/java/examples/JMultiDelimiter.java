package com.jasokan.java.examples;

public class JMultiDelimiter {

	public static void main(String[] args) {
		String jInputString = "Even if the string; contains multiple delimiters, Java will * split ** the string properly!";
		String[] jSplitString = jInputString.split(";|,|\\*|\n");
		for(int i=0;i<jSplitString.length;i++) {
			System.out.println(jSplitString[i].trim());
		}

	}

}
