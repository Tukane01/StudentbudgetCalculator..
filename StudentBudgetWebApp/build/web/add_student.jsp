<%-- 
    Document   : add_student
    Created on : May 12, 2025, 3:44:09 PM
    Author     : Tshegogatso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Student Page</title>
    </head>
    <body>
        <h1>Add Student Page</h1>
        <p>
            Please enter the following details below
        </p>
        
        <form action="AddStudentServlet.do" method="POST">
            <table>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name"/></td>
                </tr>
                <tr>
                    <td>Surname:</td>
                    <td><input type="text" name="surname" required=""/></td>
                </tr>
                <tr>
                    <td>Student Number:</td>
                    <td><input type="text" name="studno" required=""/></td>
                </tr>
                <tr>
                    <td>Allowance:</td>
                    <td><input type="text" name="allowance" required=""/></td>
                </tr>
                <tr>
                    <td>Bursary:</td>
                    <td>
                        <select name="bursary">
                            <option select="SF">Self-Funded</option>
                            <option select="F">Funded</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Date of Allowance:</td>
                    <td><input type="date" name="allowanceDate" required=""/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="ADD STUDENT"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
