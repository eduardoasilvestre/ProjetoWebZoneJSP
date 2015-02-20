<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Abaixo os serviços disponíveis.</title>
    </head>
    <body bgcolor="red">
        <html:link action = "backservices">Voltar</html:link>
        <br>
            
        <h2><center>Serviços disponíveis:<center</h2>
        

        <TABLE BORDER=6  color ="black" ALIGN="center">
            <TR> <! Cria a primeira linha da tabela>
                <TD><font size=+5 color = "white"><b>Código</b></font> </TD> <! Aqui foi criada uma célula>
                <TD><font size=+5 color = "white"><b>Nome do serviço</b></font> </TD> <! Aqui foi criada uma célula>
                <TD><font size=+5 color = "white"><b>Valor do serviço</b></font> </TD>
            </TR> <! Fecha a primeira linha da tabela>
            <TR>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.c1"/></b></font></TD>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.m1"/></b></font></TD>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.m1.preco"/></b></font></TD>
            </TR>
            <TR>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.c2"/></b></font></TD>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.m2"/></b></font></TD>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.m2.preco"/></b></font></TD>
            </TR>
            <TR>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.c3"/></b></font></TD>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.oral"/></b></font></TD>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.oral.preco"/></b></font></TD>
            </TR>
            <TR>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.c4"/></b></font></TD>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.v1"/></b></font></TD>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.v1.preco"/></b></font></TD>
            </TR>
            <TR>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.c5"/></b></font></TD>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.v2"/></b></font></TD>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.v2.preco"/></b></font></TD>
            </TR>
            <TR>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.c6"/></b></font></TD>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.v3"/></b></font></TD>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.v3.preco"/></b></font></TD>
            </TR>
            <TR>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.c7"/></b></font></TD>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.anal"/></b></font></TD>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.anal.preco"/></b></font></TD>
            </TR>
            <TR>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.c8"/></b></font></TD>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.tantrico"/></b></font></TD>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.tantrico.preco"/></b></font></TD>
            </TR>
            <TR>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.c9"/></b></font></TD>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.completo1"/></b></font></TD>
                <TD><font size=+2 color="yellow"><b><bean:message key ="servico.completo1.preco"/></b></font></TD>
            </TR>
        </TABLE>
        
        <h1><center><blink> <font color = "white">Previna-se: USE CAMISINHA !!!</font></blink></center></h1>
    </body>
</html>
