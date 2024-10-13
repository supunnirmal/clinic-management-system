/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Supun
 */
public class DBConnManager {
     String sourceURL = new String("jdbc:mysql://localhost:3306/clinic?"); 
    public DBConnManager() {
        try {  
            Class.forName("com.mysql.jdbc.Driver");         
        } 
        catch (ClassNotFoundException classNotFoundException) 
        {            
            System.out.println(classNotFoundException + "-----------Unable to load database driver classes");        
        }
    }
    public Connection connect() 
    {  
        Connection dbConn = null;  
        try {     
            dbConn = (Connection) DriverManager.getConnection(sourceURL, "root", "");     
        }
        catch (SQLException sQLException) 
        {
            System.out.println(sQLException + "-----------DB connection failure");      
        }
        return dbConn;  
    }
    public void connectionClose(Connection dbConn)
    {
        try {
            dbConn.close();
        }
        catch (SQLException sQLException)
        {
            System.out.println(sQLException + "-----------DB connection closing failure");   
        }   
    }
}
