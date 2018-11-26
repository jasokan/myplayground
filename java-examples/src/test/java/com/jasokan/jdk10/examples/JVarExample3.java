package com.jasokan.jdk10.examples;

/**
 * @author jasokan
 *
 */
public class JVarExample3 {
	
	static Object justCreate() { return null;}
	
	public static void main(String[] args) {
		var jGeneric=100;
		
		System.out.println(((Object)jGeneric).getClass());
		
		jGeneric = Integer.getInteger("1000", 1000);
		
		var jTest = justCreate();
	}

}
