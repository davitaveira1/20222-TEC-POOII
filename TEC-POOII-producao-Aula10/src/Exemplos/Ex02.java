/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Davi
 */
public class Ex02 {

    Connection conn = null;
    PreparedStatement pst = null;
    Statement st = null;

    //método estático
    public void alterar() {

        try {

            conn = db.conexao.getConnection();
            st = conn.createStatement();
            st.executeUpdate("update alunos set"
                    + " nome='Davi Taveira Alencar'"
                    + " where codigo=1");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro: "+ e);
        }

    }

    //método dinâmico
    public void alterar(String nome, int codigo) {
        conn = db.conexao.getConnection();
        try {
            pst = conn.prepareStatement("update"
                    + " alunos set nome=?"
                    + " where codigo=?");
            
            pst.setString(1, nome);
            pst.setInt(2, codigo);
            
            pst.executeUpdate();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro: "+ e);
        }

    }

    public static void main(String[] args) {

        Ex02 e = new Ex02();
        //e.alterar();
        e.alterar("Daniel Taveira Alencar", 7);

    }

}
