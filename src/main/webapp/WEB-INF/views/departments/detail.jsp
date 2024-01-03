<%@page import="com.winter.app.regions.RegionDTO"%>
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
    
    <section class="container-fluid">
    	<div>
    		<c:if test="${not empty dto}">
    			<h3>${dto.department_id}</h3>
    			<div>${dto.department_name}</div>
    			<div>${dto.location_id}</div>
    			<div>${dto.manager_id}</div>
    		</c:if>
    		 
    		<c:if test="${empty dto}">
    			<h3>없는 번호 입니다</h3>
    		</c:if>
    		
    	</div>
    </section>

	
	<c:import url="../temps/bootstrap_js.jsp"></c:import>
</body>

</html>
