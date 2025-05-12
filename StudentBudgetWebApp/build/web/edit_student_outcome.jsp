<%-- 
    Document   : edit_student_outcome
    Created on : May 12, 2025, 10:09:36 PM
    Author     : Tshegogatso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Student Outcome Page</title>
    </head>
    <body>
        <h1>Edited Successfully</h1>
        
        <%
            Long studno = (Long)request.getAttribute("studno");
        String categories = (String)request.getAttribute("categories");
        Double amount = (Double)request.getAttribute("amount");
        %>
        
        <p>
            <%=categories%> and <%=amount%> have been successfully added to the database.
        </p>
        
        
        <p>
            Please click <a href="index.html">here</a> to go back to the home page
            Please click <a href="menu.jsp">here</a> to go back to the menu page.
        </p>
     
    </body>
</html>
