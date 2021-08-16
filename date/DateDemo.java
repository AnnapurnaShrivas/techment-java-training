package com.techment.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		LocalDate birthDate = LocalDate.of(1998, 06, 21);
				System.out.println(birthDate);
		
		System.out.println(date.isAfter(birthDate));

	}

}
