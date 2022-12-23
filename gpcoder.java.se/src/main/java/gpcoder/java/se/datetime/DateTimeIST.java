package gpcoder.java.se.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeIST {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		Instant instant = Instant.now();
		LocalDate dayOfBirth = LocalDate.of(2001, Month.JANUARY, 16);
		Instant dob = Instant.parse("2018-06-20T10:37:30.00Z");
		Duration duration = Duration.ofDays(1);
		
		System.out.println("Current time: " + localTime);
		System.out.println("Current date: " + localDate);
		System.out.println("Current datetime: " + localDateTime);
		System.out.println("Instant: " + instant);
		System.out.println("Date of birth: " + dob);
		System.out.println("Date of birth: " + dayOfBirth);
		System.out.println("Next 321 day form base: " + LocalDate.ofEpochDay(321));
		System.out.println("Next 321 day form dayOfBirth: " + LocalDate.ofYearDay(dayOfBirth.getYear(), 321));
		System.out.println("Duration: " + duration);
	}
}
