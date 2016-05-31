package com.jasokan.samples;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jasokan
 *
 */
public class JMapTimeTest {

    public static void main(String[] args) {
	Map<Integer, String> nameMap = new HashMap<Integer, String>();

	Calendar startTime = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

	for (int i = 0; i < 200000; i++) {
	    nameMap.put(new Integer(i), "Jagan" + i);
	}

	for (Integer name : nameMap.keySet()) {

	    String key = name.toString();
	    String value = nameMap.get(name).toString();
	    System.out.println(key + " " + value);

	}

	Calendar endTime = Calendar.getInstance();
	System.out.println(sdf.format(startTime.getTime()));
	System.out.println(sdf.format(endTime.getTime()));
    }
}