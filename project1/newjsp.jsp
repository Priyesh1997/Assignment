<%-- 
    Document   : newjsp
    Created on : Oct 31, 2018, 2:03:55 PM
    Author     : hp
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
           int  x = 10;
           for(int i = 1;i<=10;i++)
           out.println("Hello World");
          
        %>
        <ul>
            <%
            String name =(String) request.getAttribute("name");
            String pwd = (String)request.getAttribute("pwd");
             for(int i = 1; i <= 10; i++){
             
                  %>
                  <li> <%= i %></li>
               <%
            
              }
            %>
        </ul>
    </body>
</html>
