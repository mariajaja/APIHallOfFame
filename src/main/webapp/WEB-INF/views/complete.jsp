<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete List</title>
</head>
<body>
	<a href="/">Home</a>
	<div> 
	    <table>
	    	<thead>
	        <tr>
	            <th>First Name</th>
	            <th>Last Name</th>
	            <th>Innovation</th>
	            <th>Year</th>
	        </tr>
	        </thead>
	        <tbody>
		        <c:forEach var="complete" items="${ completeList }">
		            <tr>
		                <td>${ complete.firstName }</td>
		                <td>${ complete.lastName }</td>
		                <td>${ complete.innovation }</td>
		                <td>${ complete.year }</td>
		            </tr>
		        </c:forEach>
	        </tbody>
	    </table>
    </div> 
</body>
</html>