package com.jasokan.samples;

import java.io.IOException;

/**
 * @author jasokan
 *
 */
public class JReverseStringOne {
    private String inputString;
    private String outputString;

    public JReverseStringOne(String inputString) {
	this.inputString = inputString;
    }

    public String doRev() {
	int stackSize = inputString.length();
	JStack theStack = new JStack(stackSize);
	for (int i = 0; i < inputString.length(); i++) {
	    char character = inputString.charAt(i);
	    theStack.push(character);
	}
	outputString = "";
	while (!theStack.isEmpty()) {
	    char character = theStack.pop();
	    outputString = outputString + character;
	}
	return outputString;
    }

    public static void main(String[] args) throws IOException {
	String testInputString = "Java Source and Support";
	String testOutputString;
	JReverseStringOne stringReverser = new JReverseStringOne(testInputString);
	testOutputString = stringReverser.doRev();
	System.out.println("The Reversed String = " + testOutputString);
    }

    class JStack {
	private int maxSize;
	private char[] charArray;
	private int top;

	public JStack(int maxLength) {
	    maxSize = maxLength;
	    charArray = new char[maxSize];
	    top = -1;
	}

	public void push(char j) {
	    charArray[++top] = j;
	}

	public char pop() {
	    return charArray[top--];
	}

	public char peek() {
	    return charArray[top];
	}

	public boolean isEmpty() {
	    return (top == -1);
	}
    }
}