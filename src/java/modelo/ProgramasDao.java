/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class ProgramasDao {

    private Connection conn;
    private PreparedStatement pstmt;
    private Statement stmt;
    private String query;

    public ProgramasDao() {
    }

    void incluirProgram(int idGirl, String data, String hora, String lugar,
            int idServico, int qtdeS, String nomeC) {
        try {
            conn = ConnectionFactory.getConnection();

            query = "insert into web_zone.programas (data, hora, idgarotas, lugar, " +
                    "codservico, qtde, nomecli) values (?,?,?,?,?,?,?)";

            pstmt = conn.prepareStatement(query);
            // preenche os valores
            pstmt.setString(1, data);
            pstmt.setString(2, hora);
            pstmt.setInt(3, idGirl);
            pstmt.setString(4, lugar);
            pstmt.setInt(5, idServico);
            pstmt.setInt(6, qtdeS);
            pstmt.setString(7, nomeC);

            pstmt.execute();
            pstmt.close();

            conn.close();
        } catch (SQLException e) {
            System.err.print("SQLException: nao foi possivel inserir! ");
            e.printStackTrace();
        }
    }

    public Vector buscaProgramGarota(String garota) {
        Vector v = new Vector (); 
        try {
            conn = ConnectionFactory.getConnection();
            query = "select g.nome, p.lugar, p.data, p.hora, p.qtde, p.nomecli, s.descricao, s.valor "
                    + "from web_zone.garotas as g, web_zone.programas as p, web_zone.servicos as s"
                    + " where g.id = p.idgarotas and p.codservico = s.id and g.nome = '" + garota + "'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            int rowCount = 1;
            
            while (rs.next()) {
                String s = "";
                for (int i = 1; i <= numberOfColumns; i++) {
                    s += rs.getString(i);
                    if ( i < numberOfColumns) {
                        s+= " ";
                    }
                    rowCount++;
                }
                v.addElement(s);
                
            }
            stmt.close();
            conn.close();            

        } catch (SQLException ex) {
            System.err.print("SQLException: falha na busca");
            System.err.println(ex.getMessage());
        }   
        
        return v;
    }       
    /*     
            pstmt = conn.createStatement();
            ResultSet rs = pstmt.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            int rowCount = 1;
            
            while (rs.next()) {
                String s = "";
                for (int i = 1; i <= numberOfColumns; i++) {
                    s += rs.getString(i);
                    if ( i < numberOfColumns) {
                        s+= " ";
                    }
                    rowCount++;
                    //System.out.println(rs.getString(i));
                }
                v.addElement(s);           
            }
            pstmt.close();
            pstmt.close();
            conn.close();
            

        } catch (SQLException ex) {
            System.err.println("SQLException: falha na busca");
            System.err.println(ex.getMessage());
        }   
        return v;
    }

     
     */
}