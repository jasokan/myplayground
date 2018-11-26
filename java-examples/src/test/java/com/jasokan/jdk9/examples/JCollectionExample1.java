package com.jasokan.jdk9.examples;

import java.util.List;
import java.util.Set;

/**
 * @author jasokan
 *
 */
public class JCollectionExample1 {

	public static void main(String[] args) {

		Set<Integer> jInts = Set.of(2,4,5,6,7,8);
		List<String> jStrings = List.of("jagan", "leju", "jagan", "swaroop", "venu");
		
		for(int i=0;i<jStrings.size();i++) {
			System.out.println(jStrings.get(i));
		}
		
		jInts.forEach(ints->System.out.println(ints));
		jStrings.forEach(strings->System.out.println(strings));
	}

}
