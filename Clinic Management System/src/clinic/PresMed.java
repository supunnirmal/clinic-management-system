/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;

import DataBase.PresMedQuery;
import Gui.ReceptionistWindow;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Supun
 */
public class PresMed {

    String Presid;
    String Medname;
    String Times;
    int Days;

    public PresMed() {
    }

    public PresMed(String Presid, String Medname, String Times, int Days) {
        this.Presid = Presid;
        this.Medname = Medname;
        this.Times = Times;
        this.Days = Days;
    }

    public PresMed(JTable tbMed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PresMed(String string, String string0, String string1, int aInt, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMedname() {
        return Medname;
    }

    public void setMedname(String Medname) {
        this.Medname = Medname;
    }

    public String getPresid() {
        return Presid;
    }

    public void setPresid(String Presid) {
        this.Presid = Presid;
    }

    public int getDays() {
        return Days;
    }

    public void setDays(int Days) {
        this.Days = Days;
    }

    public String getTimes() {
        return Times;
    }

    public void setTimes(String Times) {
        this.Times = Times;
    }

    public void Showmed(javax.swing.JTable tbMed, int No) throws SQLException {
        Medicine m = new Medicine();
        PresMedQuery med = new PresMedQuery();
        try {
            ArrayList<PresMed> list1 = new ArrayList();
            ArrayList<Medicine> list2 = new ArrayList();

            med.MedList(list1, list2, No);
            DefaultTableModel model = (DefaultTableModel) tbMed.getModel();
            model.setRowCount(0);
            Object[] row = new Object[5];
            int d = 0;
            for (int i = 0; i < list1.size(); i++) {
                row[0] = list1.get(i).getMedname();
                row[1] = list2.get(i).getMedDescription();
                row[2] = list1.get(i).getTimes();
                if (list1.get(i).getTimes().equals("OD")) {
                    d = list1.get(i).getDays();
                    row[3] = d;
                } else if (list1.get(i).getTimes().equals("OD HS")) {
                    d = list1.get(i).getDays();
                    row[3] = d;
                } else if (list1.get(i).getTimes().equals("BD")) {
                    d = 2 * list1.get(i).getDays();
                    row[3] = d;
                } else if (list1.get(i).getTimes().equals("TDS")) {
                    d = 3 * list1.get(i).getDays();
                    row[3] = d;
                } else {
                    d = 4 * list1.get(i).getDays();
                    row[3] = d;
                }
                // System.out.print(list1.get(i).getMedname());

                // System.out.print(No);
                String mm = med.Availability(d, list1.get(i).getMedname());
                if (mm.equals(list1.get(i).getMedname())) {
                    row[4] = "Available";
                } else {
                    row[4] = "Unavailable";
                }
                model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ReceptionistWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
