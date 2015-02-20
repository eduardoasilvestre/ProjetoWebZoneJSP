package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.*;

public class ClientesDAO {

    private Connection conn;
    private PreparedStatement pstmt;
    private Statement stmt;
    private String query;
    private int id;

    public ClientesDAO() {
    }

    public void incluir(String n, String end, String city,
            String est, String tel, String mail, String pswd) throws Exception {

        try {
            conn = ConnectionFactory.getConnection();
            //executa select para obter o nro de registros
            query = "select * from web_zone.clientes";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            //atribui valor id de acordo com valor do id do ultimo registro do banco
            while (rs.next()) {
                id = rs.getInt(1) + 1;
            }

            query = "insert into web_zone.clientes (id,nome,endereco,cidade,estado," +
                    "telefone,email,senha) values (?,?,?,?,?,?,?,?)";

            pstmt = conn.prepareStatement(query);
            // preenche os valores
            pstmt.setInt(1, id);
            pstmt.setString(2, n);
            pstmt.setString(3, end);
            pstmt.setString(4, city);
            pstmt.setString(5, est);
            pstmt.setString(6, tel);
            pstmt.setString(7, mail);
            pstmt.setString(8, pswd);

            pstmt.execute();
            pstmt.close();

            System.out.println("Gravado!" + id);
            conn.close();
        } catch (SQLException e) {
            System.err.print("SQLException: Nao foi possivel inserir");
            e.printStackTrace();
        }
    }

    public int getID() {
        return id;
    }

    public boolean testaLoginCliente(String name, String pwd) throws SQLException {
        conn = ConnectionFactory.getConnection();
        query = "select c.nome, c.senha from web_zone.clientes AS c where c.nome = '" + name + "' AND c.senha = '" + pwd + "'";
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            return true;
        }

        stmt.close();
        conn.close();

        return false;
    }
}
