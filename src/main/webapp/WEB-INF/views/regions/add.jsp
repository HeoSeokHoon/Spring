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
    <!-- summernote -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
  </head>
<body>
	<c:import url="../temps/header.jsp"></c:import>
    
    <section class="container-fluid" id="contents">
    	<div class="row mt-4">
			<form action="add" method="post" enctype="multipart/form-data">
			  <div class="mb-3">
			    <label for="regionName" class="form-label">Region_Name</label>
			    <input type="text" class="form-control" id="regionName" name="region_name">
			  </div>
			  
			  <div class="mb-3">
			  	<label for="regioncontents" class="form-label">RegionContents</label>
			  	<textarea id="regioncontents" class="form-control"></textarea>
			  </div>
			  
			  <div class="mb-3">
			  	<input type="file" name="photo">
			  </div>
			  
			  <button type="submit" class="btn btn-primary">Add</button>
			</form>
    	</div>
    </section>

<script>
	$('#regioncontents').summernote()
</script>
	
<c:import url="../temps/bootstrap_js.jsp"></c:import>
</body>

</html>
