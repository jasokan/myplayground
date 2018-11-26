package com.jasokan.jdk9.examples;

import java.util.stream.Stream;

/**
 * @author jasokan
 *
 */
public class JStreamExample2 {

	public static void main(String[] args) {

		long nullableCount = Stream.ofNullable(1000).count();
		
		System.out.println(nullableCount);

		long nullCount = Stream.ofNullable(null).count();
		System.out.println(nullCount);
	}

}
