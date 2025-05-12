<%-- 
    Document   : list_students
    Created on : May 12, 2025, 10:32:35 PM
    Author     : Tshegogatso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Students Page</title>
    </head>
    <body>
        <h1>List Students Page</h1>
        <p>
           Please click on the following button to get a list of the students.
        </p>
        <form action="GetListServlet.do" method="POST">
            <table>
                <tr>
                    <td></td>
                    <td><input type="submit" value="ENTER"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
