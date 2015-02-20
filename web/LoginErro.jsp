<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dados Inválidos</title>
    </head>
    <body bgcolor="red">
        <html:link action ="/login">Voltar</html:link>    
        <h3>Por favor entre com dados válidos,</h3>
        <h3>o que pode ter acontecido:</h3>
        <h3><font color = "white"><strong>=></strong></font> login inexistente e/ou   </h3>
        <h3><font color = "white"><strong>=></strong></font> senha inválida</h3>
    </body>
</html>
