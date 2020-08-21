package july_17th_api;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest3 {   // 달력 만들기!!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("year > "); int year = sc.nextInt();
		System.out.print("month > "); int month = sc.nextInt();
		
		printCalendar(year, month);
 	    
	}

	public static void printCalendar(int year, int month) {
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
		
		int week = c.get(Calendar.DAY_OF_WEEK);  // 일요일 1, 월요일 2, ... 토요일 7
	    int endday = c.getActualMaximum(Calendar.DAY_OF_MONTH);  // 그 달의 마지막 날(30일/31일 이런거) 알려줌

	    System.out.println("\n"+ year + "년" + month + "월");
	    System.out.println("---------------------");
	    System.out.println("일 월 화 수 목 금 토");
	    System.out.println("---------------------");
	    
	    for (int i = 1; i < week;  i++) {
	    	System.out.print("   ");
	    }
	    
	    for (int d = 1, w = week; d <= endday; d++, w++) {
	    	System.out.print(d<10 ? " " + d + " " : d + " ");
	    	if (w % 7 == 0) System.out.println();
	    }
	}
}
