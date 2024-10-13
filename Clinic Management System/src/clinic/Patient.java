/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;

import DataBase.PatientQuery;
import java.io.IOException;

/**
 *
 * @author Supun
 */
public class Patient {

    int Pid;
    String Name;
    String DOB;
    String Gender;
    String Address;
    String Email;
    String SpNotes;

    public Patient() {
    }

    public Patient(int Pid, String Name, String DOB, String Gender, String Address, String Email, String SpNotes) {
        this.Pid = Pid;
        this.Name = Name;
        this.DOB = DOB;
        this.Gender = Gender;
        this.Address = Address;
        this.Email = Email;
        this.SpNotes = SpNotes;
    }

    public Patient(String Name, String DOB, String Gender, String Address, String Email) {

        this.Name = Name;
        this.DOB = DOB;
        this.Gender = Gender;
        this.Address = Address;
        this.Email = Email;
    }

    Patient(Patient stu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int Pid) {
        this.Pid = Pid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSpNotes() {
        return SpNotes;
    }

    public void setSpNotes(String SpNotes) {
        this.SpNotes = SpNotes;
    }

    public void CreatePatientAccount(Patient stu) throws IOException {
        PatientQuery a = new PatientQuery();
        a.AddPatientQuery(stu);
    }

    public void DoctorViewPatient(String PresId, Patient pa) {
        PatientQuery pq = new PatientQuery();

        pq.DoctorViewPatientQuery(PresId, pa);
    }

    public void SaveSpecialNote(String SpecialNote, String PresId) {
        PatientQuery pq = new PatientQuery();
        pq.SendSpecialNote(SpecialNote, PresId);
    }
}
