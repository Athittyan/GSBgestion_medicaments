/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Entity.TypeIndividu;
import Tools.ConnexionBdd;
import Tools.FonctionMetier;
import java.util.Map;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Jacob
 */
public class FrmStat extends javax.swing.JFrame {
    FonctionMetier fm;
    ConnexionBdd cnx;

    /**
     * Creates new form FrmStat
     */
    public FrmStat() {
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

        btnGraphBaton = new javax.swing.JButton();
        lblGraph = new javax.swing.JLabel();
        btnGraphPie = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnGraphBaton.setBackground(new java.awt.Color(0, 102, 102));
        btnGraphBaton.setForeground(new java.awt.Color(255, 255, 255));
        btnGraphBaton.setText("Nombre de prescriptions d'un médicament par type d'individu");
        btnGraphBaton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGraphBatonMouseClicked(evt);
            }
        });
        btnGraphBaton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraphBatonActionPerformed(evt);
            }
        });

        lblGraph.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblGraph.setText("Graphiques");

        btnGraphPie.setBackground(new java.awt.Color(0, 102, 102));
        btnGraphPie.setForeground(new java.awt.Color(255, 255, 255));
        btnGraphPie.setText("Nombre de médicaments par famille");
        btnGraphPie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGraphPieMouseClicked(evt);
            }
        });
        btnGraphPie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraphPieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnGraphPie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGraphBaton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(lblGraph)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblGraph)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnGraphPie)
                .addGap(18, 18, 18)
                .addComponent(btnGraphBaton)
                .addGap(105, 105, 105))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ConnexionBdd cnx = new ConnexionBdd();
        fm = new FonctionMetier();
    }//GEN-LAST:event_formWindowOpened

    private void btnGraphBatonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGraphBatonMouseClicked
        
        DefaultCategoryDataset donnees = new DefaultCategoryDataset();

        for (Map.Entry valeur : fm.GetDatasGraphique3().entrySet())
        {
            Double prix = Double.parseDouble(((String[])valeur.getValue())[1].toString());
            String nomTrader = ((String[])valeur.getValue())[0].toString();
            String nomAction = ((String[])valeur.getValue())[2].toString();
            //donnees.setValue(prix,nomAction,nomTrader);
            donnees.setValue(prix,nomTrader,nomAction);
        }

        JFreeChart chart1 = ChartFactory.createBarChart(
        "",
        "",
        "",
        donnees,
        PlotOrientation.VERTICAL,
        true, true, true);
        ChartFrame frame = new ChartFrame("", chart1);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_btnGraphBatonMouseClicked

    private void btnGraphBatonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraphBatonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGraphBatonActionPerformed

    private void btnGraphPieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGraphPieMouseClicked
        // TODO add your handling code here
        DefaultPieDataset donnees = new DefaultPieDataset();

        for (Map.Entry valeur : fm.GetDatasGraphique2().entrySet())
        {
            donnees.setValue(valeur.getKey().toString(), Integer.parseInt(valeur.getValue().toString()));
        }

        JFreeChart chart1 = ChartFactory.createPieChart(
        "Nombre de médicaments par famille",
        donnees,
        true, // légende
        true, // info bulle
        true // url
        );
        ChartFrame frame = new ChartFrame("", chart1);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_btnGraphPieMouseClicked

    private void btnGraphPieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraphPieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGraphPieActionPerformed

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
            java.util.logging.Logger.getLogger(FrmStat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmStat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmStat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmStat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmStat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGraphBaton;
    private javax.swing.JButton btnGraphPie;
    private javax.swing.JLabel lblGraph;
    // End of variables declaration//GEN-END:variables
}
