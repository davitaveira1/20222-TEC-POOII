/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package q09;

import javax.swing.JOptionPane;

/**
 *
 * @author Davi
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btPicanha = new javax.swing.JButton();
        btLasanha = new javax.swing.JButton();
        btStrogonoff = new javax.swing.JButton();
        btBife = new javax.swing.JButton();
        btPao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Menu de Opções");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new java.awt.GridLayout(3, 0, 0, 2));

        btPicanha.setText("Picanha");
        btPicanha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPicanhaActionPerformed(evt);
            }
        });
        jPanel2.add(btPicanha);

        btLasanha.setText("Lasanha");
        btLasanha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLasanhaActionPerformed(evt);
            }
        });
        jPanel2.add(btLasanha);

        btStrogonoff.setText("Strogonoff");
        btStrogonoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStrogonoffActionPerformed(evt);
            }
        });
        jPanel2.add(btStrogonoff);

        btBife.setText("Bife Acebolado");
        btBife.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBifeActionPerformed(evt);
            }
        });
        jPanel2.add(btBife);

        btPao.setText("Pão com ovo");
        btPao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPaoActionPerformed(evt);
            }
        });
        jPanel2.add(btPao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPicanhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPicanhaActionPerformed
        // TODO add your handling code here:

        //prato = R$ 25
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja pagar os 10% ?","Atenção!", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            double contaFinal = 25*1.1;
            JOptionPane.showMessageDialog(null,"Valor final da conta: "+contaFinal);
        }
    }//GEN-LAST:event_btPicanhaActionPerformed

    private void btLasanhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLasanhaActionPerformed
        //prato = R$ 20
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja pagar os 10% ?","Atenção!", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            double contaFinal = 20*1.1;
            JOptionPane.showMessageDialog(null,"Valor final da conta: "+contaFinal);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btLasanhaActionPerformed

    private void btStrogonoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStrogonoffActionPerformed
        // TODO add your handling code here:
        //prato = R$ 18
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja pagar os 10% ?","Atenção!", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            double contaFinal = 18*1.1;
            JOptionPane.showMessageDialog(null,"Valor final da conta: "+contaFinal);
        }        
    }//GEN-LAST:event_btStrogonoffActionPerformed

    private void btBifeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBifeActionPerformed
        //prato = R$ 18
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja pagar os 10% ?","Atenção!", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            double contaFinal = 18*1.1;
            JOptionPane.showMessageDialog(null,"Valor final da conta: "+contaFinal);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btBifeActionPerformed

    private void btPaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPaoActionPerformed
        //prato = R$ 5
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja pagar os 10% ?","Atenção!", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            double contaFinal = 5*1.1;
            JOptionPane.showMessageDialog(null,"Valor final da conta: "+contaFinal);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btPaoActionPerformed

    /**
         * @param args the command line arguments
         */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBife;
    private javax.swing.JButton btLasanha;
    private javax.swing.JButton btPao;
    private javax.swing.JButton btPicanha;
    private javax.swing.JButton btStrogonoff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
