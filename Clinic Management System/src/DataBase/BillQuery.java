
package DataBase;

import clinic.Bill;
import clinic.Patient;
import clinic.Prescription;
import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Supun
 */
public class BillQuery {
    private DBConnManager dbConnManager = null; 
    public BillQuery() {
        dbConnManager = new DBConnManager();
    }
           
    
    public void GetPidDidQuery(Bill b) throws IOException, SQLException{
  
        Connection dbConn = null; 
        try{
            dbConn = dbConnManager.connect();  
            Statement stmt = dbConn.createStatement();
                   
            String query = "SELECT Pid,Did FROM prescription WHERE Presid = '"+b.getPresid()+"'";
            ResultSet rs = stmt.executeQuery(query);
        
            while (rs.next()) {
                b.setPid(Integer.parseInt(rs.getString("Pid")));
                b.setDid(Integer.parseInt(rs.getString("Did")));
            }
        } 
        catch (SQLException sQLException) {    
            System.out.println(sQLException + "-----------The entered student ID cannot be found.");     
        }
        finally {         
            dbConnManager.connectionClose(dbConn);     
        }           
    } 
    
    
    
    
     public String GetPnameQuery(int Pid) throws IOException, SQLException{
         
        String s=null;
        Connection dbConn = null; 
        try{
            dbConn = dbConnManager.connect();  
            Statement stmt = dbConn.createStatement();
        
            Bill b = new Bill();
        
            String query = "SELECT Name FROM patient WHERE Pid = '"+Pid+"'";
            ResultSet rs = stmt.executeQuery(query);
        
            while (rs.next()) {
                s = rs.getString("Name");
            }
        } 
        catch (SQLException sQLException) {    
            System.out.println(sQLException + "-----------The entered student ID cannot be found.");     
        }
        finally {         
            dbConnManager.connectionClose(dbConn);     
        }
        return (s);
    }
     
    public Float GetPriceQuery(String Medname) throws IOException, SQLException{
            
        String s=null;
        Connection dbConn = null; 
        try{
            dbConn = dbConnManager.connect();  
            Statement stmt = dbConn.createStatement();
        
            Bill b = new Bill();
        
            String query = "SELECT Price FROM medicine WHERE Medname = '"+Medname+"'";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                s = rs.getString("Price");
            }
        } 
        catch (SQLException sQLException) {    
            System.out.println(sQLException + "-----------The entered student ID cannot be found.");     
        }
        finally {         
            dbConnManager.connectionClose(dbConn);     
        }
        return (Float.parseFloat(s));
    }
          
          
    public Float GetChnFeeQuery(int Did) throws IOException, SQLException{
  
        String s=null;
        Connection dbConn = null; 
        try{
            dbConn = dbConnManager.connect();  
            Statement stmt = dbConn.createStatement();
        
            Bill b = new Bill();
        
            String query = "SELECT ChnFee FROM doctor WHERE Did = '"+Did+"'";
            ResultSet rs = stmt.executeQuery(query);
        
            while (rs.next()) {
                s = rs.getString("ChnFee");
            }
        } 
        catch (SQLException sQLException) {    
            System.out.println(sQLException + "-----------The entered student ID cannot be found.");     
        }
        finally {         
            dbConnManager.connectionClose(dbConn);     
        }
        return (Float.parseFloat(s));
    }
        
        
    public String GetTestQuery(String Presid) throws IOException, SQLException{
  
        String s=null;
        Connection dbConn = null; 
        try{
            dbConn = dbConnManager.connect();  
            Statement stmt = dbConn.createStatement();
        
            Bill b = new Bill();
        
            String query = "SELECT Tests FROM prescription WHERE Presid = '"+Presid+"'";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                s = rs.getString("Tests");
            }
        } 
        catch (SQLException sQLException) {    
            System.out.println(sQLException + "-----------The entered student ID cannot be found.");     
        }
        finally {         
            dbConnManager.connectionClose(dbConn);     
        }
        return (s);
        
    }
        
    public boolean AddBillQuery() throws IOException{
  
        Connection dbConn = null;     
        boolean result = false;
        try {
            dbConn = dbConnManager.connect();  
            Statement stmt = dbConn.createStatement();
            String query = "INSERT INTO bill (Date,Payment) VALUES('"+java.time.LocalDate.now()+"',0)"; 
 
            int val = stmt.executeUpdate(query);   
            if (val == 1) {
                result = true;         
            } else {  
                result = false;
            }
        }
        catch (SQLException sqlException) {   
            System.out.println(sqlException + "-----------Insert query failed");   
        } finally {  
            dbConnManager.connectionClose(dbConn); 
        }      
        return result;
    }
        
    public int GetBidQuery() throws IOException, SQLException{
  
        String s=null;
        Connection dbConn = null; 
        try{
            dbConn = dbConnManager.connect();  
            Statement stmt = dbConn.createStatement();
        
            Bill b = new Bill();
        
            String query = "SELECT Billid FROM bill WHERE Payment = 0";
            ResultSet rs = stmt.executeQuery(query);
        
            while (rs.next()) {
                s = rs.getString("Billid");
            }
        }
        catch (SQLException sqlException) {   
            System.out.println(sqlException + "-----------Insert query failed");   
        } finally {  
            dbConnManager.connectionClose(dbConn); 
        } 
        return (Integer.parseInt(s));
        
    }
                
                
    public boolean AddBillmedQuery(int Billid,String Medname,int Amount,float Price) throws IOException{
  
        Connection dbConn = null;     
        boolean result = false;
        try {
            dbConn = dbConnManager.connect();  
            Statement stmt = dbConn.createStatement();
                    
            String query = "INSERT INTO billmed VALUES('"+Billid+"','"+Medname+"','"+Amount+"','"+Price+"') "; 
 
            int val = stmt.executeUpdate(query);   
            if (val == 1) {     
                result = true;         
            } else {  
                result = false;
            }
        }
        catch (SQLException sqlException) {   
            System.out.println(sqlException + "-----------Insert query failed");   
        } finally {  
            dbConnManager.connectionClose(dbConn); 
        }      
        return result;
    }
       
       
       
            
    public boolean SetPaymentQuery(int Billid, Float Payment) throws IOException{
  
        Connection dbConn = null;     
        boolean result = false;
        try {
            dbConn = dbConnManager.connect();  
            Statement stmt = dbConn.createStatement();
                    
            String query = "UPDATE bill SET Payment = '"+Payment+"' WHERE Billid = '"+Billid+"'"; 
 
            int val = stmt.executeUpdate(query);   
            if (val == 1) {     
                result = true;         
            } else {  
                result = false;
            }
        }
        catch (SQLException sqlException) {   
            System.out.println(sqlException + "-----------Insert query failed");   
        } finally {  
            dbConnManager.connectionClose(dbConn); 
        }      
        return result;
    }
        
        
    public boolean BillGenQuery(Bill b) throws IOException{
  
        Connection dbConn = null;     
        boolean result = false;
        try {
            dbConn = dbConnManager.connect();  
            Statement stmt = dbConn.createStatement();
            String query = "INSERT INTO billgen VALUES('"+b.getBillid()+"','"+b.getPresid()+"','"+b.getRid()+"')";
                    
                    
            int val = stmt.executeUpdate(query);   
            if (val == 1) {     
                result = true;         
            } else {  
                result = false;
            }
        }
        catch (SQLException sqlException) {   
            System.out.println(sqlException + "-----------Insert query failed");   
        } finally {  
            dbConnManager.connectionClose(dbConn); 
        }      
        return result;
    }
}


