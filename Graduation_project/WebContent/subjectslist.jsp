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
<a href="NewFile.jsp">返回</a>
<table border="1">
<tr>
			<td>课题id</td>
			<td>课题名</td>
			<td>课题描述</td>
			<td>老师id</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${subjects }" var="s">
		<tr>
			<td>${s.su_id}</td>
			<td>${s.su_name}</td>
			<td>${s.su_description}</td>
			<td>${s.tea_ID}</td>
			<td>
			<a href="delectSubjects?su_id=${s.su_id}">删除</a>
			<a href="selectSubjectsById?su_id=${s.su_id}">修改</a>
			</td>
		</tr>
		</c:forEach>
		</table>
</body>
</html>