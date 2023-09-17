/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phoopyaepyaesoe1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Caculategrade extends FirstYr{
   String Rollno;
    String NAME;
   String F101;
   String FEng;
  String FMyan;
    String FPhys;
   String F102;
   String F103;
    String F104;
   int Total;
    
    public void caculate() throws SQLException, ClassNotFoundException
    {
        //InsertDB nn=new InsertDB();
        //try
        //{
          
            Class.forName("java.sql.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/marksystem","root","")) {
            Statement stmt=con.createStatement();
            String query="INSERT INTO `first_year's_grade`(`Rollno`, `Name`, `101`, `Eng`, `Myan`, `Phys`, `102`, `103`, `104`,`Total`) VALUES ('"+Rollno+"','"+NAME+"','"+F101+"','"+FEng+"','"+FMyan+"','"+FPhys+"','"+F102+"','"+F103+"','"+F104+"',"+Total+")";
            int i;
            i = stmt.executeUpdate(query);
            if(i==1)
            {
            JOptionPane.showMessageDialog(null,"Data Inserted!!");
            }
            else
            {
            JOptionPane.showMessageDialog(null,"Data Inserted!!");           
            }
            stmt.close();
     
        }
        //catch(Exception e)
        //{
        //   System.out.println("Database error");
        //}
        //return nn;
           }
    
}

