/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phoopyaepyaesoe1;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLDataException;


/**
 *
 * @author lenovo
 */
public class FirstYr extends javax.swing.JPanel {

//InsertDBMark i=new InsertDBMark();
/**
     * Creates new form FirstYr
     */ 
    public FirstYr() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        F102 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FMyan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        F103 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        F104 = new javax.swing.JTextField();
        Insert = new javax.swing.JButton();
        F101 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        FName = new javax.swing.JTextField();
        Eng = new javax.swing.JLabel();
        FEng = new javax.swing.JTextField();
        ID = new javax.swing.JLabel();
        FRollno = new javax.swing.JTextField();
        FPhys = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("101");

        jLabel3.setText("First Year ");

        jLabel4.setText("102");

        F102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F102ActionPerformed(evt);
            }
        });

        jLabel5.setText("Myan");

        FMyan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FMyanActionPerformed(evt);
            }
        });

        jLabel6.setText("103");

        F103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F103ActionPerformed(evt);
            }
        });

        jLabel7.setText("104");

        F104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F104ActionPerformed(evt);
            }
        });

        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        F101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F101ActionPerformed(evt);
            }
        });

        jLabel8.setText("Name");

        FName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameActionPerformed(evt);
            }
        });

        Eng.setText("Eng");

        FEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FEngActionPerformed(evt);
            }
        });

        ID.setText("Roll no");

        FRollno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FRollnoActionPerformed(evt);
            }
        });

        FPhys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FPhysActionPerformed(evt);
            }
        });

        jLabel9.setText("Phys");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phoopyaepyaesoe1/uitcopy.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(520, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(Eng, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Insert)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FRollno, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F101, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FEng, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FMyan, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FPhys, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F102, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F103, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F104, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabel3)
                                        .addGap(65, 65, 65)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ID)
                                            .addComponent(FRollno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(F101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(FEng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Eng))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FMyan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FPhys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(F102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(F103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(F104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(44, 44, 44)
                .addComponent(Insert)
                .addContainerGap(114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void F102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F102ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F102ActionPerformed

    private void FMyanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FMyanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FMyanActionPerformed

    private void F103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F103ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F103ActionPerformed

    private void F104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F104ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F104ActionPerformed

    private void F101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F101ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F101ActionPerformed

    private void FNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNameActionPerformed

    private void FEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FEngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FEngActionPerformed

    private void FRollnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FRollnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FRollnoActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed

        String r=FRollno.getText();
        String t=F101.getText();
        String t1=FEng.getText();
        String t2=FMyan.getText();
        String t6=FPhys.getText();
        String t3=F102.getText();
        String t4=F103.getText();
        String t5=F104.getText();
        String r1=FName.getText();
        int sub1=Integer.parseInt(t);
        int sub2=Integer.parseInt(t1);
        int sub3=Integer.parseInt(t2);
        int sub4=Integer.parseInt(t3);
        int sub5=Integer.parseInt(t4);
        int sub6=Integer.parseInt(t5);
         int sub7=Integer.parseInt(t6);
         if(sub1>100 || sub2>100 || sub3>100 || sub4>100 || sub5>100 || sub7>100 || sub6>100)
         {
             JOptionPane.showMessageDialog(this,"Invalid number","Error",JOptionPane.ERROR_MESSAGE);
                FRollno.setText(null);
            FName.setText(null);
            F101.setText(null);
            FEng.setText(null);
            FMyan.setText(null);
            FPhys.setText(null);
            F102.setText(null);
            F103.setText(null);
            F104.setText(null);
         }
         else{         
    InsertDBMark insert=new InsertDBMark();
        //insert.Rollno=Integer.parseInt(r);
        insert.Rollno=r;
        insert.NAME=r1;
        insert.FEng=Integer.parseInt(t1);
        insert.FMyan=Integer.parseInt(t2);
        insert.F101=Integer.parseInt(t);
        insert.F103=Integer.parseInt(t4);
        insert.F102=Integer.parseInt(t3);
        insert.F104=Integer.parseInt(t5);
        insert.FPhys=Integer.parseInt(t6);
          int total=sub1+sub2+sub3+sub4+sub5+sub6+sub7;
        insert.Total=total;
        try {
            insert.insert();
        } catch (SQLException ex) {
            Logger.getLogger(FirstYr.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FirstYr.class.getName()).log(Level.SEVERE, null, ex);
        }
        Caculategrade caculate=new Caculategrade();

         caculate.Rollno=r;
         caculate.NAME=r1;
            
          //101
         if(sub1<=100 && sub1>=80)
         {
             caculate.F101="A";
         }
         else if(sub1<=80 && sub1>=60)
         {
             caculate.F101="B";
         }
         else if(sub1<=60 && sub1>=40)
         {
             caculate.F101="C";
         }
         else if(sub1<=40 && sub1>=20)
         {
             caculate.F101="D";
         }
         else
         {
             caculate.F101="E";
         }
         //101
         
         //Eng
           if(sub2<=100 && sub2>=80)
         {
             caculate.FEng="A";
         }
         else if(sub2<=80 && sub2>=60)
         {
             caculate.FEng="B";
         }
         else if(sub2<=60 && sub2>=40)
         {
             caculate.FEng="C";
         }
         else if(sub2<=40 && sub2>=20)
         {
             caculate.FEng="D";
         }
         else
         {
             caculate.FEng="E";
         }
        //English
        
        //Myanmar
          if(sub3<=100 && sub3>=80)
         {
             caculate.FMyan="A";
         }
         else if(sub3<=80 && sub3>=60)
         {
             caculate.FMyan="B";
         }
         else if(sub3<=60 && sub3>=40)
         {
             caculate.FMyan="C";
         }
         else if(sub3<=40 && sub3>=20)
         {
             caculate.FMyan="D";
         }
         else
         {
             caculate.FMyan="E";
         }
        //Myanmar
   
           //102
              if(sub4<=100 && sub4>=80)
         {
             caculate.F102="A";
         }
         else if(sub4<=80 && sub4>=60)
         {
             caculate.F102="B";
         }
         else if(sub4<=60 && sub4>=40)
         {
             caculate.F102="C";
         }
         else if(sub4<=40 && sub4>=20)
         {
             caculate.F102="D";
         }
         else 
         {
             caculate.F102="E";
         }
              //102
              
              //103
               if(sub5<=100 && sub5>=80)
         {
             caculate.F103="A";
         }
         else if(sub5<=80 && sub5>=60)
         {
             caculate.F103="B";
         }
         else if(sub5<=60 && sub5>=40)
         {
             caculate.F103="C";
         }
         else if(sub5<=40 && sub5>=20)
         {
             caculate.F103="D";
         }
         else
         {
             caculate.F103="E";
         }
              //103
              
              //104
          if(sub6<=100 && sub6>=80)
         {
             caculate.F104="A";
         }
         else if(sub6<=80 && sub6>=60)
         {
             caculate.F104="B";
         }
         else if(sub6>=60 && sub6<=40)
         {
             caculate.F104="C";
         }
         else if(sub6<=40 && sub6>=20)
         {
             caculate.F104="D";
         }
         else
         {
             caculate.F104="E";
         }   
          //104
          
          
        //Physics
           if(sub7<=100 && sub7>=80)
         {
             caculate.FPhys="A";
         }
         else if(sub7<=80 && sub7>=60)
         {
             caculate.FPhys="B";
         }
         else if(sub7<=60 && sub7>=40)
         {
             caculate.FPhys="C";
         }
         else if(sub7<=40 && sub7>=20)
         {
             caculate.FPhys="D";
         }
         else
         {
             caculate.FPhys="E";
         }
           //Physics
         caculate.Total=total;
        try {
            caculate.caculate();
            FRollno.setText(null);
            FName.setText(null);
            F101.setText(null);
            FEng.setText(null);
            F102.setText(null);
            FMyan.setText(null);
            FPhys.setText(null);
            F103.setText(null);
            F104.setText(null);
        } catch (SQLException ex) {
            Logger.getLogger(FirstYr.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FirstYr.class.getName()).log(Level.SEVERE, null, ex);
        }}
 
    }//GEN-LAST:event_InsertActionPerformed

    private void FPhysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FPhysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FPhysActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Eng;
    public javax.swing.JTextField F101;
    public javax.swing.JTextField F102;
    public javax.swing.JTextField F103;
    public javax.swing.JTextField F104;
    public javax.swing.JTextField FEng;
    public javax.swing.JTextField FMyan;
    public javax.swing.JTextField FName;
    public javax.swing.JTextField FPhys;
    public javax.swing.JTextField FRollno;
    private javax.swing.JLabel ID;
    private javax.swing.JButton Insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}
