<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "modelo.*" %>
<%@page import = "com.myapp.struts.*"%>
<%@page import = "java.util.Vector"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Programas da garota</title>
    </head>
    <body bgcolor="red">
        
        <html:link action = "gpback"> Deslogue aqui querida </html:link><br><br>
        <h2> Querida seus programas estao listados abaixo... </h2>
        
        <%! String a; %>
        <% Vector v = (Vector) request.getSession(false).getAttribute("vec"); 
       out.println("<img src = \""+"barbara.jpg"+"\" width=\"135\" height=\"200\"/>");
       out.println("\n\n");
            for ( int i = 0; i < v.size();i++) {
                a = (String)v.get(i);
                out.println(a);
            }
          
        %>
        <!-- String a = "barbara.jpg";%
        
        -->
        
    </body>
</html>
