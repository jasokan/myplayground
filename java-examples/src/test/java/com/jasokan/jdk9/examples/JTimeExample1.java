package com.jasokan.jdk9.examples;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JTimeExample1 {

	public static List<Date> getDatesBetweenUsingJava7(Date startDate, Date endDate) {
		List<Date> datesInRange = new ArrayList<Date>();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(startDate);

		Calendar endCalendar = new GregorianCalendar();
		endCalendar.setTime(endDate);

		while (calendar.before(endCalendar)) {
			Date result = calendar.getTime();
			datesInRange.add(result);
			calendar.add(Calendar.DATE, 1);
		}
		return datesInRange;
	}

	public static List<LocalDate> getDatesBetweenUsingJava8(LocalDate startDate, LocalDate endDate) {
		long numOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		return IntStream.iterate(0, i -> i + 1).limit(numOfDaysBetween).mapToObj(i -> startDate.plusDays(i))
				.collect(Collectors.toList());
	}

	public static List<LocalDate> getDatesBetweenUsingJava9(LocalDate startDate, LocalDate endDate) {
		return startDate.datesUntil(endDate).collect(Collectors.toList());
	}

	public static void main(String... args) {
		
		System.out.println(JTimeExample1.getDatesBetweenUsingJava7(new Date(), new Date("01-Jan-2019")));
		System.out.println(JTimeExample1.getDatesBetweenUsingJava8(LocalDate.now() , LocalDate.of(2019, 01, 01)));
		System.out.println(JTimeExample1.getDatesBetweenUsingJava9(LocalDate.now() , LocalDate.of(2019, 01, 01)));

	}

}
