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
<form action="updateSubjects" method="post">
	<input type="hidden" name="su_id" value="${subjects.su_id }" />
	    课题名：<input type="text" name="su_name" value="${subjects.su_name }"/><br>
	    课题描述：<input type="text" name="su_description" value="${subjects.su_description }"/><br>
	    老师id：<input type="text" name="tea_ID" value="${subjects.tea_ID }"/><br>
	    <input type="submit" value="添加">
</form>
</body>
</html>