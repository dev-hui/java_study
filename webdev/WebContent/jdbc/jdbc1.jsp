<%@page import="java.sql.DriverManager"%>
<%@page import="jdbc.EmpDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
Connection conn = null;
Statement stmt = null;
ResultSet rs = null;

StringBuffer sql = new StringBuffer();
sql.append(" SELECT");
sql.append("     e.last_name         AS 사원명,");
sql.append("     d.department_name   AS 부서명");
sql.append(" FROM");
sql.append("     employees        e");
sql.append("     INNER JOIN hr.departments   d ON e.department_id = d.department_id");

List<EmpDTO> list = new ArrayList<>();

try {
	Class.forName("oracle.jdbc.OracleDriver");
	conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
//	System.out.println("CONNECTION SUCCESS!");
	stmt = conn.createStatement();
	rs = stmt.executeQuery(sql.toString());
	while (rs.next()) {
		EmpDTO empDTO = new EmpDTO();
		empDTO.setLast_name(rs.getString("사원명"));
		empDTO.setDepartment_name(rs.getString("부서명"));
		list.add(empDTO);
	}
%>
<table border = "1">
<tr>
	<th>사원명</th>
	<th>부서명</th>
</tr>
<% for (EmpDTO empDTO : list) { %>
<tr>
	<td><%=empDTO.getLast_name() %></td>
	<td><%=empDTO.getDepartment_name() %></td>
</tr>
<% } %>
</table>
<%
} catch (Exception e) {
	e.printStackTrace();
} finally {
	if (rs != null) try {rs.close();} catch(Exception e) {}
	if (stmt != null) try {stmt.close();} catch(Exception e) {}
	if (conn != null) try {conn.close();} catch(Exception e) {}
}
%>
</body>
</html>