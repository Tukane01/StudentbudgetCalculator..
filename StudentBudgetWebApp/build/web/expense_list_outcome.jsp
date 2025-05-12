<%-- 
    Document   : expense_list_outcome
    Created on : May 12, 2025, 10:49:23 PM
    Author     : Tshegogatso
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.Expense"%>
<%@page import="za.ac.tut.entities.Expense"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Expense List Page</title>
    </head>
    <body>
        <h1>Expense List</h1>
        
         <%
            List<Expense> list = (List<Expense>)request.getAttribute("list");
            
        %>
        <p>
                Below are the details of the student:
            </p>
            
            <table>
                <%
                    for(int i=0; i< list.size(); i++){
                       Expense e= list.get(i);
                       
                       String studno  = e.getStudentNumber();
                       String categories = e.getCategory();
                       Double amount = e.getAmount();
                       
                    
                %>
                
                
             <tr>
                <td>Student Number:</td>
                <td><%=studno%></td>
            </tr>
             <tr>
                <td>Category:</td>
                <td><%=categories%></td>
            </tr>
             <tr>
                <td>Amount:</td>
                <td><%=amount%></td>
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
