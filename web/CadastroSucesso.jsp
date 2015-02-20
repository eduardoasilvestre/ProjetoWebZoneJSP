<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Preencha o formulario !!!</title>
    </head>
    <body bgcolor="red">
        <h1>Preencha os dados abaixo para realizar seu cadastro.</h1>
       <html:form action = "cadastrando">
            
            <bean:message key ="login.nome" />
            <html:text  property="nome" /><br>
            
            <bean:message key ="login.endereco" />
            <html:text  property="endereco" /><br>
            
            <bean:message key ="login.cidade" />
            <html:text property="cidade" /><br>
            
            <bean:message key ="login.estado" />
            <html:text size="2"  property="estado" /><br>
            
            <bean:message key ="login.telefone" />
            <html:text size ="12"  property="telefone" /><br>
            
            <bean:message key ="login.email" />
            <html:text  property="email" /><br>
            
            <bean:message key ="login.senha" />
            <html:password size ="3"  property="senha" /> 
            <bean:message key = "login.senha.obrigatoria" /><br><br>
                
            <html:submit value = "Gravar" />
        </html:form>
        <html:errors />
    </body>
</html>
