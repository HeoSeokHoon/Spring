<%@page import="com.winter.app.countries.CountriesDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
 	<c:import url="../temps/bootstrap_css.jsp"></c:import>
  </head>
<body>
	<c:import url="../temps/header.jsp"></c:import>

	<h1>Countries List</h1>
	
	<table class="table table-hover">
		<thead>
			<tr>
				<th>ID</th><th>NAME</th><th>Region</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.list}" var="dto">
				<tr>
					<td>${pageScope.dto.country_id }</td>
					<td>${pageScope.dto.country_name }</td>
					<td>${pageScope.dto.region_id }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<c:import url="../temps/bootstrap_js.jsp"></c:import>
</body>
</html>