package com.jasokan.samples;

import java.util.TimeZone;

import org.joda.time.DateTimeZone;
import org.joda.time.Instant;

public class JJodaTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
	DateTimeZone zone = DateTimeZone.forID("America/Los_Angeles");
	int currentOffsetMilliseconds = zone.getOffset(Instant.now());
	int currentOffsetHours = currentOffsetMilliseconds / (60 * 60 * 1000);
	System.out.println(currentOffsetHours);

	// To just determine if it is currently DST in Pacific Time or not.
	// DateTimeZone zones = DateTimeZone.forID("America/Los_Angeles");
	String tIds[] = TimeZone.getAvailableIDs();
	for (String tId : tIds) {
	    DateTimeZone zones = DateTimeZone.forID(tId);
	    boolean isStandardOffset = zones.isStandardOffset(Instant.now().getMillis());
	    boolean isDaylightOfset = !isStandardOffset;
	    System.out.println(tId + "    " + isDaylightOfset);
	}
    }
}
