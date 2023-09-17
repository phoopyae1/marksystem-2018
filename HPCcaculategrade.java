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
public class HPCcaculategrade {
    String SEName,SERollno,SE401,SEEng,SE402,SE403,SE404,SE405,SE406;int SETotal;

        public void third1caculate() throws SQLException, ClassNotFoundException
    {
        //InsertDB nn=new InsertDB();
        //try
        //{
          
            Class.forName("java.sql.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/marksystem","root","")) {
            Statement stmt=con.createStatement();
  String query="INSERT INTO `fourth_yearhpc's_grade`(`Rollno`, `Name`, `401`, `Eng`, `402`, `403`, `404`, `405`, `406`,`Total`) VALUES ('"+SERollno+"','"+SEName+"','"+SE401+"','"+SEEng+"','"+SE402+"','"+SE403+"','"+SE404+"','"+SE405+"','"+SE406+"',"+SETotal+")";
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
        }
}
