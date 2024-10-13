/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;

import DataBase.PresMedQuery;
import DataBase.PrescriptionQuery;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Supun
 */
public class Prescription {

    String Presid;
    String Date;
    int No;
    String tests;
    int Pid;
    int Did;

    public Prescription() {
    }

    public Prescription(int Pid, int No, int Did) {
        this.Pid = Pid;
        this.No = No;
        this.Did = Did;
    }

    public String getPresid() {
        return Presid;
    }

    public void setPresid(String Presid) {
        this.Presid = Presid;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int No) {
        this.No = No;
    }

    public String getTests() {
        return tests;
    }

    public void setTests(String tests) {
        this.tests = tests;
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int Pid) {
        this.Pid = Pid;
    }

    public int getDid() {
        return Did;
    }

    public void setDid(int Did) {
        this.Did = Did;
    }

    public void CreatePrescription(Prescription pre) throws IOException {
        PrescriptionQuery presq = new PrescriptionQuery();
        presq.AddPrescriptionQuery(pre);
    }

    PresMed pm = new PresMed();

    public void EnterMedicine(Vector<Vector<String>> ListRow, String TempNO) {
        ZoneId zonedId = ZoneId.of("Asia/Kolkata");
        LocalDate today = LocalDate.now(zonedId);
        for (int i = 0; i < ListRow.size(); i++) {
            pm.setMedname(ListRow.get(i).get(0));
            pm.setTimes(ListRow.get(i).get(1));
            pm.setDays(Integer.parseInt(ListRow.get(i).get(2)));
            pm.setPresid(TempNO + "/" + today);
            PresMedQuery sm = new PresMedQuery();
            sm.SendMedicine(pm);
        }
    }

    public void EnterTests(String Tests) {
        PrescriptionQuery pq = new PrescriptionQuery();
        pq.SendTests(Tests, pm.getPresid());
    }

    public void ViewPrescription(int Pid, javax.swing.JTextArea txtAreaPrescriptionDetails) {
        PrescriptionQuery pq = new PrescriptionQuery();
        pq.ViewPrescriptionQuery(Pid, txtAreaPrescriptionDetails);
    }

    public void VectorCatch(Vector<Vector<String>> MedicineVector, Vector Dates, javax.swing.JTextArea txtAreaPrescriptionDetails) {
        String[] array = (String[]) Dates.toArray(new String[Dates.size()]);
        array = new HashSet<String>(Arrays.asList(array)).toArray(new String[0]);
        String text = " ";
        for (int i = 0; i < array.length; i++) {
            text = text + array[i] + "\n";
            for (int t = 0; t < MedicineVector.size(); t++) {
                for (int j = 1; j < 4; j++) {
                    if (array[i].equals(MedicineVector.get(t).get(0))) {
                        text = text + MedicineVector.get(t).get(j) + "  ";
                    }
                }
                if (array[i].equals(MedicineVector.get(t).get(0))) {
                    text = text + "\n";
                }
            }
            text = text + "\n";
        }
        txtAreaPrescriptionDetails.setText(text);
    }

    public void refreshTempNumber(javax.swing.JComboBox<String> cmbTempNo) {
        PrescriptionQuery pq = new PrescriptionQuery();
        pq.refreshTempNumberQuery(cmbTempNo);
    }
}
