/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Entity.TypeIndividu;
import Model.ModelIndividu;
import Tools.FonctionMetier;
import javax.swing.JOptionPane;

/**
 *
 * @author Jacob
 */
public class FrmModifierIndividus extends javax.swing.JFrame {

    private ModelIndividu mdInd;
    private FonctionMetier fm;

    /**
     * Creates new form FrmModifierJacob
     */
    public FrmModifierIndividus() {
      
        fm = new FonctionMetier();
        mdInd = new ModelIndividu();
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

        lblTittle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListerIndividus = new javax.swing.JTable();
        btnModifier = new javax.swing.JButton();
        txtModif = new javax.swing.JTextField();
        lblInfoModif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTittle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTittle.setText("Types d'individus/Modifier");

        tblListerIndividus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblListerIndividus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListerIndividusMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListerIndividus);

        btnModifier.setBackground(new java.awt.Color(0, 102, 102));
        btnModifier.setForeground(new java.awt.Color(255, 255, 255));
        btnModifier.setText("Modifier");
        btnModifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifierMouseClicked(evt);
            }
        });
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        txtModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModifActionPerformed(evt);
            }
        });

        lblInfoModif.setText("Sélectionner le libellé dans le tableau pour le modifier:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(btnModifier))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInfoModif, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtModif, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTittle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfoModif)
                    .addComponent(txtModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnModifier)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierMouseClicked
        int individu = tblListerIndividus.getSelectedRow();
//        String test = String.valueOf(mdInd.getValueAt(tblListerIndividus.getSelectedRow(), 1));
//        System.out.println(test);
        if(individu == -1)
        {
            JOptionPane.showMessageDialog(this,"Saisir un individu","Erreur de saisie",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            fm.updateIndividu(Integer.valueOf(String.valueOf(mdInd.getValueAt(tblListerIndividus.getSelectedRow(), 0))), txtModif.getText());
            JOptionPane.showMessageDialog(this,"L'individu a bien été modifié","Information",JOptionPane.INFORMATION_MESSAGE);
        
        }
        
    }//GEN-LAST:event_btnModifierMouseClicked

    private void txtModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifActionPerformed

    private void tblListerIndividusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListerIndividusMouseClicked
         txtModif.setText(String.valueOf(mdInd.getValueAt(tblListerIndividus.getSelectedRow(), 1)));
      
    }//GEN-LAST:event_tblListerIndividusMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     
        mdInd.loadDatas(fm.getAllIndividus());
        tblListerIndividus.setModel(mdInd);
    }//GEN-LAST:event_formWindowOpened

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModifierActionPerformed


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
            java.util.logging.Logger.getLogger(FrmModifierIndividus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmModifierIndividus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmModifierIndividus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmModifierIndividus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmModifierIndividus().setVisible(true);
            }
        });
    }
                                     


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModifier;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInfoModif;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JTable tblListerIndividus;
    private javax.swing.JTextField txtModif;
    // End of variables declaration//GEN-END:variables
}