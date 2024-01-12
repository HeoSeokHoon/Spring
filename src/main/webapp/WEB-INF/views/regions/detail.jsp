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
    			<h3>${dto.region_id}</h3>
    			<div>${dto.region_name}</div>
    			<div>
    				<h2>FILE</h2>
    				<c:forEach items="${dto.regionFileDTOs}" var="f">
    				<a href="/resources/upload/regions/${f.fileName}">${f.oriName}</a><br>				
    				</c:forEach>
    			</div>
				<button class="btn btn-primary" id="up" data-region-id="${dto.region_id}">Update</button>
    			<button class="btn btn-primary" id="del">Delete</button>
    			<form id="frm" action="./delete" method="post">
    				<input type="hidden" name="region_id" value="${dto.region_id}">
    			</form>
    		</c:if>
    		
    		<c:if test="${empty dto}">
    			<h3>없는 번호 입니다</h3>
    		</c:if>
    		
    	</div>
    </section>

	
<c:import url="../temps/bootstrap_js.jsp"></c:import>
<script src="../resources/js/regionDetail.js"></script>
</body>

</html>
