/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import clinic.Patient;
import Gui.ReceptionistWindow;
import clinic.Prescription;
import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Supun
 */
public class PrescriptionQuery {

    private DBConnManager dbConnManager = null;

    public PrescriptionQuery() {
        dbConnManager = new DBConnManager();
    }

    public boolean AddPrescriptionQuery(Prescription pres) throws IOException {

        Connection dbConn = null;
        boolean result = false;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String Presid = pres.getNo() + "/" + java.time.LocalDate.now();
            String query = "INSERT INTO prescription(Presid,Date,No,Pid,Did) VALUES('" + Presid + "','" + java.time.LocalDate.now() + "','" + pres.getNo() + "','" + pres.getPid() + "','" + pres.getDid() + "')";

            int val = stmt.executeUpdate(query);
            if (val == 1) {
                result = true;
            } else {
                result = false;
            }
            JOptionPane.showMessageDialog(null, "Entered Successfully !!");
        } catch (SQLException sqlException) {
            System.out.println(sqlException + "-----------Insert query failed");
            JOptionPane.showMessageDialog(null, "Invalid entry !!");
        } finally {
            dbConnManager.connectionClose(dbConn);
        }
        return result;
    }

    public void SendTests(String Tests, String PresId) {
        java.sql.Connection dbConn = null;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "UPDATE prescription SET Tests='" + Tests + "'WHERE Presid='" + PresId + "'";
            stmt.executeUpdate(query);
        } catch (SQLException sqlException) {
            System.out.println(sqlException + "-----------Insert query failed");
        } finally {
            dbConnManager.connectionClose((com.mysql.jdbc.Connection) dbConn);
        }
    }

    public void ViewPrescriptionQuery(int Pid, javax.swing.JTextArea txtAreaPrescriptionDetails) {
        Vector<Vector<String>> MedicineVector = null;
        Vector<String> Dates = null;
        java.sql.Connection dbConn = null;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "SELECT Presid,Medname,Times,Days FROM presmed WHERE Presid IN (SELECT Presid FROM prescription WHERE Pid='" + Pid + "')";
            ResultSet rs = stmt.executeQuery(query);
            MedicineVector = new Vector<Vector<String>>();
            Dates = new Vector<String>();
            while (rs.next()) {
                Vector<String> row = new Vector<String>();
                row.add(rs.getString("Presid").substring(rs.getString("Presid").length() - 10));
                Dates.add(rs.getString("Presid").substring(rs.getString("Presid").length() - 10));
                row.add(rs.getString("Medname"));
                row.add(rs.getString("Times"));
                row.add(rs.getString("Days"));
                MedicineVector.add(row);
            }
            Prescription p = new Prescription();
            p.VectorCatch(MedicineVector, Dates, txtAreaPrescriptionDetails);
        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------The entered Entry cannot be found.");
        } finally {
            dbConnManager.connectionClose((com.mysql.jdbc.Connection) dbConn);
        }
    }

    public void refreshTempNumberQuery(javax.swing.JComboBox<String> cmbTempNo) {
        java.sql.Connection dbConn = null;
        try {
            dbConn = dbConnManager.connect();
            String sql = "select No from prescription where Date='" + java.time.LocalDate.now().toString() + "'";
            Statement stmt = dbConn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            Vector<String> TempNo = new Vector<String>();
            while (rs.next()) {
                String No = String.valueOf(rs.getInt("No"));
                TempNo.add(No);
            }
            Collections.sort(TempNo);
            for (int i = 0; i < TempNo.size(); i++) {
                cmbTempNo.addItem(TempNo.get(i));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            dbConnManager.connectionClose((com.mysql.jdbc.Connection) dbConn);
        }
    }

}
