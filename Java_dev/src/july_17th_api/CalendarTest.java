package july_17th_api;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		c.set(2020, 7-1, 1);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;  // 기본 달이 0월 1월 2월... 이런 식으로 설정되어서 +1 해주어야 함
		int day = c.get(Calendar.DATE);
		int week = c.get(Calendar.DAY_OF_WEEK);  // 일요일 1, 월요일 2, ... 토요일 7
	    int endday = c.getActualMaximum(Calendar.DAY_OF_MONTH);  // 마지막 날(30일/31일 이런거) 알려줌
		
		System.out.println(year + "/" + month + "/" + day + "/" + week + "/" + endday);
	}
}
