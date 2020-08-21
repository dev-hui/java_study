package api;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("year > "); int year = sc.nextInt();
		System.out.print("month> "); int month= sc.nextInt();
		
		Calendar c = Calendar.getInstance();
		c.set(year, month -1, 1);
		
		int week = c.get(Calendar.DAY_OF_WEEK);
		int endday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println(year + "년 " + month + "월");
		System.out.println("--------------------");
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");

		for(int i=1; i < week; i++) {
			System.out.print("   ");
		}
		
		for(int d=1, w = week; d <= endday; d++, w++) {
			System.out.print(d<10 ? " " + d + " " : d + " ");
			if (w % 7 == 0) System.out.println();
		}
	}
}
