/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import modelo.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Eduardo
 */
public class CadastrandoActionForm extends org.apache.struts.action.ActionForm {

    private Clientes c;
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String telefone;
    private String email;
    private String senha;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public CadastrandoActionForm() {
        super();
    // TODO Auto-generated constructor stub
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();

        c = new Clientes();
        if (getNome() == null || getNome().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));

        } else if (getEndereco() == null || getEndereco().length() < 1) {
            errors.add("endereco", new ActionMessage("error.endereco.required"));

        } else if (getCidade() == null || getCidade().length() < 1) {
            errors.add("cidade", new ActionMessage("error.cidade.required"));

        } else if (getEstado() == null || getEstado().length() < 1) {
            errors.add("estado", new ActionMessage("error.estado.required"));

        } else if (getTelefone() == null || getTelefone().length() < 1) {
            errors.add("telefone", new ActionMessage("error.telefone.required"));

        } else if (getEmail() == null || getEmail().length() < 1) {
            errors.add("email", new ActionMessage("error.email.required"));

        } else if (getSenha() == null || getSenha().length() < 1) {
            errors.add("senha", new ActionMessage("error.senha.required"));

        }

        c.setNome(getNome());
        c.setEndereco(getEndereco());
        c.setCidade(getCidade());
        c.setEstado(getEstado());
        c.setTelefone(getTelefone());
        c.setEmail(getEmail());
        c.setSenha(getSenha());
        request.getSession(true).setAttribute("cli", c);
        return errors;
    }
}
