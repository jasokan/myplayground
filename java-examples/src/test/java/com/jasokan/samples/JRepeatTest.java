package com.jasokan.samples;

import java.util.HashMap;
import java.util.Map;

public class JRepeatTest {
    public static void main(String[] args) {
	String repeatValue = "abcaadijmnopawerasdfwer";

	Map<String, Integer> printRepeated = new HashMap<String, Integer>();

	for (int i = 0; i < repeatValue.length(); i++) {
	    String currentChar = String.valueOf(repeatValue.charAt(i));
	    if (printRepeated.containsKey(currentChar)) {
		Integer currentValue = printRepeated.get(currentChar);
		currentValue++;
		printRepeated.put(currentChar, currentValue);

	    } else {
		printRepeated.put(currentChar, 1);
	    }

	}

	for (String key : printRepeated.keySet()) {

	    Integer value = printRepeated.get(key);
	    System.out.println(key + " " + value);

	}

    }

}
