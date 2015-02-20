
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dados gravados corretamente</title>
    </head>
    <body bgcolor="red">
        <h2>Os seus dados foram gravados corretamente !!</h2>
        
        
        <html:form action = "backToHome">
            <html:submit value = "Inicio" />
        </html:form>
    </body>
</html>
