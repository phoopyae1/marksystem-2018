/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phoopyaepyaesoe1;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author lenovo
 */
public class ChooseYR extends javax.swing.JFrame {

    /**
     * Creates new form ChooseYR
     */
    public ChooseYR() {
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
        Second = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ThirdYear = new javax.swing.JComboBox<>();
        fourthyr = new javax.swing.JComboBox<>();
        combo = new javax.swing.JComboBox<>();
        Second1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setLocation(new java.awt.Point(500, 100));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        Second.setText("Second Year");
        Second.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose Year ");

        ThirdYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Third Year", "CT\t", "CS" }));
        ThirdYear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThirdYearMouseClicked(evt);
            }
        });
        ThirdYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThirdYearActionPerformed(evt);
            }
        });

        fourthyr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fourth Year", "Software Engineering", "Knowledge Engineering", "Business Information System", "High Performance Computing", "Computer System", "Computer Networking", "Embeded System" }));
        fourthyr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourthyrActionPerformed(evt);
            }
        });

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FiFth Year", "Software Engineering", "Knowledge Engineering", "Business Information System", "High Performance Computing", "Computer System", "Computer Networking", "Embeded System" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        Second1.setText("First Year");
        Second1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Second1ActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Second1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(Second, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ThirdYear, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fourthyr, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Second)
                    .addComponent(Second1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(ThirdYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourthyr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ThirdYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThirdYearActionPerformed
        // TODO add your handling code here:
     int d=ThirdYear.getSelectedIndex();
     if(d==1)
     {
         ThirdYrCTTable third=new ThirdYrCTTable();
         third.setVisible(true);
         this.setVisible(false);
         try {
             third.TTable();
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
             
         }
         
     }
     else if(d==2)
         {
              ThirdYrCSTable third1=new ThirdYrCSTable();
              third1.setVisible(true);
              this.setVisible(false);
         try {
             third1.TTable();
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
         }
         }
    }//GEN-LAST:event_ThirdYearActionPerformed

    private void SecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondActionPerformed
        // TODO add your handling code here:
        SecondYrTable second=new SecondYrTable();
        second.setVisible(true);
        this.dispose();
        this.setVisible(false);
        try {
            second.STable();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_SecondActionPerformed

    private void Second1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Second1ActionPerformed
FirstYrTable first=new FirstYrTable();
first.setVisible(true);
this.dispose();
this.setVisible(false);

        try {
            first.Table();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Second1ActionPerformed

    private void ThirdYearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThirdYearMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ThirdYearMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MarkSystem3 back=new MarkSystem3();
        back.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fourthyrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthyrActionPerformed
        // TODO add your handling code here:
        int d=fourthyr.getSelectedIndex();
        switch(d)
        {
            case 1:FourthYrSETable se=new FourthYrSETable();
                    se.setVisible(true);
                    
            try {
                se.TTable();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            case 2:FourthYrKETable ke=new FourthYrKETable();
                    ke.setVisible(true);
        {
            try {
                ke.TTable();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }     case 3:FourthYrBISTable1 bis=new FourthYrBISTable1();
                    bis.setVisible(true);
        {
            try {
                bis.TTable();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
           case 4:FourthYrHPCTable hpc=new FourthYrHPCTable();
                    hpc.setVisible(true);
        {
            try {
                hpc.TTable();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          case 5:FourthYrCSTable cs=new FourthYrCSTable();
                    cs.setVisible(true);
        {
            try {
                cs.TTable();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          case 6:FourthYrCNTable cn=new FourthYrCNTable();
                   cn.setVisible(true);
        {
            try {
                cn.TTable();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          case 7:FourthYrESTable es=new FourthYrESTable();
                    es.setVisible(true);
        {
            try {
                es.TTable();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
        {
        }
        
    }//GEN-LAST:event_fourthyrActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
         int e=combo.getSelectedIndex();
        switch(e)
        {
            case 1:FinalYrSETable se=new FinalYrSETable();
                    se.setVisible(true);
                    
            try {
                se.TTable();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            case 2:FinalYrKETable ke=new FinalYrKETable();
                    ke.setVisible(true);
        {
            try {
                ke.TTable();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }     case 3:FinalYrBISTable bis=new FinalYrBISTable();
                    bis.setVisible(true);
        {
            try {
                bis.TTable();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
           case 4:FinalYrHPCTable hpc=new FinalYrHPCTable();
                    hpc.setVisible(true);
        {
            try {
                hpc.TTable();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          case 5:FinalYrCSTable cs=new FinalYrCSTable();
                    cs.setVisible(true);
        {
            try {
                cs.TTable();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          case 6:FinalYrCNTable cn=new FinalYrCNTable();
                   cn.setVisible(true);
        {
            try {
                cn.TTable();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          case 7:FinalYrESTable es=new FinalYrESTable();
                    es.setVisible(true);
        {
            try {
                es.TTable();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
        {
        }
    }//GEN-LAST:event_comboActionPerformed

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
            java.util.logging.Logger.getLogger(ChooseYR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseYR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseYR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseYR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        ChooseYR cy=new ChooseYR();
cy.setLocation(400,400);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseYR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Second;
    private javax.swing.JButton Second1;
    private javax.swing.JComboBox<String> ThirdYear;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JComboBox<String> fourthyr;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
