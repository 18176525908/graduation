<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="addSubjects" method="post">
	    课题名：<input type="text" name="su_name" value=""/><br>
	    课题描述：<input type="text" name="su_description" value=""/><br>
	    老师id：<input type="text" name="tea_ID" value=""/><br>
	    <input type="submit" value="添加">
</form>
</body>
</html>