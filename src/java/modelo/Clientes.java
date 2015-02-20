package modelo;

import java.sql.SQLException;

public class Clientes {
    
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String telefone;
    private String email;
    private String senha;
    private ClientesDAO dao;
    
    /** Creates a new instance of Cliente */
    public Clientes() {
    }
    
    public void incluir() throws Exception {
        dao = new ClientesDAO();
        System.out.println("dentro do incluir dos clientes ");
        dao.incluir(nome,endereco,cidade,estado,telefone,email,senha);
    }
    public boolean testaLoginCliente (String name, String pwd) throws SQLException {
        dao = new ClientesDAO();
        return dao.testaLoginCliente (name, pwd);
    }

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

  /*  public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
*/
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
}
