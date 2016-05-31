package com.jasokan.samples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author jasokan
 *
 */
public class JSetTest {
    
    public static void main(String[] args) {
	Set<String> jUnorderedSet = new HashSet<String>();
	
	jUnorderedSet.add("Jagan");
	jUnorderedSet.add("Venu");
	jUnorderedSet.add("Wilson");
	jUnorderedSet.add("Priya");
	jUnorderedSet.add("Satya");
	jUnorderedSet.add("Arjun");
	jUnorderedSet.add("Vikram");
	
	jUnorderedSet.forEach(System.out::println);
	
	System.out.println("-------------------------");
	
	
	Set<String> jOrderedSet = new TreeSet<String>(jUnorderedSet);
	
	jOrderedSet.forEach(System.out::println);
    }
}
