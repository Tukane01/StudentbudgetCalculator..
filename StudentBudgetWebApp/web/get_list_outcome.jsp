<%-- 
    Document   : get_list_outcome
    Created on : May 12, 2025, 10:39:35 PM
    Author     : Tshegogatso
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.Student"%>
<%@page import="za.ac.tut.entities.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Outcome Page</title>
    </head>
    <body>
        <h1>List Outcome</h1>
        
        <%
            List<Student> list = (List<Student>)request.getAttribute("list");
            
        %>
        <p>
                Below are the details of the student:
            </p>
            
            <table>
                <%
                    for(int i=0; i< list.size(); i++){
                       Student s= list.get(i);
                       
                       String name = s.getName();
                       String surname = s.getSurname();
                       Long studno  = s.getStudentNumber();
                       Double allowance = s.getAllowance();
                       String bursary = s.getBursary();
                       
                    
                %>
                
                
             <tr>
                <td>Name:</td>
                <td><%=name%></td>
            </tr>
             <tr>
                <td>Surname:</td>
                <td><%=surname%></td>
            </tr>
             <tr>
                <td>Student Number:</td>
                <td><%=studno%></td>
            </tr>
             <tr>
                <td>Bursary:</td>
                <td><%=bursary%></td>
            </tr>
             <tr>
                <td>Allowance:</td>
                <td><%=allowance%></td>
            </tr>
            <%
                }
            %>
            
            <p>
            Please click <a href="index.html">here</a> to go back to the home page
            Please click <a href="menu.jsp">here</a> to go back to the menu page.
        </p>
    </body>
</html>
