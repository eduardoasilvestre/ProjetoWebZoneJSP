/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class GarotaDao {

    private Connection conn;
    // private PreparedStatement pstmt;
    private Statement stmt;
    private String query;

    public boolean testaLoginGarota(String name, String pwd) throws SQLException {
        conn = ConnectionFactory.getConnection();
        query = "select g.nome, g.senha from web_zone.garotas AS g where g.nome = '" + name + "' AND g.senha = '" + pwd + "'";
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
