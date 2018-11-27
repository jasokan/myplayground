package com.jasokan.java.examples;

/**
 * @author jasokan
 *
 */
public class JArithmetic {
	
	public static void main(String[] args) {
		
		System.out.println(subtract(2,3));
		System.out.println(divide(4,3));
		System.out.println(multiply(9, 3));
		
	}
	
	public static int addition(int a, int b) {
		return a+b;
	}
	
	public static int multiply(int a, int b) {
		int jReturn = 0;
		for(int i=0;i<a;i++) {
			jReturn+=b;
		}
		return jReturn;
	}
	
	public static int subtract(int a, int b) {
		int jReturn = a + Math.negateExact(b);
		return jReturn;
	}
	
	public static int divide(int a, int b) {
		if(b>a) return 0;
		int jLoop = 0;
		for(int i=a;i>=0;i++) {
			a += Math.negateExact(b);
			if(a<0) {
				break;
			}
			jLoop+=1;
		}
		return jLoop;
	}
	

}
