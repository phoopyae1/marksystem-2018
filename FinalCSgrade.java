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
public class FinalCSgrade {
    String SEName,SERollno,SE501,SEEng,SE502,SE503,SE504,SE505,SE506;int SETotal;

        public void third1caculate() throws SQLException, ClassNotFoundException
    {
        //InsertDB nn=new InsertDB();
        //try
        //{
          
            Class.forName("java.sql.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/marksystem","root","")) {
            Statement stmt=con.createStatement();
  String query="INSERT INTO `final_yearcs's_grade`(`Rollno`, `Name`, `501`, `Eng`, `502`, `503`, `504`, `505`, `506`,`Total`) VALUES ('"+SERollno+"','"+SEName+"','"+SE501+"','"+SEEng+"','"+SE502+"','"+SE503+"','"+SE504+"','"+SE505+"','"+SE506+"',"+SETotal+")";
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
