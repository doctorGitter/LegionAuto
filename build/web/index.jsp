<%-- 
    Document   : index
    Created on : Feb 3, 2017, 2:39:46 PM
    Author     : sourabh.a.mahajan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Login Application</title>
    </head>
    <body>
        <form action="loginServlet" method="post">
            <fieldset style="width: 300px">
                <legend> Login to App </legend>
                <table>
                    <tr>
                        <td>User ID</td>
                        <td><input type="text" name="username" required="required" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="userpass" required="required" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login" /></td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </body>
</html>
