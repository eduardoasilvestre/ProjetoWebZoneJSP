<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bem vindo ao Web-Zone</title>
    </head>
    
    <body>
        <h1><center><body bgcolor="RED"><blink><font color = "white">Web-Zone...sua nova Zona da Web</font></blink></body></center></h1
        <hr>
    
    <html:form action = "login">
        <bean:message key ="login.nome" />
        <html:text  property="name" /><br>
        <bean:message  key ="login.senha" />
        <html:password size="4"  property ="senhaUsuario" /><br>
        <html:submit value = "Entrar" />
    </html:form>
    <html:errors /><br><br><br><br>
    
    <html:form action = "aindanaoecadastrado">
        <html:submit value = "Ainda nao e cadastrado ?" /><br><br><br><br><br>
    </html:form>
    
    <html:form action = "gplogin">
        <bean:message key ="login.acompanhante" />
        <html:text property="nameGP" /><br>
        <bean:message  key ="login.senhagp" />
        <html:password size="4" property ="senhaGP" /><br>
        <html:submit value = "Acompanhante Aqui" />
    </html:form>
    <html:errors />
    <hr><!--passa uma linha horizontal na tela-->
    <h2><center><font color = "white">Danilo Ribeiro de Oliveira 1042255-8</font></center></h2>
    <h2><center><font color = "white">Eduardo Augusto Silvestre  1042258-2</font><center></h2>
    <h2><center><font color = "white">Thiago Henrique de Jesus   10422579-5</font><center></h2>
        </body>
</html>
