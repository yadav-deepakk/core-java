package importantapi;

import java.time.*;

public class DateTime {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now(); 
		System.out.println(ld);

		System.out.println(ld.getYear()); 
		System.out.println(ld.isLeapYear()); 
		System.out.println(ld.getMonth()); 
		
		LocalTime time = LocalTime.now(); 
		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());

	}

}
