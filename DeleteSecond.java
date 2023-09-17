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

/**
 *
 * @author lenovo
 */
public class DeleteSecond {
      public String ROLLNO;
    public void delete() throws SQLException, ClassNotFoundException
    {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/marksystem","root","");
            Statement stmt=con.createStatement();
            String query="DELETE FROM `second_year's_grade` WHERE Rollno='"+ROLLNO+"'";
            int i=stmt.executeUpdate(query);
            if(i==1)
            {
                System.out.println("Data delete");
            }
            else
            {
                System.out.println("Cannot delete");
            }
            stmt.close();
            con.close();
    }
    
    public void delete1() throws SQLException, ClassNotFoundException
    {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/marksystem","root","");
            Statement stmt=con.createStatement();
            String query="DELETE FROM `second` WHERE Rollno='"+ROLLNO+"'";
            int i=stmt.executeUpdate(query);
            if(i==1)
            {
                System.out.println("Data delete");
            }
            else
            {
                System.out.println("Cannot delete");
            }
            stmt.close();
            con.close();
    }
}
