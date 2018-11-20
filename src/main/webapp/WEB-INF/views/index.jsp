<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<div> 
	<a href="/complete">Complete List</a>
	    <table>
	    	<thead>
	        <tr>
	            <th>Name</th>
	            <th>Invented</th>
	            <th>Year</th>
	        </tr>
	        </thead>
	        <tbody>
		        <c:forEach var="tiny" items="${ tinyList }">
		            <tr>
		                <td>${ tiny.name }</td>
		                <td>${ tiny.invented }</td>
		                <td>${ tiny.year }</td>
		            </tr>
		        </c:forEach>
	        </tbody>
	    </table>
    </div> 
</body>
</html>