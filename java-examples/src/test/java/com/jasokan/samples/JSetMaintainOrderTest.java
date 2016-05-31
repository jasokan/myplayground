package com.jasokan.samples;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author jasokan
 *
 */
public class JSetMaintainOrderTest {
    
    public static void main(String[] args) {
	Set<String> jMaintainOrderSet = new LinkedHashSet<String>();
	
	jMaintainOrderSet.add("Jagan");
	jMaintainOrderSet.add("Venu");
	jMaintainOrderSet.add("Wilson");
	jMaintainOrderSet.add("Priya");
	jMaintainOrderSet.add("Satya");
	jMaintainOrderSet.add("Arjun");
	jMaintainOrderSet.add("Vikram");
	
	jMaintainOrderSet.forEach(System.out::println);
    }

}
