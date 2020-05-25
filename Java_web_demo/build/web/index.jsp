<%-- 
    Document   : index
    Created on : May 3, 2020, 5:01:22 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            String name = (String) request.getAttribute("u");
            if (name==null){
                response.sendRedirect("Login.jsp");
            }
                else{
            
            %>
            <h1>Wellcome to : <%=name%></h1>
            <%}%>
    </body>
</html>
