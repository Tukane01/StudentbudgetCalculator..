<%-- 
    Document   : expense_list
    Created on : May 12, 2025, 10:43:13 PM
    Author     : Tshegogatso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Expense List Page</title>
    </head>
    <body>
        <h1>Expense List</h1>
        
        <p>
            Please click the following button
        </p>
        <form action="GetExpenseListServlet.do" method="POST">
            <table>
                <tr>
                    <td></td>
                    <td><input type="submit" value="ENTER"/></td>
                </tr>
            </table>
        </form>
        
    </body>
</html>
