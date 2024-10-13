/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;

import DataBase.EmployeeQuery;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Supun
 */
public class Doctor extends Employee {

    String Specialization;
    float ChnFee;
    String Wplace;

    public Doctor(int Id) {
        super(Id);
    }

    public Doctor(int Id, String Role, String Fname, String Lname, String Address, String DOB, String Username, String Password) {
        super(Id);
        this.Specialization = Specialization;
        this.ChnFee = ChnFee;
        this.Wplace = Wplace;
    }

    public Doctor(String Specialization, float ChnFee, String Wplace, int Id, String Role, String Fname, String Lname, String Address, String DOB, String Username, String Password) {
        super(Id, Role, Fname, Lname, Address, DOB, Username, Password);
        this.Specialization = Specialization;
        this.ChnFee = ChnFee;
        this.Wplace = Wplace;
    }

    public Doctor(int Id, String Fname, String Lname, String DOB, String Address, String Specialization, String WPlace, float ChnFee) {
        super(Id, Fname, Lname, Address, DOB);
        this.Specialization = Specialization;
        this.ChnFee = ChnFee;
        this.Wplace = WPlace;
    }

    public Doctor() {
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public float getChnFee() {
        return ChnFee;
    }

    public void setChnFee(float ChnFee) {
        this.ChnFee = ChnFee;
    }

    public String getWplace() {
        return Wplace;
    }

    public void setWplace(String Wplace) {
        this.Wplace = Wplace;
    }

    public void CreateEmployee(Doctor doc) throws IOException {
        super.CreateEmployee(doc);
        EmployeeQuery e = new EmployeeQuery();
        e.AddDoctorQuery(doc);
    }

    public void ViewAccount(Doctor doc) throws IOException, SQLException {
        System.out.print(doc.getId());
        EmployeeQuery e = new EmployeeQuery();
        e.GetDocAccountQuery(doc);
    }

    public void changeAccount(Doctor d) {
        EmployeeQuery eq = new EmployeeQuery();
        eq.changeAccountQuery(d);
    }

}
