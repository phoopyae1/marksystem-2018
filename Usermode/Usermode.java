/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phoopyaepyaesoe1.Usermode;

import MainPage.MainPageUser;
import java.sql.SQLException;
import static java.util.ServiceLoader.load;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import phoopyaepyaesoe1.ChooseYR;
import phoopyaepyaesoe1.FourthYrBISTable1;
import phoopyaepyaesoe1.FourthYrCNTable;
import phoopyaepyaesoe1.FourthYrCSTable;
import phoopyaepyaesoe1.FourthYrESTable;
import phoopyaepyaesoe1.FourthYrHPCTable;
import phoopyaepyaesoe1.FourthYrKETable;
import phoopyaepyaesoe1.FourthYrSETable;

/**
 *
 * @author lenovo
 */
public class Usermode extends javax.swing.JFrame {
int d;
int i=0;
    /**
     * Creates new form usermode1
     */
    public Usermode() {
        initComponents();
               setVisible(true);
        this.setResizable(false);
       // newCombo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        newCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        finalyr = new javax.swing.JComboBox<>();
        fourthyr = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Results for Students");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phoopyaepyaesoe1/build.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Years");

        newCombo.setBackground(new java.awt.Color(0, 102, 102));
        newCombo.setForeground(new java.awt.Color(255, 255, 255));
        newCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CT", "CS" }));
        newCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newComboMouseClicked(evt);
            }
        });
        newCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newComboActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Results for Students");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phoopyaepyaesoe1/Usermode/UITLogo.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phoopyaepyaesoe1/Usermode/uitlogonew.png"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("First Year");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Second Year");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        finalyr.setBackground(new java.awt.Color(0, 102, 102));
        finalyr.setForeground(new java.awt.Color(255, 255, 255));
        finalyr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Final Year", "Software Engineering", "Knowledge Engineering", "Business Information System", "High Performance Computing", "Computer System", "Computer Networking", "Embeded System" }));
        finalyr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalyrMouseClicked(evt);
            }
        });
        finalyr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalyrActionPerformed(evt);
            }
        });

        fourthyr.setBackground(new java.awt.Color(0, 102, 102));
        fourthyr.setForeground(new java.awt.Color(255, 255, 255));
        fourthyr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fourth Year", "Software Engineering", "Knowledge Engineering", "Business Information System", "High Performance Computing", "Computer System", "Computer Networking", "Embeded System" }));
        fourthyr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourthyrMouseClicked(evt);
            }
        });
        fourthyr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourthyrActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Back>>");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(213, 213, 213))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(163, 163, 163)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(160, 160, 160))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))))
                .addComponent(jLabel2)
                .addGap(231, 231, 231))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(finalyr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fourthyr, 0, 173, Short.MAX_VALUE)
                    .addComponent(newCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addGap(35, 35, 35)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(newCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(fourthyr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(finalyr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newComboActionPerformed
int d=newCombo.getSelectedIndex();
if(d==0)
{
    CTTable ct=new CTTable();
    ct.setVisible(true);
}
else if(d==1)
{
    CSTable cs=new CSTable();
    cs.setVisible(true);
}

           
    }//GEN-LAST:event_newComboActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try {
        // TODO add your handling code here:
        FirstTable first=new FirstTable();
        first.setVisible(true);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Usermode.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Usermode.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void newComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newComboMouseClicked
        // TODO add your handling code here:
       /* int d=newCombo.getSelectedIndex();
        switch(d)
        {
            case 0:newCombo.addItem("CT");
                   newCombo.setVisible(true);
                   CTTable ct=new CTTable();
                   ct.setVisible(true);break;
            case 1:newCombo.addItem("CS");
                    CSTable cs=new CSTable();
                    cs.setVisible(true);
                    newCombo.setVisible(true);break;
                 
        }*/

    }//GEN-LAST:event_newComboMouseClicked

    private void finalyrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalyrMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_finalyrMouseClicked

    private void finalyrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalyrActionPerformed
        // TODO add your handling code here:
          int d=finalyr.getSelectedIndex();
        switch(d)
        {
            case 1:FSETable se=new FSETable();
                    se.setVisible(true);
                    
            try {
                se.Table();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            case 2:FKETable ke=new FKETable();
                    ke.setVisible(true);
        {
            try {
                ke.Table();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }     case 3:FBISTable bis=new FBISTable();
                    bis.setVisible(true);
        {
            try {
                bis.Table();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
           case 4:FHPCTable hpc=new FHPCTable();
                    hpc.setVisible(true);
        {
            try {
                hpc.Table();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          case 5:FCSTable cs=new FCSTable();
                    cs.setVisible(true);
        {
            try {
                cs.Table();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          case 6:FCNTable cn=new FCNTable();
                   cn.setVisible(true);
        {
            try {
                cn.Table();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          case 7:FESTable es=new FESTable();
                    es.setVisible(true);
        {
            try {
                es.Table();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
        {
        }
    }//GEN-LAST:event_finalyrActionPerformed

    private void fourthyrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourthyrMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fourthyrMouseClicked

    private void fourthyrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthyrActionPerformed
        // TODO add your handling code here:
        int d=fourthyr.getSelectedIndex();
        switch(d)
        {
            case 1:SETable se=new SETable();
                    se.setVisible(true);
                    
            try {
                se.Table();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            case 2:KETable ke=new KETable();
                    ke.setVisible(true);
        {
            try {
                ke.Table();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }     case 3:BISTable bis=new BISTable();
                    bis.setVisible(true);
        {
            try {
                bis.Table();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
           case 4:HPCTable hpc=new HPCTable();
                    hpc.setVisible(true);
        {
            try {
                hpc.Table();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          case 5:CSTable cs=new CSTable();
                    cs.setVisible(true);
        {
            try {
                cs.Table();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          case 6:CNTable cn=new CNTable();
                   cn.setVisible(true);
        {
            try {
                cn.Table();break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseYR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          case 7:ESTable es=new ESTable();
                    es.setVisible(true);
        {
            try {
                es.Table();break;
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        STable second=new STable();
        second.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        MainPageUser nn=new MainPageUser();
        nn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Usermode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usermode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usermode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usermode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usermode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> finalyr;
    private javax.swing.JComboBox<String> fourthyr;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> newCombo;
    // End of variables declaration//GEN-END:variables
}
