/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import java.util.Vector;
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
public class GPLogandoAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private final static String INFOACOMPANHANTE = "acompanhantesucesso";
    private final static String ERRORGIRL = "errorgirl";
    private final static String SEMPROGRAMAS = "semprogramas";
    
    private Garota garota;
    private Programas prog;/*para imprimir os programas da garota na tela*/

    private Vector v;

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        garota = new Garota();
        prog = new Programas();

        GPLogandoActionForm gpaf = (GPLogandoActionForm) form;

        if (garota.testaloginGarota(gpaf.getNameGP(), gpaf.getSenhaGP())) {
            System.out.println("\n\nantes do sucesso\n\n");
            v = prog.listaProgramGirls(gpaf.getNameGP());
            if (!v.isEmpty()) {
                System.out.println("agora vai ocorrer sucesso");
                request.getSession(true).setAttribute("vec",v);
                return mapping.findForward(INFOACOMPANHANTE);
            } else {
                System.out.println("Antes de encaminhar para sem programas");
                return mapping.findForward(SEMPROGRAMAS);
            }
        }
        return mapping.findForward(ERRORGIRL);
    }
}
