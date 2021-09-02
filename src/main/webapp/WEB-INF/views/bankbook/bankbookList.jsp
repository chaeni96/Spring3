<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html>
<html>
<head>
	<title>Insert title here</title>
	<c:import url="../temp/boot_head.jsp"></c:import>
</head>

<body>
	<c:import url="../temp/boot_nav.jsp"></c:import>
	<h1>List Renewal</h1>	

	<div class="container-fluid">
		<div class="col-md-8 my-2 mx-auto">
			<table class="table table-hover">
				<tr>
					<th>판매번호</th><th>제품명</th><th>이자율</th>
				</tr>
				
				
				<c:forEach items="${list}" var="dto">
				<tr>
				<td>${dto.bookNumber}</td>
				<td><a href="./bankbookSelect?bookNumber=${dto.bookNumber }" >${dto.bookName}</a></td>
				<td>${dto.bookRate}</td>
				</tr>
				</c:forEach>
			
			</table>
		
			<a href="./bankbookInsert" class="btn btn-danger">ADD</a>		
		</div>
	
	
	</div>

</body>
</html>