/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import clinic.Complain;
import clinic.Medicine;
import clinic.Patient;
import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Supun
 */
public class ComplainQuery {
    
    private DBConnManager dbConnManager = null; 
    public ComplainQuery() {
        dbConnManager = new DBConnManager();
    }
    
    public boolean AddComplaitQuery(Complain com) throws IOException{
  
        Connection dbConn = null;     
        boolean result = false;
        try {
            dbConn = dbConnManager.connect();  
            Statement stmt = dbConn.createStatement();
            String query = "INSERT INTO complain (Date,ComDescription,Billid) VALUES('" +com.getDate()+ "','"+com.getComDescription()+ "','" +com.getBillid()+"')"; 
 
            int val = stmt.executeUpdate(query);   
            if (val == 1) {     
                JOptionPane.showMessageDialog(null, "Successfully submitted!!");
                result = true;         
            } else {  
                result = false;
            }
        }
        catch (SQLException sqlException) {   
            JOptionPane.showMessageDialog(null,"Invalid bill No!!");
            System.out.println(sqlException + "-----------Insert query failed");   
        } finally {  
            dbConnManager.connectionClose(dbConn); 
        }      
        return result;
    }

    public void FindComplainQuary(Complain com) throws SQLException{
        
        Connection dbConn = null; 
        try{
                
            dbConn = dbConnManager.connect();  
            Statement stmt1 = dbConn.createStatement();
         
            String query = "SELECT * FROM medicine WHERE Medname = '"+com.getBillid()+"'";
            ResultSet rs1 = stmt1.executeQuery(query);
         
            while(rs1.next())
            {
                com.setComid(Integer.parseInt(rs1.getString("Comid")));
                com.setDate((rs1.getString("Date")));
                com.setComDescription(rs1.getString("ComDescription"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        finally {  
            dbConnManager.connectionClose(dbConn); 
        }      
    }
           
    public boolean FindDocResQuary(Complain com) throws SQLException{
        Connection dbConn = null; 
        boolean result=false;
        try{
            dbConn = dbConnManager.connect();  
            Statement stmt1 = dbConn.createStatement();
            Statement stmt2 = dbConn.createStatement();
            Statement stmt3 = dbConn.createStatement();
         
            String query1 = "SELECT Fname,Lname FROM employee WHERE Id in(SELECT Did fROM doctor WHERE Did in(SELECT Did FROM Prescription WHERE Presid in (SELECT Presid FROM billgen WHERE Billid = '"+com.getBillid()+"')))";
            ResultSet rs1 = stmt1.executeQuery(query1);
            boolean value1=false;
            while(rs1.next())
            {
                com.setDocFname(rs1.getString("Fname"));
                com.setDocLname(rs1.getString("Lname"));
                value1=true;
            }
            if(value1==false)
            {
                JOptionPane.showMessageDialog(null,"No any complains for this billl no!!");
                return result;
            }
        
            String query2 = "SELECT Fname,Lname FROM employee WHERE Id in(SELECT Rid FROM billgen WHERE Billid = '"+com.getBillid()+"')";
            ResultSet rs2 = stmt2.executeQuery(query2);
         
            while(rs2.next())
            {
                com.setResFname(rs2.getString("Fname"));
                com.setResLname(rs2.getString("Lname"));
            }
         
            String query3 = "SELECT * FROM complain WHERE Billid = '"+com.getBillid()+"'";
            ResultSet rs3 = stmt3.executeQuery(query3);
            boolean value2=false;
            while(rs3.next())
            {
                com.setComid(Integer.parseInt(rs3.getString("Comid")));
                com.setDate(rs3.getString("Date"));
                com.setComDescription(rs3.getString("ComDescription"));
                value2=true;
            }
            if(value2==false)
            {
                JOptionPane.showMessageDialog(null,"No any complaints for tis bill number");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        finally {  
            dbConnManager.connectionClose(dbConn); 
        }      
        return result;
    }               
}
