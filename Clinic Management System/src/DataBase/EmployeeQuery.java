/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import clinic.Bill;
import clinic.Doctor;
import clinic.Employee;
import clinic.Prescription;
import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Supun
 */
public class EmployeeQuery {
                private DBConnManager dbConnManager = null; 
    public EmployeeQuery() {
        dbConnManager = new DBConnManager();
    }
    
    
    public boolean AddEmployeeQuery(Employee emp) throws IOException{
  
        Connection dbConn = null;     
        boolean result = false;
        try {
            dbConn = dbConnManager.connect();  
            Statement stmt = dbConn.createStatement();
            String query = "INSERT INTO employee VALUES('" +emp.getId()+ "','" +emp.getRole()+ "','"+emp.getFname()+ "','" +emp.getLname()+ "','" +emp.getAddress()+ "','" +emp.getDOB()+"','"+emp.getUsername()+"','"+emp.getPassword()+"')"; 
            
            int val = stmt.executeUpdate(query);   
            if (val == 1) {     
                JOptionPane.showMessageDialog(null,"Submited successfully");
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
    
    
    
     public boolean AddDoctorQuery(Doctor doc) throws IOException {

        Connection dbConn = null;
        boolean result = false;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "INSERT INTO doctor VALUES('" + doc.getId() + "','" + doc.getSpecialization() + "','" + doc.getWplace() + "','" + doc.getChnFee() + "')";

            int val = stmt.executeUpdate(query);
            if (val == 1) {
                result = true;
            } else {
                result = false;
            }
        } catch (SQLException sqlException) {
            System.out.println(sqlException + "-----------11Insert query failed");
        } finally {
            dbConnManager.connectionClose(dbConn);
        }
        return result;
    }
     
     
    public void GetAccountQuery(Employee emp) throws IOException, SQLException {
        Connection dbConn = null;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "SELECT * FROM employee WHERE Id = '" + emp.getId() + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                emp.setRole(rs.getString("Role"));
                emp.setFname(rs.getString("Fname"));
                emp.setLname(rs.getString("Lname"));
                emp.setAddress(rs.getString("Address"));
                emp.setDOB(rs.getString("DOB"));

            }
        } catch (SQLException sqlException) {
            System.out.println(sqlException + "-----------Insert query failed");
        } finally {
            dbConnManager.connectionClose(dbConn);
        }
    }
        
    public void GetDocAccountQuery(Doctor doc) throws IOException, SQLException {
        Connection dbConn = null;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "SELECT * FROM doctor WHERE Did = '" + doc.getId() + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                doc.setSpecialization(rs.getString("Specialization"));
                doc.setWplace(rs.getString("Wplace"));
                doc.setChnFee(Float.parseFloat(rs.getString("ChnFee")));

            }
        } catch (SQLException sqlException) {
            System.out.println(sqlException + "-----------Insert query failed");
        } finally {
            dbConnManager.connectionClose(dbConn);
        }
    }
        
        
            
                
    public boolean DropAccountQuery(int Id) throws IOException {

        Connection dbConn = null;
        boolean result = false;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "DELETE FROM employee WHERE Id='" + Id + "'";

            int val = stmt.executeUpdate(query);
            if (val == 1) {
                result = true;
                JOptionPane.showMessageDialog(null, "Successfully deleted !!");
            } else {
                result = false;
            }
        } catch (SQLException sqlException) {
            System.out.println(sqlException + "-----------Insert query failed");
        } finally {
            dbConnManager.connectionClose(dbConn);
        }
        return result;
    }
        
    public void LoginQuery(Employee e) {
        Connection dbConn = null;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "SELECT Id,Password,Role FROM employee WHERE Username = '" + e.getUsername() + "'";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                if (e.getPassword().equals(rs.getString("Password"))) {
                    e.setRole(rs.getString("Role"));
                    e.setId(rs.getInt("Id"));
                } else {
                    JOptionPane.showMessageDialog(null, "Denied");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Denied");
            }
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null, "Denied");
            System.out.println(sQLException + "-----------The entered student ID cannot be found.");
        } finally {
            dbConnManager.connectionClose(dbConn);
        }
    }

    public void changeAccountQuery(Doctor D) {
        changeAccountQuery((Employee) D);
        Connection dbConn = null;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "UPDATE doctor SET  Specialization= '" + D.getSpecialization() + "' ,Wplace = '" + D.getWplace() + "' ,ChnFee = '" + D.getChnFee() + "' WHERE Did = '" + D.getId() + "'";
            stmt.executeUpdate(query);
        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Update query failed");
        } finally {
            dbConnManager.connectionClose(dbConn);
        }
    }

    public void changeAccountQuery(Employee e) {
        Connection dbConn = null;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "UPDATE employee SET Fname = '" + e.getFname() + "' ,Lname = '" + e.getLname() + "' ,Address = '" + e.getAddress() + "',DOB = '" + e.getDOB() + "' WHERE Id = '" + e.getId() + "'";
            int val = stmt.executeUpdate(query);
            if (val == 1) {
                JOptionPane.showMessageDialog(null, "Successfully Updated!!");
            } else {
                JOptionPane.showMessageDialog(null, "Error!!");
            }
        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Update query failed");
        } finally {
            dbConnManager.connectionClose(dbConn);
        }
    }

    public void ViewUserInfroQuery(Employee e) {
        Connection dbConn = null;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "SELECT * FROM employee WHERE Id = '" + e.getId() + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                e.setUsername(rs.getString("Username"));
                e.setPassword(rs.getString("Password"));
            }
        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Update query failed");
        } finally {
            dbConnManager.connectionClose(dbConn);
        }

    }

    public void ChangeUserDeatialsQuery(Employee e) {
        //JOptionPane.showMessageDialog(null,"okay1");
        Connection dbConn = null;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "UPDATE employee SET Username = '" + e.getUsername() + "' ,Password = '" + e.getPassword() + "' WHERE Id = '" + e.getId() + "'";
            stmt.executeUpdate(query);
        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Update query failed");
        } finally {
            dbConnManager.connectionClose(dbConn);
        }
    }

}

