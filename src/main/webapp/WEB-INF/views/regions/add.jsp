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
			  <!-- <div class="mb-3">
			    <label for="regionId" class="form-label">Region_ID</label>
			    <input type="text" class="form-control" id="regionId" name="region_id" aria-describedby="idHelp">
			    <div id="idHelp" class="form-text"> 중복되지않게 유의하세요 </div>
			  </div> -->
			  <div class="mb-3">
			    <label for="regionName" class="form-label">Region_Name</label>
			    <input type="text" class="form-control" id="regionName" name="region_name">
			  </div>
			  
			  <button type="submit" class="btn btn-primary">Add</button>
			</form>
    	</div>
    </section>

	
<c:import url="../temps/bootstrap_js.jsp"></c:import>
</body>

</html>
