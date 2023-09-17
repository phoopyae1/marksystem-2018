package phoopyaepyaesoe1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class InsertDBMark {
    String Rollno;
    String NAME;
    int F101;
    int FEng;
    int FMyan;
    int FPhys;
    int F102;
    int F103;
    int F104;
    int Total;
    
    
    public void insert() throws SQLException, ClassNotFoundException
    {
        //InsertDB nn=new InsertDB();
        //try
        //{
          
            Class.forName("java.sql.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/marksystem","root","")) {
            Statement stmt=con.createStatement();
        String query=" INSERT INTO `first_year`(`Rollno`, `Name`, `101`, `Eng`, `Myan`, `Physics`, `102`, `103`, `104`, `Total`) VALUES ('"+Rollno+"','"+NAME+"',"+F101+","+FEng+","+FMyan+","+FPhys+","+F102+","+F103+","+F104+","+Total+")";
            int i;
            i = stmt.executeUpdate(query);
       stmt.close();
        }
        }
        //catch(Exception e)
        //{
        //   System.out.println("Database error");
        //}
        //return nn;
    }
