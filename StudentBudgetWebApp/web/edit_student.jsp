<%-- 
    Document   : edit_student
    Created on : May 12, 2025, 3:44:48 PM
    Author     : Tshegogatso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Page</title>
    </head>
    <body>
        <h1>Edit Student Page</h1>
        <p>
            Please note that you are only editing your expenses
        </p>
        <form action="EditStudentServlet.do" method="POST">
            <table>
            <tr>
                    <td>Student Number:</td>
                    <td><input type="text" name="studno" required=""/></td>
                </tr>
                <td>Categories:</td>
                    <td>
                        <select name="categories">
                            <option select="groceries">Groceries</option>
                            <option select="Clothes">Clothes</option>
                            <option select="Takeaway">Takeaway</option>
                        </select>
                    </td>
                    <tr>
                    <td>Amount:</td>
                    <td><input type="text" name="amount" required=""/></td>
                </tr>
                     <tr>
                    <td></td>
                    <td><input type="submit" value="EDIT"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
