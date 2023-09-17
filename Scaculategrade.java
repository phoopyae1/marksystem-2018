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
public class Scaculategrade {
    String SRollno;
    String SNAME;
    String S201;
    String SEng;
    String S202;
    String S203;
    String S204;
    String S205;
    String S206;
    int Total;
        public void Secondcaculate() throws SQLException, ClassNotFoundException
    {
        //InsertDB nn=new InsertDB();
        //try
        //{
          
            Class.forName("java.sql.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/marksystem","root","")) {
            Statement stmt=con.createStatement();
            String query="INSERT INTO `second_year's_grade`(`Rollno`, `Name`, `201`, `Eng`, `202`, `203`, `204`, `205`, `206`,`Total`) VALUES ('"+SRollno+"','"+SNAME+"','"+S201+"','"+SEng+"','"+S202+"','"+S203+"','"+S204+"','"+S205+"','"+S206+"',"+Total+")";
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
