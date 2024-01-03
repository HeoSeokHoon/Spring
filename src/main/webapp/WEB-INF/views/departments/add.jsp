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
    
    <section class="container-fluid" id="contents">
    	<div class="row mt-4">
			<form action="add" method="post">
			  <div class="mb-3">
			    <label for="departmentId" class="form-label">Department_ID</label>
			    <input type="text" class="form-control" id="departmentId" name="department_id" aria-describedby="idHelp">
			    <div id="idHelp" class="form-text"> 중복되지않게 유의하세요 </div>
			  </div>
			  <div class="mb-3">
			    <label for="departmentName" class="form-label">Department_Name</label>
			    <input type="text" class="form-control" id="departmentName" name="department_name">
			  </div>
			  <div class="mb-3">
			    <label for="locationId" class="form-label">Location_ID</label>
			    <input type="text" class="form-control" id="locationID" name="location_Id">
			  </div>
			  <div class="mb-3">
			    <label for="managerId" class="form-label">Manager_ID</label>
			    <input type="text" class="form-control" id="managerId" name="manager_id">
			  </div>
			  
			  <button type="submit" class="btn btn-primary">Add</button>
			</form>
    	</div>
    </section>

	
	<c:import url="../temps/bootstrap_js.jsp"></c:import>
</body>

</html>
