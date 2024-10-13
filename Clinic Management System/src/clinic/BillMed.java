/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;

/**
 *
 * @author Supun
 */
public class BillMed {

    String Billid;
    String Medname;
    int Amount;
    float Price;

    public BillMed() {
    }

    public String getBillid() {
        return Billid;
    }

    public void setBillid(String Billid) {
        this.Billid = Billid;
    }

    public String getMedname() {
        return Medname;
    }

    public void setMedname(String Medname) {
        this.Medname = Medname;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

}
