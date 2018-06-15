package com.jasokan.jdk9.examples;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.IntStream;

public class JStringExample1 {

	public static void main(String... args) {
		long startTime = System.currentTimeMillis();
		List strings = IntStream.rangeClosed(1, 10_000_000).mapToObj(Integer::toString).collect(toList());
		System.out.println(strings.size());
		long totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Generated " + strings.size() + " strings in " + totalTime + " ms.");

		startTime = System.currentTimeMillis();
		@SuppressWarnings("unchecked")
		String appendedNew = (String) strings.stream().limit(100_000).reduce("",
				(left, right) -> left.toString() + right.toString());
		
		Object[] appended = (Object[]) strings.stream().limit(100).toArray();
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println(appended.length);
		for(int i=0;i<appended.length;i++) {
			System.out.println(appended[i].getClass());
			System.out.println(appended[i].toString());
		}
		//System.out.println("Created string of length " + appended.length() + " in " + totalTime + " ms.");
	}
}
