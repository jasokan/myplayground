package com.jasokan.jdk8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author jasokan
 *
 */
public class JStringExample1 {

	public static String join(String[] jStringArray) {
		return Arrays.asList(jStringArray).stream().map(x -> x).collect(Collectors.joining(","));
	}

	public static String joinWithPrefixPostFix(String[] jStringArray) {
		return Arrays.asList(jStringArray).stream().map(x -> x).collect(Collectors.joining(",", "[", "]"));
	}

	public static List<String> split(String jString) {
		return Stream.of(jString.split(",")).map(elem -> new String(elem)).collect(Collectors.toList());
	}

	public static List<Character> splitToListOfChar(String jString) {
		return jString.chars().mapToObj(item -> (char) item).collect(Collectors.toList());
	}

	public static void main(String... args) {

		String[] jTestString = { "jagan", "leju", "swaroop", "ashok", "jagadish" };

		System.out.println(JStringExample1.join(jTestString));
		System.out.println(JStringExample1.joinWithPrefixPostFix(jTestString));
		System.out.println(JStringExample1.split(jTestString[1]));
		System.out.println(JStringExample1.splitToListOfChar(jTestString[1]));

	}

}
