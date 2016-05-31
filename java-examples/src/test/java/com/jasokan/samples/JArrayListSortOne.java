package com.jasokan.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jasokan
 *
 */
public class JArrayListSortOne {

    public static void main(String[] args) {
	List<String> jList = new ArrayList<String>();

	jList.add("Jagan");
	jList.add("Satya");
	jList.add("Venu");
	jList.add("Priya");
	jList.add("Arjun");
	jList.add("Vikram");

	Collections.sort(jList);

	for (int i = 0; i < jList.size(); i++)
	    System.out.println(jList.get(i));

    }

}
