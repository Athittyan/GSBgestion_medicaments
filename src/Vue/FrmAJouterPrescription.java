/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Entity.Prescription;
import Model.ModelDosages;
import Model.ModelIndividu;
import Model.ModelMedicament;
import Tools.FonctionMetier;
import javax.swing.JOptionPane;

/**
 *
 * @author Jacob
 */
public class FrmAJouterPrescription extends javax.swing.JFrame {

    /**
     * Creates new form FrmAJoutIndividuJacob
     */
    
    private ModelMedicament mdmed;
    private ModelIndividu mdInd;
    private ModelDosages mdDos;
    private FonctionMetier fm;
    
    public FrmAJouterPrescription() {
        
        fm = new FonctionMetier();
        mdmed = new ModelMedicament();
        mdInd = new ModelIndividu();
        mdDos = new ModelDosages();
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
        jLabel2 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPosologie = new javax.swing.JTextField();
        btnInserer = new javax.swing.JButton();
        lblPosologie = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTypeIndividu = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDosage = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMedicament = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Médicament");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Type d'individu");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Ajouter une prescription");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dosage");

        txtPosologie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPosologieMouseClicked(evt);
            }
        });
        txtPosologie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosologieActionPerformed(evt);
            }
        });

        btnInserer.setBackground(new java.awt.Color(0, 102, 102));
        btnInserer.setForeground(new java.awt.Color(255, 255, 255));
        btnInserer.setText("Insérer");
        btnInserer.setBorder(null);
        btnInserer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsererMouseClicked(evt);
            }
        });
        btnInserer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsererActionPerformed(evt);
            }
        });

        lblPosologie.setForeground(new java.awt.Color(255, 255, 255));
        lblPosologie.setText("Posologie:");

        tblTypeIndividu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblTypeIndividu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTypeIndividuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTypeIndividu);

        tblDosage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDosage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDosageMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDosage);

        tblMedicament.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMedicament.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicamentMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblMedicament);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(lblPosologie)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(341, 341, 341))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(txtPosologie, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(417, 417, 417)
                        .addComponent(btnInserer, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblTitle)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPosologie)
                                .addGap(26, 26, 26)))
                        .addComponent(txtPosologie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(btnInserer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        mdmed.loadDatas(fm.getMedoc());
        tblMedicament.setModel(mdmed);
        mdInd.loadDatas(fm.getAllIndividus());
        tblTypeIndividu.setModel(mdInd);
        mdDos.loadDatas(fm.getAllDosages());
        tblDosage.setModel(mdDos);
    }//GEN-LAST:event_formWindowOpened

    private void tblMedicamentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicamentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMedicamentMouseClicked

    private void tblDosageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDosageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDosageMouseClicked

    private void tblTypeIndividuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTypeIndividuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTypeIndividuMouseClicked

    private void btnInsererActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsererActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsererActionPerformed

    private void btnInsererMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsererMouseClicked

        int medoc= tblMedicament.getSelectedRow();
        int individu = tblTypeIndividu.getSelectedRow();
        int dosage = tblDosage.getSelectedRow();
        if(medoc == -1)
        {
            JOptionPane.showMessageDialog(this,"Saisir un médicament","Erreur de saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if(individu == -1)
        {
            JOptionPane.showMessageDialog(this,"Saisir un individu","Erreur de saisie",JOptionPane.ERROR_MESSAGE);

        }
        else if(dosage == -1)
        {
            JOptionPane.showMessageDialog(this,"Saisir un dosage","Erreur de saisie",JOptionPane.ERROR_MESSAGE);

        }
        else if(txtPosologie.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Saisir une posologie","Erreur de saisie",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Boolean success = fm.addPrescription(String.valueOf(mdmed.getValueAt(medoc, 0)), String.valueOf(mdInd.getValueAt(individu, 1)),String.valueOf(mdDos.getValueAt(dosage, 0)), String.valueOf(mdDos.getValueAt(dosage, 1)), txtPosologie.getText());
            if(success)
            JOptionPane.showMessageDialog(this,"La prescription a bien été enregistré","Information",JOptionPane.INFORMATION_MESSAGE);
            else
            JOptionPane.showMessageDialog(this,"Problème interne","Information",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnInsererMouseClicked

    private void txtPosologieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosologieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosologieActionPerformed

    private void txtPosologieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPosologieMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosologieMouseClicked

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
            java.util.logging.Logger.getLogger(FrmAJouterPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAJouterPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAJouterPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAJouterPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAJouterPrescription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInserer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblPosologie;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblDosage;
    private javax.swing.JTable tblMedicament;
    private javax.swing.JTable tblTypeIndividu;
    private javax.swing.JTextField txtPosologie;
    // End of variables declaration//GEN-END:variables
}