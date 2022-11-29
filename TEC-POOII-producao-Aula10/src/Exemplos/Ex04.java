/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplos;

import db.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Davi
 */
public class Ex04 {

    Connection conn = null;
    Statement st = null;
    PreparedStatement pst = null;
    
    ResultSet rs = null;
    
    public ResultSet selecionarProduto(int codigo){
        try {
            conn = conexao.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("select * from produtos2 where codigo = "+codigo);
            

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Erro: "+ e);
        }
        
        return rs;
    }    
    
    

}
