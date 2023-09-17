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
public class InsertDBCS {
    String CSRollno;
    String CSNAME;
    int CS301,CSEng,CS302,CS303,CS304,CS305,CS306,CSTotal;
       public void csinsert() throws SQLException, ClassNotFoundException
    {
        //InsertDB nn=new InsertDB();
        //try
        //{
          
            Class.forName("java.sql.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/marksystem","root","")) {
            Statement stmt=con.createStatement();
            String query="INSERT INTO `thirdyrcs`(`Rollno`, `Name`, `301`, `Eng`, `302`, `303`,`304`, `305`, `306`,`Total`) VALUES ('"+CSRollno+"','"+CSNAME+"',"+CS301+","+CSEng+","+CS302+","+CS303+","+CS304+","+CS305+","+CS306+","+CSTotal+")";
            int i;
            i = stmt.executeUpdate(query);
       stmt.close();
        }
        }
}
