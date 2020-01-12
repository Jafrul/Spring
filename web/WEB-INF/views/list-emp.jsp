<%-- 
    Document   : list-employee
    Created on : Jan 9, 2020, 5:27:16 PM
    Author     : bilt
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>emp list</h1>
        <c:forEach var="e" items="${empList}">
            ${e.name}
        </c:forEach>
    </body>
</html>
