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
public class FourthYrBIS extends javax.swing.JPanel {
//InsertDBMark i=new InsertDBMark();
/**
     * Creates new form FirstYr
     */ 
    public FourthYrBIS() {
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
        SE404 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SE402 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SE405 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        SE406 = new javax.swing.JTextField();
        Insert = new javax.swing.JButton();
        SE401 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        SEName = new javax.swing.JTextField();
        Eng = new javax.swing.JLabel();
        SEEng = new javax.swing.JTextField();
        ID = new javax.swing.JLabel();
        SERollno = new javax.swing.JTextField();
        SE403 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("401");

        jLabel3.setText("Fourth Year's BIS");

        jLabel4.setText("404");

        SE404.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SE404ActionPerformed(evt);
            }
        });

        jLabel5.setText("402");

        SE402.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SE402ActionPerformed(evt);
            }
        });

        jLabel6.setText("405");

        SE405.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SE405ActionPerformed(evt);
            }
        });

        jLabel7.setText("406");

        SE406.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SE406ActionPerformed(evt);
            }
        });

        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        SE401.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SE401ActionPerformed(evt);
            }
        });

        jLabel8.setText("Name");

        SEName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SENameActionPerformed(evt);
            }
        });

        Eng.setText("English");

        SEEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEEngActionPerformed(evt);
            }
        });

        ID.setText("Roll no");

        SERollno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SERollnoActionPerformed(evt);
            }
        });

        SE403.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SE403ActionPerformed(evt);
            }
        });

        jLabel9.setText("403");

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
                    .addComponent(jLabel5)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(Eng, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Insert)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SERollno, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SEName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SE401, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SEEng, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SE402, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SE403, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SE404, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SE405, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SE406, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                            .addComponent(SERollno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(SEName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(SE401, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(SEEng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Eng))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SE402, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SE403, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(SE404, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SE405, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SE406, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(44, 44, 44)
                .addComponent(Insert)
                .addContainerGap(114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SE404ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SE404ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SE404ActionPerformed

    private void SE402ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SE402ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SE402ActionPerformed

    private void SE405ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SE405ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SE405ActionPerformed

    private void SE406ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SE406ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SE406ActionPerformed

    private void SE401ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SE401ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SE401ActionPerformed

    private void SENameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SENameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SENameActionPerformed

    private void SEEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEEngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SEEngActionPerformed

    private void SERollnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SERollnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SERollnoActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed

        // TODO add your handling code here:
     
        /*InsertDBMark i=new InsertDBMark();
        i.NAME=FName.getText();
        try {
        i.insert();
        } catch (SQLException ex) {
        Logger.getLogger(FirstYr.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(FirstYr.class.getName()).log(Level.SEVERE, null, ex);
        }*/
            int sub1=Integer.parseInt(SE401.getText());
        int sub2=Integer.parseInt(SEEng.getText());
        int sub3=Integer.parseInt(SE402.getText());
        int sub4=Integer.parseInt(SE403.getText());
        int sub5=Integer.parseInt(SE404.getText());
        int sub6=Integer.parseInt(SE405.getText());
         int sub7=Integer.parseInt(SE406.getText());
     InsertDBBIS insert=new InsertDBBIS();
     insert.SERollno=SERollno.getText();
     insert.SENAME=SEName.getText();
     insert.SE401=Integer.parseInt(SE401.getText());
     insert.SEEng=Integer.parseInt(SEEng.getText());
     insert.SE402=Integer.parseInt(SE402.getText());
     insert.SE403=Integer.parseInt(SE403.getText());
     insert.SE404=Integer.parseInt(SE404.getText());
     insert.SE405=Integer.parseInt(SE405.getText());
     insert.SE406=Integer.parseInt(SE406.getText());
        int total=sub1+sub2+sub3+sub4+sub5+sub6+sub7;
      insert.SETotal=total;
        try {
            insert.csinsert();
        } catch (SQLException ex) {
            Logger.getLogger(FourthYrBIS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FourthYrBIS.class.getName()).log(Level.SEVERE, null, ex);
        }
        BIScaculategrade caculate=new BIScaculategrade();
         
            
         caculate.SERollno=SERollno.getText();;
         caculate.SEName=SEName.getText();
            
          //101
         if(sub1<=100 && sub1>=80)
         {
             caculate.SE401="A";
         }
         else if(sub1<=80 && sub1>=60)
         {
             caculate.SE401="B";
         }
         else if(sub1<=60 && sub1>=40)
         {
             caculate.SE401="C";
         }
         else if(sub1<=40 && sub1>=20)
         {
             caculate.SE401="D";
         }
         else
         {
             caculate.SE401="E";
         }
         //101
         
         //Eng
           if(sub2<=100 && sub2>=80)
         {
             caculate.SEEng="A";
         }
         else if(sub2<=80 && sub2>=60)
         {
             caculate.SEEng="B";
         }
         else if(sub2<=60 && sub2>=40)
         {
             caculate.SEEng="C";
         }
         else if(sub2<=40 && sub2>=20)
         {
             caculate.SEEng="D";
         }
         else
         {
             caculate.SEEng="E";
         }
        //English
        
        //Myanmar
          if(sub3<=100 && sub3>=80)
         {
             caculate.SE402="A";
         }
         else if(sub3<=80 && sub3>=60)
         {
             caculate.SE402="B";
         }
         else if(sub3<=60 && sub3>=40)
         {
             caculate.SE402="C";
         }
         else if(sub3<=40 && sub3>=20)
         {
             caculate.SE402="D";
         }
         else
         {
             caculate.SE402="E";
         }
        //Myanmar
   
           //102
              if(sub4<=100 && sub4>=80)
         {
             caculate.SE403="A";
         }
         else if(sub4<=80 && sub4>=60)
         {
             caculate.SE403="B";
         }
         else if(sub4<=60 && sub4>=40)
         {
             caculate.SE403="C";
         }
         else if(sub4<=40 && sub4>=20)
         {
             caculate.SE403="D";
         }
         else
         {
             caculate.SE403="E";
         }
              //102
              
              //103
               if(sub5<=100 && sub5>=80)
         {
             caculate.SE404="A";
         }
         else if(sub5<=80 && sub5>=60)
         {
             caculate.SE404="B";
         }
         else if(sub5<=60 && sub5>=40)
         {
             caculate.SE404="C";
         }
         else if(sub5<=40 && sub5>=20)
         {
             caculate.SE404="D";
         }
         else
         {
             caculate.SE404="E";
         }
              //103
              
              //104
          if(sub6<=100 && sub6>=80)
         {
             caculate.SE405="A";
         }
         else if(sub6<=80 && sub6>=60)
         {
             caculate.SE405="B";
         }
         else if(sub6>=60 && sub6<=40)
         {
             caculate.SE405="C";
         }
         else if(sub6<=40 && sub6>=20)
         {
             caculate.SE405="D";
         }
         else
         {
             caculate.SE405="E";
         }   
          //104
          
          
        //Physics
           if(sub7<=100 && sub7>=80)
         {
             caculate.SE406="A";
         }
         else if(sub7<=80 && sub7>=60)
         {
             caculate.SE406="B";
         }
         else if(sub7<=60 && sub7>=40)
         {
             caculate.SE406="C";
         }
         else if(sub7<=40 && sub7>=20)
         {
             caculate.SE406="D";
         }
         else
         {
             caculate.SE406="E";
         }
           //Physics
           caculate.SETotal=total;
        try {           
            caculate.third1caculate();
             SERollno.setText(null);
            SEName.setText(null);
            SE401.setText(null);
            SEEng.setText(null);
            SE402.setText(null);
            SE403.setText(null);
            SE404.setText(null);
            SE405.setText(null);
            SE406.setText(null);
        } catch (SQLException ex) {
            Logger.getLogger(FourthYrBIS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FourthYrBIS.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_InsertActionPerformed

    private void SE403ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SE403ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SE403ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Eng;
    private javax.swing.JLabel ID;
    private javax.swing.JButton Insert;
    public javax.swing.JTextField SE401;
    public javax.swing.JTextField SE402;
    public javax.swing.JTextField SE403;
    public javax.swing.JTextField SE404;
    public javax.swing.JTextField SE405;
    public javax.swing.JTextField SE406;
    public javax.swing.JTextField SEEng;
    public javax.swing.JTextField SEName;
    public javax.swing.JTextField SERollno;
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
