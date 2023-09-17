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
public class CTcaculategrade {
    String CTName,CTRollno,CT301,CTEng,CT302,CT303,CT304,CT305,CT306;int CTTotal;

        public void thirdcaculate() throws SQLException, ClassNotFoundException
    {
        //InsertDB nn=new InsertDB();
        //try
        //{
          
            Class.forName("java.sql.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/marksystem","root","")) {
            Statement stmt=con.createStatement();
            String query="INSERT INTO `thirdyrct's_grade`(`Rollno`, `Name`, `301`, `Eng`, `302`, `303`, `304`, `305`, `306`,`Total`) VALUES ('"+CTRollno+"','"+CTName+"','"+CT301+"','"+CTEng+"','"+CT302+"','"+CT303+"','"+CT304+"','"+CT305+"','"+CT306+"',"+CTTotal+")";
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
