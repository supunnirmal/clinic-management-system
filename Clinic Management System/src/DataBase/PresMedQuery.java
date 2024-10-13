/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import clinic.Medicine;
import clinic.PresMed;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Supun
 */
public class PresMedQuery {

    private DBConnManager dbConnManager = null;

    public PresMedQuery() {
        dbConnManager = new DBConnManager();
    }
    public String q;

    public void MedList(ArrayList MedLists, ArrayList Meds, int No) throws SQLException {
        
        Connection dbConn = null;
        boolean result = false;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt1 = dbConn.createStatement();

            Statement stmt2 = dbConn.createStatement();
            q = No + "/" + java.time.LocalDate.now();

            String query1 = "SELECT * FROM presmed where Presid = '" + q + "'";
            String query2 = "SELECT MedDescription FROM medicine where Medname in (SELECT Medname from presmed where Presid = '" + q + "')";

            ResultSet rs1 = stmt1.executeQuery(query1);
            ResultSet rs2 = stmt2.executeQuery(query2);
            PresMed presmed;
            Medicine med;
            while (rs1.next()) {
                presmed = new PresMed(rs1.getString("Presid"), rs1.getString("Medname"), rs1.getString("Times"), rs1.getInt("Days"));

                MedLists.add(presmed);

            }
            while (rs2.next()) {
                med = new Medicine(rs2.getString("MedDescription"));
                Meds.add(med);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            dbConnManager.connectionClose((com.mysql.jdbc.Connection) dbConn);
        }

    }

    public String Availability(int d, String Medname) throws SQLException {
        String med = "";
        Connection dbConn = null;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt1 = dbConn.createStatement();
            String query = "SELECT Medname FROM medicine where Medname in (SELECT Medname from presmed WHERE Presid = '" + q + "' and Medname = '" + Medname + "') and Quantity>='" + d + "'";
            ResultSet rs1 = stmt1.executeQuery(query);

            while (rs1.next()) {
                med = (rs1.getString("Medname"));
            }
        } catch (SQLException sqlException) {
            System.out.println(sqlException + "-----------Insert query failed");
        } finally {
            dbConnManager.connectionClose((com.mysql.jdbc.Connection) dbConn);
        }
        return med;
    }

    public void SendMedicine(PresMed pm) {
        java.sql.Connection dbConn = null;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "INSERT INTO presmed(Presid,Medname,Times,Days)" + " VALUES('" + pm.getPresid() + "','" + pm.getMedname() + "','" + pm.getTimes() + "','" + pm.getDays() + "')";
            stmt.executeUpdate(query);
        } catch (SQLException sqlException) {
            System.out.println(sqlException + "-----------Insert query failed");
        } finally {
            dbConnManager.connectionClose((com.mysql.jdbc.Connection) dbConn);
        }

    }
}
