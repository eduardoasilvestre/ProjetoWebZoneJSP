    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.*;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

/**
 *
 * @author Eduardo
 */
public class CadastrandoAction extends org.apache.struts.action.Action {
    private Clientes clientes;
    /* forward name="success" path="" */
    private final static String CADASTRADO = "cadastraragora";
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        System.out.println("\n\nantes do cadastrando action form\n\n");
     //   CadastrandoActionForm c = (CadastrandoActionForm) form;
        //clientes = new Clientes();
        clientes = (Clientes) request.getSession(false).getAttribute("cli");
        
        
        
        //clientes.incluir(0, request.getParameter("nome"),request.getParameter("endereco"), c.getCidade(), c.getEstado(), c.getTelefone(), c.getEmail(),c.getSenha());
        clientes.incluir();
        System.out.println("antes do mapping.findForward");
        return mapping.findForward(CADASTRADO);
        
    }
}
