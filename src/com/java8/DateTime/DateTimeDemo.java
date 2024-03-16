package com.java8.DateTime;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo 
{
	public static void main(String[] args) 
	{
		Date d = new Date();
		System.out.println(d);
		//Simple DateFormat
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDate sld=LocalDate.of(1998, 12, 23);
		System.out.println(sld);
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(sld.format(dtf));

		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
	}
}
