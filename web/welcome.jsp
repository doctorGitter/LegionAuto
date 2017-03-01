<%-- 
    Document   : welcome.jsp
    Created on : Feb 3, 2017, 2:41:01 PM
    Author     : sourabh.a.mahajan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Welcome <%=session.getAttribute("name")%></title>
    </head>
    <body>
        <h3>Login successful!!!</h3>
        <h4>
            Hello,
            <%=session.getAttribute("name")%></h4>
    </body>
</html>
