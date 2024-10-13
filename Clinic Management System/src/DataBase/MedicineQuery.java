/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import clinic.Medicine;
import clinic.Prescription;
import java.util.Arrays;
import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Supun
 */
public class MedicineQuery {

    private DBConnManager dbConnManager = null;

    public MedicineQuery() {
        dbConnManager = new DBConnManager();
    }

    public void FindMedQuery(Medicine med) throws SQLException {

        Connection dbConn = null;
        try {

            dbConn = dbConnManager.connect();
            Statement stmt1 = dbConn.createStatement();

            String query = "SELECT * FROM medicine WHERE Medname = '" + med.getMedname() + "'";
            ResultSet rs1 = stmt1.executeQuery(query);
            boolean value = false;
            while (rs1.next()) {
                med.setQuantity(Integer.parseInt(rs1.getString("Quantity")));
                med.setPrice(Float.parseFloat(rs1.getString("Price")));
                med.setMedDescription(rs1.getString("MedDescription"));
                value = true;
            }
            if (value == false) {
                JOptionPane.showMessageDialog(null, "Invalid Medicine name!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            dbConnManager.connectionClose(dbConn);
        }
    }

    public boolean EditMedicineQuery(Medicine med) throws IOException {

        Connection dbConn = null;
        boolean result = false;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "UPDATE medicine SET Quantity='" + med.getQuantity() + "', Price='" + med.getPrice() + "', MedDescription='" + med.getMedDescription() + "' WHERE Medname  = '" + med.getMedname() + "'";
            int val = stmt.executeUpdate(query);
            if (val == 1) {
                result = true;
                JOptionPane.showMessageDialog(null, "Successfully submitted!!");
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

    public boolean AddMedicineQuery(Medicine med) throws IOException {

        Connection dbConn = null;
        boolean result = false;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "INSERT INTO medicine VALUES('" + med.getMedname() + "','" + med.getQuantity() + "','" + med.getPrice() + "','" + med.getMedDescription() + "')";

            int val = stmt.executeUpdate(query);
            if (val == 1) {
                JOptionPane.showMessageDialog(null, "Successfully added!!");
                result = true;
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

    public boolean DeleteMedicineQuery(Medicine med) throws IOException {

        Connection dbConn = null;
        boolean result = false;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            System.out.print(med.getMedname());
            String query = "DELETE FROM medicine WHERE Medname = '" + med.getMedname() + "'";

            int val = stmt.executeUpdate(query);
            if (val == 1) {
                JOptionPane.showMessageDialog(null, "Successfully deleted!!");
                result = true;
            } else {
                result = false;
                JOptionPane.showMessageDialog(null, "Select a medicine!!!!");
            }
        } catch (SQLException sqlException) {
            System.out.println(sqlException + "-----------Insert query failed");
        } finally {
            dbConnManager.connectionClose(dbConn);
        }
        return result;
    }

    public void FillCmbMedicine(javax.swing.JComboBox<String> cmbMedicine) {
        java.sql.Connection dbConn = null;
        try {
            dbConn = dbConnManager.connect();
            String sql = "select Medname from medicine";
            Statement stmt = dbConn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String name = rs.getString("Medname");
                cmbMedicine.addItem(name);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            dbConnManager.connectionClose((com.mysql.jdbc.Connection) dbConn);
        }
    }

    public boolean UpdateQuantityQuery(String Medname, int Quantity) throws IOException {

        Connection dbConn = null;
        boolean result = false;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt1 = dbConn.createStatement();
            Statement stmt2 = dbConn.createStatement();

            String query1 = "SELECT Quantity FROM medicine WHERE Medname = '" + Medname + "'";

            ResultSet rs = stmt1.executeQuery(query1);
            int Qty = 0;
            if (rs.next()) {
                Qty = (Integer.parseInt(rs.getString("Quantity")));
            }
            Qty = Qty - Quantity;
            String query2 = "UPDATE medicine SET Quantity='" + Qty + "' WHERE Medname = '" + Medname + "'";

            int val = stmt2.executeUpdate(query2);
            if (val == 1) {
                result = true;
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

    public Vector<Vector<String>> getQuantityQuary() {

        Vector<Vector<String>> medicine = null;
        Connection dbConn = null;

        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "SELECT * FROM medicine ORDER BY Quantity";

            ResultSet rs = stmt.executeQuery(query);
            medicine = new Vector<Vector<String>>();

            while (rs.next()) {
                Vector<String> med = new Vector<String>();
                med.add(rs.getString(1));
                med.add(rs.getString(2));
                med.add(rs.getString(3));
                med.add(rs.getString(4));
                medicine.add(med);
                System.out.println("-----------Select query failed");

            }
        } catch (SQLException sQLException) {
            System.out.println(sQLException + "-----------Select query failed");
        } finally {
            dbConnManager.connectionClose(dbConn);
        }
        return medicine;

    }

    public boolean RefillQuantityQuery(Medicine med) throws IOException {

        Connection dbConn = null;
        boolean result = false;
        try {
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();

            String query = "UPDATE medicine SET Quantity='" + med.getQuantity() + "' WHERE Medname = '" + med.getMedname() + "'";

            int val = stmt.executeUpdate(query);
            if (val == 1) {
                result = true;
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

}
