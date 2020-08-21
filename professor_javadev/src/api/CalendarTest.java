package api;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.set(2020, 7-1, 1);
		int year = c.get(Calendar.YEAR);
		int month= c.get(Calendar.MONDAY) + 1;
		int day  = c.get(Calendar.DATE);
		int week = c.get(Calendar.DAY_OF_WEEK);
		int endday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(year + "/" + month + "/" + day + ", " + week + ", " + endday);
	}
}
