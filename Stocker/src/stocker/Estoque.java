/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stocker;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hiury
 */
public class Estoque extends javax.swing.JInternalFrame {

    /** Creates new form Teste */
    public Estoque() {
        initComponents();
        try {
            this.setMaximum(true);
            
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fornecedores = new javax.swing.JButton();
        estoque = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(651, 485));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fornecedores.setBackground(new java.awt.Color(0, 102, 204));
        Fornecedores.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Fornecedores.setForeground(new java.awt.Color(255, 255, 255));
        Fornecedores.setText("Fornecedores");
        Fornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FornecedoresActionPerformed(evt);
            }
        });
        getContentPane().add(Fornecedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 260, 125));

        estoque.setBackground(new java.awt.Color(0, 102, 204));
        estoque.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        estoque.setForeground(new java.awt.Color(255, 255, 255));
        estoque.setText("Etoque");
        estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoqueActionPerformed(evt);
            }
        });
        getContentPane().add(estoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 125));

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1)
                .addContainerGap(402, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jToggleButton1)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 520, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FornecedoresActionPerformed
      
        // TODO add your handling code here:
    }//GEN-LAST:event_FornecedoresActionPerformed

    private void estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoqueActionPerformed
       
        // TODO add your handling code here:
    }//GEN-LAST:event_estoqueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Fornecedores;
    private javax.swing.JButton estoque;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

}
