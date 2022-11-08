/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Davi
 */
public class Ex03 {
    
    Connection conn=null;
    PreparedStatement pst=null;
    
    public void excluir(int codigo){
        
        try {
            conn = db.conexao.getConnection();
            pst = conn.prepareStatement("delete from alunos"
                    + " where codigo=?");
            pst.setInt(1, codigo);
            pst.executeUpdate();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro: "+ e);
        }
        
    }
    
    
}
