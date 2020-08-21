<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
int year = 2020;
int month = 7;

Calendar c = Calendar.getInstance();
c.set(year, month-1, 1);

int week = c.get(Calendar.DAY_OF_WEEK);  // 일요일 1, 월요일 2, ... 토요일 7
int endday = c.getActualMaximum(Calendar.DAY_OF_MONTH);  // 그 달의 마지막 날(30일/31일 이런거) 알려줌
%>
<table border="1">
	<caption><%=year + "년" + month + "월" %></caption> <!-- expression. 바로 출력시키기 -->
<tr>
	<th>일</th>
	<th>월</th>
	<th>화</th>
	<th>수</th>
	<th>목</th>
	<th>금</th>
	<th>토</th>
</tr>
<tr>
<%

for (int i = 1; i < week;  i++) {
	out.print("<td></td>");
}

for (int d = 1, w = week; d <= endday; d++, w++) {
	out.print("<td>" + d + "</td>");
	if (w % 7 == 0) out.println("</tr><tr>");
}
%>  <!-- scriptlet. 여기 안에 java 코드 집어넣을 수 있음 -->
</table>
</body>
</html>