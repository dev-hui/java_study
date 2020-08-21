<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css2?family=Nanum+Pen+Script&display=swap" rel="stylesheet">
<style type = "text/css">
<body>{
	font-family : 'Nanum Pen Script'}
</body>
</style>
</head>
<body>
<table>
	<caption>게임의 결과</caption>
<tr>
	<th>YOU</th>
	<th>vs</th>
	<th>COM</th>
</tr>

<tr>
	<td>${you}</td>
	<td></td>
	<td>${com}</td>
</tr>

<tr>
	<td colspan="3">${msg}</td>
</tr>
</table>
</body>
</html>