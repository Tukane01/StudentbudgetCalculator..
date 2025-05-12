<%-- 
    Document   : find_student_outcome
    Created on : May 12, 2025, 10:15:25 PM
    Author     : Tshegogatso
--%>

<%@page import="za.ac.tut.entities.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Find Student Page</title>
    </head>
    <body>
        <h1>Found Successfully</h1>
        
        <%
            Student s =(Student)request.getAttribute("student");
        %>
        
        <p>
           <%=s.getName()%> <%=s.getSurname()%> <%=s.getStudentNumber()%> has been found.
        </p>
        
        <p>
            Please click <a href="index.html">here</a> to go back to the home page
            Please click <a href="menu.jsp">here</a> to go back to the menu page.
        </p>
    </body>
</html>
