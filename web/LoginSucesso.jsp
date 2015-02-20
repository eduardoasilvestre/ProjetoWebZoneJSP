<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login sucesso</title>
    </head>
    <body bgcolor="red">
        <html:link action="inicio"> Ao início </html:link><br>
        <h1><center>Web-Zone...sua nova Zona da Web.<center></h1>
        
        <br><br><br><br>
        <html:link action ="/listgirls"><center><font size=+5> Listar garotas disponíveis</font></center> </html:link>
        <br><br>
        
        <html:link action ="/listservices"> <center><font size=+5> Listar serviços disponíveis</font></center></html:link>
        
        <br><br>
        <html:link action ="/agendarprograma"><center><font  size=+5><U>==> Agendar um programa garotão !!! <==</U> </font></html:link>    
        
    </body>
</html>
