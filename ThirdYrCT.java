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
public class ThirdYrCT extends javax.swing.JPanel {
//InsertDBMark i=new InsertDBMark();
/**
     * Creates new form FirstYr
     */ 
    public ThirdYrCT() {
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
        CT304 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CT302 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CT305 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CT306 = new javax.swing.JTextField();
        Insert = new javax.swing.JButton();
        CT301 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CTName = new javax.swing.JTextField();
        Eng = new javax.swing.JLabel();
        CTEng = new javax.swing.JTextField();
        ID = new javax.swing.JLabel();
        CTRollno = new javax.swing.JTextField();
        CT303 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("301");

        jLabel3.setText("ThirdYear CT");

        jLabel4.setText("304");

        CT304.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CT304ActionPerformed(evt);
            }
        });

        jLabel5.setText("302");

        CT302.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CT302ActionPerformed(evt);
            }
        });

        jLabel6.setText("305");

        CT305.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CT305ActionPerformed(evt);
            }
        });

        jLabel7.setText("306");

        CT306.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CT306ActionPerformed(evt);
            }
        });

        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        CT301.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CT301ActionPerformed(evt);
            }
        });

        jLabel8.setText("Name");

        CTName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTNameActionPerformed(evt);
            }
        });

        Eng.setText("English");

        CTEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTEngActionPerformed(evt);
            }
        });

        ID.setText("Roll no");

        CTRollno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTRollnoActionPerformed(evt);
            }
        });

        CT303.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CT303ActionPerformed(evt);
            }
        });

        jLabel9.setText("303");

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
                            .addComponent(CTRollno, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CTName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CT301, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CTEng, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CT302, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CT303, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CT304, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CT305, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CT306, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                            .addComponent(CTRollno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(CTName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(CT301, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(CTEng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Eng))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CT302, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CT303, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(CT304, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CT305, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CT306, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(44, 44, 44)
                .addComponent(Insert)
                .addContainerGap(114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CT304ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CT304ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CT304ActionPerformed

    private void CT302ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CT302ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CT302ActionPerformed

    private void CT305ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CT305ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CT305ActionPerformed

    private void CT306ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CT306ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CT306ActionPerformed

    private void CT301ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CT301ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CT301ActionPerformed

    private void CTNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CTNameActionPerformed

    private void CTEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTEngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CTEngActionPerformed

    private void CTRollnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTRollnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CTRollnoActionPerformed

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
          int sub1=Integer.parseInt(CT301.getText());
        int sub2=Integer.parseInt(CTEng.getText());
        int sub3=Integer.parseInt(CT302.getText());
        int sub4=Integer.parseInt(CT303.getText());
        int sub5=Integer.parseInt(CT304.getText());
        int sub6=Integer.parseInt(CT305.getText());
         int sub7=Integer.parseInt(CT306.getText());
            int total=sub1+sub2+sub3+sub4+sub5+sub6+sub7;
     InsertDBCT insert=new InsertDBCT();
     insert.CTRollno=CTRollno.getText();
     insert.CTNAME=CTName.getText();
     insert.CT301=Integer.parseInt(CT301.getText());
     insert.CTEng=Integer.parseInt(CTEng.getText());
     insert.CT302=Integer.parseInt(CT302.getText());
     insert.CT303=Integer.parseInt(CT303.getText());
     insert.CT304=Integer.parseInt(CT304.getText());
     insert.CT305=Integer.parseInt(CT305.getText());
     insert.CT306=Integer.parseInt(CT306.getText());
     insert.CTtotal=total;
        try {
            insert.ctinsert();
        } catch (SQLException ex) {
            Logger.getLogger(ThirdYrCT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThirdYrCT.class.getName()).log(Level.SEVERE, null, ex);
        }
        CTcaculategrade caculate=new CTcaculategrade();
        
         caculate.CTRollno=CTRollno.getText();;
         caculate.CTName=CTName.getText();
            
          //101
         if(sub1<=100 && sub1>=80)
         {
             caculate.CT301="A";
         }
         else if(sub1<=80 && sub1>=60)
         {
             caculate.CT301="B";
         }
         else if(sub1<=60 && sub1>=40)
         {
             caculate.CT301="C";
         }
         else if(sub1<=40 && sub1>=20)
         {
             caculate.CT301="D";
         }
         else
         {
             caculate.CT301="E";
         }
         //101
         
         //Eng
           if(sub2<=100 && sub2>=80)
         {
             caculate.CTEng="A";
         }
         else if(sub2<=80 && sub2>=60)
         {
             caculate.CTEng="B";
         }
         else if(sub2<=60 && sub2>=40)
         {
             caculate.CTEng="C";
         }
         else if(sub2<=40 && sub2>=20)
         {
             caculate.CTEng="D";
         }
         else
         {
             caculate.CTEng="E";
         }
        //English
        
        //Myanmar
          if(sub3<=100 && sub3>=80)
         {
             caculate.CT302="A";
         }
         else if(sub3<=80 && sub3>=60)
         {
             caculate.CT302="B";
         }
         else if(sub3<=60 && sub3>=40)
         {
             caculate.CT302="C";
         }
         else if(sub3<=40 && sub3>=20)
         {
             caculate.CT302="D";
         }
         else
         {
             caculate.CT302="E";
         }
        //Myanmar
   
           //102
              if(sub4<=100 && sub4>=80)
         {
             caculate.CT303="A";
         }
         else if(sub4<=80 && sub4>=60)
         {
             caculate.CT303="B";
         }
         else if(sub4<=60 && sub4>=40)
         {
             caculate.CT303="C";
         }
         else if(sub4<=40 && sub4>=20)
         {
             caculate.CT303="D";
         }
         else
         {
             caculate.CT303="E";
         }
              //102
              
              //103
               if(sub5<=100 && sub5>=80)
         {
             caculate.CT304="A";
         }
         else if(sub5<=80 && sub5>=60)
         {
             caculate.CT304="B";
         }
         else if(sub5<=60 && sub5>=40)
         {
             caculate.CT304="C";
         }
         else if(sub5<=40 && sub5>=20)
         {
             caculate.CT304="D";
         }
         else
         {
             caculate.CT304="E";
         }
              //103
              
              //104
          if(sub6<=100 && sub6>=80)
         {
             caculate.CT305="A";
         }
         else if(sub6<=80 && sub6>=60)
         {
             caculate.CT305="B";
         }
         else if(sub6>=60 && sub6<=40)
         {
             caculate.CT305="C";
         }
         else if(sub6<=40 && sub6>=20)
         {
             caculate.CT305="D";
         }
         else
         {
             caculate.CT305="E";
         }   
          //104
          
          
        //Physics
           if(sub7<=100 && sub7>=80)
         {
             caculate.CT306="A";
         }
         else if(sub7<=80 && sub7>=60)
         {
             caculate.CT306="B";
         }
         else if(sub7<=60 && sub7>=40)
         {
             caculate.CT306="C";
         }
         else if(sub7<=40 && sub7>=20)
         {
             caculate.CT306="D";
         }
         else
         {
             caculate.CT306="E";
         }
           //Physics
           caculate.CTTotal=total;
        try {
            caculate.thirdcaculate();
        } catch (SQLException ex) {
            Logger.getLogger(ThirdYrCT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThirdYrCT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_InsertActionPerformed

    private void CT303ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CT303ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CT303ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField CT301;
    public javax.swing.JTextField CT302;
    public javax.swing.JTextField CT303;
    public javax.swing.JTextField CT304;
    public javax.swing.JTextField CT305;
    public javax.swing.JTextField CT306;
    public javax.swing.JTextField CTEng;
    public javax.swing.JTextField CTName;
    public javax.swing.JTextField CTRollno;
    private javax.swing.JLabel Eng;
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
