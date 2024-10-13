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
public class Receptionist extends Employee {

    public Receptionist(int Id, String Role, String Fname, String Lname, String Address, String DOB, String Username, String Password) {
        super(Id, Role, Fname, Lname, Address, DOB, Username, Password);
    }

}
