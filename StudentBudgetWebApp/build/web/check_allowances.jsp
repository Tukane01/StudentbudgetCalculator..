<%-- 
    Document   : newjsp
    Created on : May 12, 2025, 3:47:31 PM
    Author     : Tshegogatso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Allowance Page</title>
    </head>
    <body>
        <h1>Check Allowance Page</h1>
        <p>
            Please enter the following down below
        </p>
        
        <form action="CheckAllowanceServlet.do" method="POST">
            <table>
                <tr>
                    <td>Minimum Allowance:</td>
                    <td><input type="text" name="min"/></td>
                </tr>
                <tr>
                    <td>Maximum Allowance:</td>
                    <td><input type="text" name="max"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="ENTER"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
