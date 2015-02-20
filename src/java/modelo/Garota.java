/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

//import java.sql.SQLException;
/**
 *
 * @author Admin
 */
public class Garota {
    private int id;
    private String nome;
    private String altura;
    private String peso;
    private String olhos;
    private String cabelos;
    private String fetiche;
    private int idade;
    private String senha;
    private GarotaDao dao;
    
    public Garota () {        
    }
    
    public boolean testaloginGarota ( String n, String p) throws Exception {
        dao = new GarotaDao();
        return dao.testaLoginGarota(n, p);
    }
    
    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getCabelos() {
        return cabelos;
    }

    public void setCabelos(String cabelos) {
        this.cabelos = cabelos;
    }

    public String getFetiche() {
        return fetiche;
    }

    public void setFetiche(String fetiche) {
        this.fetiche = fetiche;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOlhos() {
        return olhos;
    }

    public void setOlhos(String olhos) {
        this.olhos = olhos;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
