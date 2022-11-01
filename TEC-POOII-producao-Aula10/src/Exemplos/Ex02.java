/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author Davi
 */
public class Ex02 {
    
    Connection conn=null;
    PreparedStatement pst=null;
    Statement st=null;
    
    //método estático
    public void alterar(){
        
        try {
            
            conn = db.conexao.getConnection();
            st = conn.createStatement();
            st.executeUpdate("update alunos set"
                    + " nome='Davi Taveira Alencar'"
                    + " where codigo=1");
            
        } catch (Exception e) {
        }
        
    }
    //método dinâmico
    public void alterar(String nome,int codigo){
        
    }
    
    public static void main(String[] args) {
        
        Ex02 e = new Ex02();
        e.alterar();
        
    }
    
}
