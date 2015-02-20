package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Eduardo
 */
public class LoginActionForm extends org.apache.struts.action.ActionForm {

    private String name;
    private String senhaUsuario;

    public String getName() {
        return name;
    }

    public void setName(String string) {
        name = string;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public LoginActionForm() {
        super();
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getName() == null || getName().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
        }
        else if (getSenhaUsuario() == null || getSenhaUsuario().length() < 1) {
            errors.add("senhaUsuario",new ActionMessage("error.senha.required"));
        }
        return errors;
    }
}
