package com.jasokan.samples;

import org.perf4j.LoggingStopWatch;
import org.perf4j.StopWatch;

/**
 * @author jasokan
 *
 */
public class JStringTest {
    
    public static void main(String[] args) {
	
	int count = 20000;
	
	StopWatch stringAddition = new LoggingStopWatch();
	String sAddition = "";
	for(int i=0;i<count;i++) {
	    sAddition += i;
	}
	//System.out.println(sAddition);
	stringAddition.stop("String Addition", "String Addition");
	
	StopWatch stringBuilder = new LoggingStopWatch();
	StringBuilder sBuilder = new StringBuilder();
	for(int i=0;i<count;i++) {
	    sBuilder.append(i);
	}
	//System.out.println(sBuilder);
	stringBuilder.stop("String Builder", "String Builder");
	
	StopWatch stringBuffer = new LoggingStopWatch();
	StringBuffer sBuffer = new StringBuffer();
	for(int i=0;i<count;i++) {
	    sBuffer.append(i);
	}
	//System.out.println(sBuffer);
	stringBuffer.stop("String Buffer", "String Buffer");
	
	
    }
}
