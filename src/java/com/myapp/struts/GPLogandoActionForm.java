/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Eduardo
 */
public class GPLogandoActionForm extends org.apache.struts.action.ActionForm {

    private String nameGP;
    private String senhaGP;

    /**
     * @return
     */
    public String getNameGP() {
        return nameGP;
    }

    public void setNameGP(String string) {
        nameGP = string;
    }

    public String getSenhaGP() {
        return senhaGP;
    }

    public void setSenhaGP(String senhaUsuario) {
        this.senhaGP = senhaUsuario;
    }

    public GPLogandoActionForm() {
        super();
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getNameGP() == null || getNameGP().length() < 1) {
            errors.add("nameGP", new ActionMessage("error.name.required"));
        } else if (getSenhaGP() == null || getSenhaGP().length() < 1) {
            errors.add("senhaGP", new ActionMessage("error.senha.required"));
        }

        return errors;
    }
}
