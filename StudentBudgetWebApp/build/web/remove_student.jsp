<%-- 
    Document   : remove_student
    Created on : May 12, 2025, 3:45:14 PM
    Author     : Tshegogatso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove Student Page</title>
    </head>
    <body>
        <h1>Remove Student Page</h1>
        <p>
            Please enter the following to remove the student
        </p>
        <form action="RemoveStudentServlet.do" method="POST">
            <table>
                 <tr>
                    <td>Student Number:</td>
                    <td><input type="text" name="studno" required=""/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="REMOVE"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
