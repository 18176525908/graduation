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
<form action="updateDissertation" method="post">
	<input type="hidden" name="d_id" value="${dissertation.d_id }" />
	    课题名：<input type="text" name="d_name" value="${dissertation.d_name }"/><br>
	    地址：<input type="text" name="d_address" value="${dissertation.d_address }"/><br>
	    课题评优：<input type="text" name="d_comment" value="${dissertation.d_comment }"/><br>
	    课题成绩：<input type="text" name="d_score" value="${dissertation.d_score }"/><br>
	    学生id：<input type="text" name="stu_ID" value="${dissertation.stu_ID }"/><br>
	    老师id：<input type="text" name="tea_ID" value="${dissertation.tea_ID }"/><br>
	    <input type="submit" value="添加">
</form>
</body>
</html>