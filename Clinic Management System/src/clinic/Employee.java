/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;

import DataBase.EmployeeQuery;
import Gui.AdminWindow;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Supun
 */
public class Employee {

    int Id;
    String Fname;
    String Lname;
    String Address;
    String DOB;
    String Username;
    String Password;
    String Role;

    public Employee(int Id, String Role, String Fname, String Lname, String Address, String DOB, String Username, String Password) {
        this.Id = Id;
        this.Role = Role;
        this.Fname = Fname;
        this.Lname = Lname;
        this.Address = Address;
        this.DOB = DOB;
        this.Username = Username;
        this.Password = Password;
    }

    public Employee(int Id, String Fname, String Lname, String Address, String DOB) {
        this.Id = Id;
        this.Fname = Fname;
        this.Lname = Lname;
        this.Address = Address;
        this.DOB = DOB;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public Employee(int Id) {
        this.Id = Id;
    }

    public Employee() {
    }

    public String getRole() {
        return Role;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getAddress() {
        return Address;
    }

    public String getDOB() {
        return DOB;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void CreateEmployee(Employee emp) throws IOException {
        EmployeeQuery e = new EmployeeQuery();
        e.AddEmployeeQuery(emp);
    }

    public void ViewAccount(Employee emp) throws IOException, SQLException {
        EmployeeQuery e = new EmployeeQuery();
        e.GetAccountQuery(emp);
        //return x;

    }

    public void DropEmployeeAccount() throws IOException {
        System.out.print(Id);
        EmployeeQuery e = new EmployeeQuery();
        e.DropAccountQuery(Id);

    }

    public void Login(Employee e) {
        EmployeeQuery eq = new EmployeeQuery();
        eq.LoginQuery(e);
    }

    public void changeAccount(Employee e) {
        EmployeeQuery eq = new EmployeeQuery();
        eq.changeAccountQuery(e);
    }

    public void ViewUserInfro(Employee e) {
        EmployeeQuery eq = new EmployeeQuery();
        eq.ViewUserInfroQuery(e);
    }

    public void ChangeUserDeatials(Employee e) {
        EmployeeQuery eq = new EmployeeQuery();
        eq.ChangeUserDeatialsQuery(e);
    }

}
