package com.jasokan.jdk9.examples;

import java.util.stream.Stream;

/**
 * @author jasokan
 *
 */
public class JStreamExample1 {
	
	public static void main(String[] args) {
		
		Stream.of("a","b","c","", "d", "e").takeWhile(st->!st.isEmpty()).forEach(System.out::print);
		System.out.println();

		System.out.println(Stream.of("a","b","c","", "d", "e").anyMatch(st->!st.equalsIgnoreCase("e")));
		
		System.out.println();
		Stream.of("a","b","c","", "d", "e").dropWhile(st->!st.isEmpty()).forEach(System.out::print);
		System.out.println();

		Stream.iterate(5, number-> number < 30, number -> number + 5).forEach(System.out::println);
		
	}

}
