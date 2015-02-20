<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agende o seu programa</title>
    </head>
    <body bgcolor="red">
        <html:link action = "backmenu">Voltar</html:link><br>
        <h2>Agende o seu programa.</h2><br>
        <html:form action ="saveprogam">
            <bean:message key ="programa.garota" />
            <html:text size="2" property="codigo" /><br>
            
            <bean:message key ="programa.data" />
            <html:text size="8" property="data" /><br>
            
            <bean:message key ="programa.hora" />
            <html:text size="5" property="hora" /><br>
            
            <bean:message key ="programa.lugar" />
            <html:text  property="lugar" /><br>
                
            <bean:message key = "programa.servico" />
            <html:text  size="1" property ="codservico" /><br>
            
            <bean:message key = "programa.quantidade" />
            <html:text size="1" property ="qtde"/><br><br>
            
            <html:submit value ="Confirmar" />
        </html:form>
        <html:errors />
        
    </body>
</html>
