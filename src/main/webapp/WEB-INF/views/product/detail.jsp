<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temps/bootstrap_css.jsp"></c:import>
</head>
<body>
	<c:import url="../temps/header.jsp"></c:import>
	<section class="container-fluid">
		<div>
			<c:if test="${not empty detail}">
				<h3>${detail.productNum}</h3>
				<h3>${detail.productName}</h3>
				<h3>${detail.productContents}</h3>
				<h3>${detail.productRate}</h3>
				<h3>${detail.productJumsu}</h3>
			</c:if>
			<c:if test="${empty detail}">
				<h3>없는 번호 입니다</h3>
			</c:if>
		</div>
	</section>
<c:import url="../temps/bootstrap_js.jsp"></c:import>
</body>
</html>