/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.*;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

/**
 *
 * @author Eduardo
 */
public class LoginAction extends org.apache.struts.action.Action {

    private final static String SUCESSO = "sucesso";
    private final static String ERRORLOGIN = "errorlogin";
    private Clientes cl,  aux;

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        cl = new Clientes();

        aux = new Clientes();

        LoginActionForm lag = (LoginActionForm) form;

        aux.setNome(lag.getName());//nome auxiliar


        if ((cl.testaLoginCliente(lag.getName(), lag.getSenhaUsuario()))) {
            //passando o nome do usuario
            request.getSession(true).setAttribute("cliente", aux.getNome());
            return mapping.findForward(SUCESSO);
        }
        return mapping.findForward(ERRORLOGIN);
    }
}
