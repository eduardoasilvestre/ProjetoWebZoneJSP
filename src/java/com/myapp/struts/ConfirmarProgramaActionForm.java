/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import modelo.*;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Eduardo
 */
public class ConfirmarProgramaActionForm extends org.apache.struts.action.ActionForm {

    private Clientes c;
    private Programas prog;
    private String codigo;
    private String data;
    private String hora;
    private String lugar;
    private String codservico;
    private String qtde;

    public String getCodservico() {
        return codservico;
    }

    public void setCodservico(String codservico) {
        this.codservico = codservico;
    }

    public String getQtde() {
        return qtde;
    }

    public void setQtde(String qtde) {
        this.qtde = qtde;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public ConfirmarProgramaActionForm() {
        super();
    // TODO Auto-generated constructor stub
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        prog = new Programas();
        if (getCodigo() == null || getCodigo().length() < 1) {
            errors.add("endereco", new ActionMessage("error.codigo"));

        } else if (getData() == null || getData().length() < 1) {
            errors.add("cidade", new ActionMessage("error.data"));

        } else if (getHora() == null || getHora().length() < 1) {
            errors.add("estado", new ActionMessage("error.hora"));

        } else if (getLugar() == null || getLugar().length() < 1) {
            errors.add("telefone", new ActionMessage("error.lugar"));
        } else if (getCodservico() == null || getCodservico().length() < 1) {
            errors.add("codservico", new ActionMessage("error.servico"));
        } else if (getQtde() == null || getQtde().length() < 1) {
            errors.add("qtde", new ActionMessage("error.qtde"));
        }
        String  a = (String) request.getSession(false).getAttribute("cliente");
        //o nome e setado aqui
        prog.setNomeC(a);
        //prog.setNomeC("nome do cliente");
        prog.setCodigo(Integer.parseInt(getCodigo()));
        prog.setData(getData());
        prog.setHora(getHora());
        prog.setLugar(getLugar());
        prog.setCodservico(Integer.parseInt(getCodservico()));
        prog.setQtde(Integer.parseInt(getQtde()));
        request.getSession(true).setAttribute("programa", prog);

        return errors;
    }
}
