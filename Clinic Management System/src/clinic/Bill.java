/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;

import DataBase.BillQuery;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Supun
 */
public class Bill {

    int Billid;
    String Date;
    float Payment;
    String PreMed;
    String PharMed;
    int Did;
    float ChnFee;
    int Pid;
    String Presid;
    String Pname;
    String Test;
    int Rid;

    public int getRid() {
        return Rid;
    }

    public void setRid(int Rid) {
        this.Rid = Rid;
    }

    public String getTest() {
        return Test;
    }

    public void setTest(String Test) {
        this.Test = Test;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String Pname) {
        this.Pname = Pname;
    }

    public String getPresid() {
        return Presid;
    }

    public void setPresid(String Presid) {
        this.Presid = Presid;
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int Pid) {
        this.Pid = Pid;
    }

    public String getPreMed() {
        return PreMed;
    }

    public void setPreMed(String PreMed) {
        this.PreMed = PreMed;
    }

    public String getPharMed() {
        return PharMed;
    }

    public void setPharMed(String PharMed) {
        this.PharMed = PharMed;
    }

    public Bill() {
        this.Date = String.valueOf(java.time.LocalDate.now());
    }

    public int getDid() {
        return Did;
    }

    public void setDid(int Did) {
        this.Did = Did;
    }

    public float getChnFee() {
        return ChnFee;
    }

    public void setChnFee(float ChnFee) {
        this.ChnFee = ChnFee;
    }

    public int getBillid() {
        return Billid;
    }

    public void setBillid(int Billid) {
        this.Billid = Billid;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public float getPayment() {
        return Payment;
    }

    public void setPayment(float Payment) {
        this.Payment = Payment;
    }

    public void GetPidDidFromDB(Bill bill) throws IOException, SQLException {
        BillQuery b = new BillQuery();
        b.GetPidDidQuery(bill);
    }

    public void GetPnameFromDB() throws IOException, SQLException {
        BillQuery b = new BillQuery();
        Pname = b.GetPnameQuery(getPid());
    }

    public void GetChnFeeFromDB() throws IOException, SQLException {
        BillQuery b = new BillQuery();
        ChnFee = b.GetChnFeeQuery(getDid());
        b.SetPaymentQuery(Billid, (Payment + ChnFee));
    }

    public void GetTestFromDB() throws IOException, SQLException {
        BillQuery b = new BillQuery();
        Test = b.GetTestQuery(getPresid());
    }

    public void PrePharDevid(javax.swing.JTable tbMed) throws IOException, SQLException {
        BillQuery b = new BillQuery();
        b.AddBillQuery();
        Billid = b.GetBidQuery();
        int i = tbMed.getRowCount();
        setPreMed("");
        setPharMed("");
        for (int j = 0; j < i; j++) {
            if (tbMed.getValueAt(j, 4).equals("Available")) {
                PreMed += tbMed.getValueAt(j, 0) + "\n";

                float Price = b.GetPriceQuery((String) tbMed.getValueAt(j, 0)) * Integer.valueOf((int) tbMed.getValueAt(j, 3));
                Payment += Price;
                b.AddBillmedQuery(Billid, (String) tbMed.getValueAt(j, 0), Integer.valueOf((int) tbMed.getValueAt(j, 3)), Price);
                Medicine med = new Medicine();
                med.UpdateQuantity((String) tbMed.getValueAt(j, 0), (int) tbMed.getValueAt(j, 3));
            } else {
                PharMed += (tbMed.getValueAt(j, 0) + "\n");
            }
        }

        System.out.print(Rid);
        b.BillGenQuery(this);
    }

}
