package importantapi;

public class DateAndTimeInJava {

	public static void main(String[] args) {

		// util package
		System.out.println("---------------- Util - date ---------------");
		java.util.Date dt = new java.util.Date();
		System.out.println(dt);
		
		System.out.println(dt.getDate() + "/" + (dt.getMonth()+1) + "/" + dt.getYear()); 

		System.out.println(dt.getTimezoneOffset()); 
		System.out.println(dt.getTime()); 
		System.out.println(dt.getHours()); 
		System.out.println(dt.getMinutes()); 
		long timeInMs = dt.getTime(); 

		System.out.println("--------------- SQL - date ---------------");
		// SQL package
		java.sql.Date sqlDt = new java.sql.Date(timeInMs);
		System.out.println(sqlDt);
		
		
		System.out.println("--------------- Calendar ---------------");
		// Calendar
		System.out.println(java.util.Calendar.DATE);
		System.out.println(java.util.Calendar.YEAR);
		System.out.println(java.util.Calendar.MONTH);
		System.out.println(java.util.Calendar.DAY_OF_MONTH);
		
	}

}
