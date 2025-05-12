<%-- 
    Document   : remove_student_outcome
    Created on : May 12, 2025, 9:56:30 PM
    Author     : Tshegogatso
--%>

<%@page import="za.ac.tut.entities.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove Student Page</title>
    </head>
    <body>
        <h1>Removed Successfully</h1>
        <%
            Student s =(Student)request.getAttribute("student");
        %>
        <p>
            <%=s.getStudentNumber()%> has been removed successfully from the database.
        </p>
        <p>
            Please click <a href="index.html">here</a> to go back to the home page
            Please click <a href="menu.jsp">here</a> to go back to the menu page.
        </p>
    </body>
</html>
