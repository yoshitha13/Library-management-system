package library.management.system;


import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.sqlite.org");  
            c =DriverManager.getConnection("jdbc:sqlite:///project7","root","");    
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
