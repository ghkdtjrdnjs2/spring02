<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table class="table table-hover">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>위치</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="dept">
				<tr>
					<td>${dept.DEPTNO }</td>
					<td><a href="/dept1/read?deptno=${dept.DEPTNO }">${dept.DNAME }</a></td>
					<td>${dept.LOC }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>