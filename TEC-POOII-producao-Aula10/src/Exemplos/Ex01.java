/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplos;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Davi
 */
public class Ex01 {
    
    Connection conn=null;
    Statement st=null;
    
    void inserir(){
        
        try {
            conn = db.conexao.getConnection();
            st = conn.createStatement();
            
            
        } catch (Exception e) {
        }
        
    }
    
}
