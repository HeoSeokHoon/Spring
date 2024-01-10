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
	<div class="container m-2">
		<h1>Regions List</h1>
		
		<div>
			<form class="row g-3">
				<div class="col-sm-10">
					<select class="form-select form-select-sm" name="kind">
					  <option value="kind1">제목</option>
					  <option value="kind2">내용</option>
					  <option value="kind3">작성자</option>
					  <option value="kind4">제목&내용&작성자</option>
					</select>
				</div>
				<div class="col-sm-10">
				  <label for="search" class="visually-hidden">Search</label>
				  <input type="text" name="search" class="form-control form-control-sm" id="search" value="${pager.search}">
				</div>
				<div class="col-sm-10">
				  <button type="submit" class="btn btn-primary mb-3">Search</button>
				</div>
			</form>
		</div>
		
		<table class="table table-hover">
			<thead>
				<tr>
					<th>ID</th><th>NAME</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${requestScope.list}" var="dto">
					<tr>
						<td>${pageScope.dto.region_id}</td>
						<td><a href="./detail?region_id=${dto.region_id}">${pageScope.dto.region_name}</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<div>
			<nav aria-label="Page navigation example">
			  <ul class="pagination">
			  	<c:if test="${!pager.start}">
				    <li class="page-item">
				      <a class="page-link" href="./list?page=${pager.startNum-1}&search=${pager.search}&kind=${pager.kind}" aria-label="Previous">
				        <span aria-hidden="true">&laquo;</span>
				      </a>
				    </li>
			    </c:if>
			    
			    <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
			    	<li class="page-item"><a class="page-link" href="./list?page=${i}&search=${pager.search}&kind=${pager.kind}">${i}</a></li>			    
			    </c:forEach>
			    
			    <c:if test="${!pager.last}">
				    <li class="page-item">
				      <a class="page-link" href="./list?page=${pager.lastNum+1}&search=${pager.search}&kind=${pager.kind}" aria-label="Next">
				        <span aria-hidden="true">&raquo;</span>
				      </a>
				    </li>
			    </c:if>
			  </ul>
			</nav>
		</div>
		
		<a class="btn btn-secondary" role="button" href="./add">Add</a>
		
		<c:import url="../temps/bootstrap_js.jsp"></c:import>
	</div>
</body>

</html>