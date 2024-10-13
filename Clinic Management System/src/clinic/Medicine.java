/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;

import DataBase.MedicineQuery;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Supun
 */
public class Medicine {

    String Medname;
    int Quantity;
    float Price;
    String MedDescription;

    public Medicine() {
    }

    public Medicine(String MedDescription) {
        this.MedDescription = MedDescription;
    }

    public String getMedname() {
        return Medname;
    }

    public void setMedname(String Medname) {
        this.Medname = Medname;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public String getMedDescription() {
        return MedDescription;
    }

    public void setMedDescription(String MedDescription) {
        this.MedDescription = MedDescription;
    }

    public void ViewMedicine(Medicine m) throws SQLException {
        MedicineQuery med = new MedicineQuery();
        med.FindMedQuery(m);
    }

    public void UpdateMedicine(Medicine m) throws IOException {
        MedicineQuery med = new MedicineQuery();
        med.EditMedicineQuery(m);

    }

    public void AddMedicine(Medicine m) throws IOException {
        MedicineQuery med = new MedicineQuery();
        med.AddMedicineQuery(m);

    }

    public void DeleteMedicine(Medicine m) throws IOException {
        MedicineQuery med = new MedicineQuery();
        med.DeleteMedicineQuery(m);

    }

    public void FillSearchBox(javax.swing.JComboBox<String> cmbMedicine) {
        MedicineQuery medq = new MedicineQuery();
        medq.FillCmbMedicine(cmbMedicine);
    }

    public void UpdateQuantity(String Medname, int Quantity) throws IOException {
        MedicineQuery medq = new MedicineQuery();
        medq.UpdateQuantityQuery(Medname, Quantity);
    }

    public Vector<Vector<String>> getMedQuantity() {
        Vector<Vector<String>> med;
        MedicineQuery medq = new MedicineQuery();
        med = medq.getQuantityQuary();
        return med;
    }

    public void RefillQuantity(Medicine med) throws IOException {
        MedicineQuery medq = new MedicineQuery();
        medq.RefillQuantityQuery(med);
    }

}
