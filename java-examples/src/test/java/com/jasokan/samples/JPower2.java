package com.jasokan.samples;

import java.util.Scanner;

/**
 * @author jasokan
 *
 */
public class JPower2 {
    
    public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	int inputNumber = userInput.nextInt();
	if(Integer.bitCount(inputNumber) == 1) {
	    System.out.println("Power of 2");
	} else {
	    System.out.println("Not Power of 2");
	}
	userInput.close();
    }

}
