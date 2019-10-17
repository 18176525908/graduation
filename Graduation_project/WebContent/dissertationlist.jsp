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
			<td>序号</td>
			<td>课题名</td>
			<td>地址</td>
			<td>评优</td>
			<td>成绩</td>
			<td>学生id</td>
			<td>老师id</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${dissertation }" var="d">
		<tr>
			<td>${d.d_id}</td>
			<td>${d.d_name}</td>
			<td><a href="selectDissertationByaddress?d_address=${d.d_address}">${d.d_address}</a></td>
			<td>${d.d_comment}</td>
			<td>${d.d_score}</td>
			<td>${d.stu_ID}</td>
			<td>${d.tea_ID}</td>
			<td>
			<a href="selectDissertationById?d_id=${d.d_id}">修改</a>
			</td>
		</tr>
		</c:forEach>
		</table>
</body>
</html>