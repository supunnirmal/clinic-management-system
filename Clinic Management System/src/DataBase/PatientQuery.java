/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

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
public class PatientQuery {

    private DBConnManager dbConnManager = null;

    public PatientQuery() {
        dbConnManager = new DBConnManager();
    }

    public boolean AddPatientQuery(Patient stu) throws IOException {

        Connection dbConn = null;
        boolean result = false;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "INSERT INTO patient (Name,DOB,Gender,address,Email) VALUES('" + stu.getName() + "','" + stu.getDOB() + "','" + stu.getGender() + "','" + stu.getAddress() + "','" + stu.getEmail() + "')";

            int val = stmt.executeUpdate(query);
            if (val == 1) {
                result = true;
            } else {
                result = false;
            }
            JOptionPane.showMessageDialog(null, "Successfully Inserted");
        } catch (SQLException sqlException) {
            System.out.println(sqlException + "-----------Insert query failed");
        } finally {
            dbConnManager.connectionClose(dbConn);
        }
        return result;
    }

    public void DoctorViewPatientQuery(String PresId, Patient pa) {
        java.sql.Connection dbConn = null;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "SELECT Pid,Name,DOB,SpNotes FROM patient WHERE Pid IN (SELECT Pid FROM prescription WHERE Presid='" + PresId + "')";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                pa.setPid(rs.getInt("Pid"));
                pa.setName(rs.getString("Name"));
                pa.setDOB(rs.getString("DOB"));
                pa.setSpNotes(rs.getString("SpNotes"));
            }
        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------The entered Entry cannot be found.");
        } finally {
            dbConnManager.connectionClose((com.mysql.jdbc.Connection) dbConn);
        }
    }

    public void SendSpecialNote(String SpecialNote, String PresId) {
        java.sql.Connection dbConn = null;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "UPDATE patient SET SpNotes='" + SpecialNote + "' WHERE Pid in(SELECT Pid FROM prescription where Presid='" + PresId + "')";
            stmt.executeUpdate(query);
        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Update query failed");
        } finally {
            dbConnManager.connectionClose((com.mysql.jdbc.Connection) dbConn);
        }
    }

}
