/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Vector;

/**
 *
 * @author Admin
 */
public class Programas {
        
    private ProgramasDao dao;
    private int codigo;
    private String data;    
    private String hora;
    private String lugar;
    private int codservico;
    private int qtde;
    private String nomeC;
    
    public Programas () {
        
    }

    public void incluirProgram() throws Exception {
        dao = new ProgramasDao();    
        dao.incluirProgram( codigo, data, hora, lugar, codservico, qtde, nomeC);
    }
    
    public Vector listaProgramGirls (String garota) {
        dao = new ProgramasDao();
        return dao.buscaProgramGarota(garota);
    }

    
    public String getNomeC() {
        return nomeC;
    }

    public void setNomeC(String nomeC) {
        this.nomeC = nomeC;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodservico() {
        return codservico;
    }

    public void setCodservico(int codservico) {
        this.codservico = codservico;
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

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    
}