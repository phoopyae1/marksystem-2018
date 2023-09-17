package phoopyaepyaesoe1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertSecond {
    String Rollno;
    String NAME;
    int A201;
    int AEng;
    int A202;
    int A203;
    int A204;
    int A205;
    int A206;
    int Total;
    
    public void insert2() throws SQLException, ClassNotFoundException
    {
        //InsertDB nn=new InsertDB();
        //try
        //{
          
            Class.forName("java.sql.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/marksystem","root","")) {
            Statement stmt=con.createStatement();
            String query="INSERT INTO `second`(`Rollno`, `Name`, `201`, `Eng`, `202`, `203`, `204`, `205`, `206`,`Total`) VALUES ('"+Rollno+"','"+NAME+"',"+A201+","+AEng+","+A202+","+A203+","+A204+","+A205+","+A206+","+Total+")";
            int i = stmt.executeUpdate(query);
            /* if(i==1)
            {
            System.out.println("Data inserted");
            }
            else
            {
            System.out.println("Cannot insert");
            }*/
            stmt.close();
        }
        }
        //catch(Exception e)
        //{
        //   System.out.println("Database error");
        //}
        //return nn;
    }
