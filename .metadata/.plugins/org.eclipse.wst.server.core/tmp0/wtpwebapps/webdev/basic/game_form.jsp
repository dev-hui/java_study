<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>No Game No Life</title>
</head>
<body>
<form method = "POST" !action="game_result.jsp">
<h1> 게임을 시작하자 <br></h1>
<select name = "you">
	<option value = "1"> 가위 </option>
	<option value = "2"> 바위 </option>
	<option value = "3"> 보 </option>
</select>
<input type="submit" value="enter" />
</form>
</body>
</html>