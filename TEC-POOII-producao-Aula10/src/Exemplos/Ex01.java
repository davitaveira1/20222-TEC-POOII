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
public class Ex01 {
    
    Connection conn=null;
    Statement st=null;
    PreparedStatement pst=null;
    
    
    void inserir(){
        
        try {
            conn = db.conexao.getConnection();
            st = conn.createStatement();
            st.executeUpdate("insert into "
                    + " alunos (nome) "
                    + " values ('Reginaldo')");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro: "+ e);
        }
        
    }
    
    void inserir(String nome){
        
        try {
            
            conn = db.conexao.getConnection();
            pst = conn.prepareStatement("insert into alunos"
                    + " (nome) values (?)");             
            pst.setString(1, nome);
            pst.executeUpdate();
            
        } catch (Exception e) {
        }
        
    }
    
    public static void main(String[] args) {
        Ex01 e = new Ex01();        
        e.inserir();
    }
    
}
