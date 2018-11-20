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
    
    <table>
        <tr>
            <th>Name</th>
            <th>Invented</th>
            <th>Year</th>
        </tr>
        <c:forEach var="tiny" items="tinies">
            <tr>
                <td>${ tiny.name }</td>
                <td>${ tiny.invented }</td>
                <td>${ tiny.year }</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>