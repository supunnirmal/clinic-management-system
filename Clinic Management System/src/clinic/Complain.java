/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;

import DataBase.ComplainQuery;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Supun
 */
public class Complain {

    int Comid;
    String Date;
    String ComDescription;
    int Billid;
    String DocFname;
    String DocLname;
    String ResFname;
    String ResLname;

    public Complain() {
    }

    public String getDocFname() {
        return DocFname;
    }

    public void setDocFname(String DocFname) {
        this.DocFname = DocFname;
    }

    public String getDocLname() {
        return DocLname;
    }

    public void setDocLname(String DocLname) {
        this.DocLname = DocLname;
    }

    public String getResFname() {
        return ResFname;
    }

    public void setResFname(String ResFname) {
        this.ResFname = ResFname;
    }

    public String getResLname() {
        return ResLname;
    }

    public void setResLname(String ResLname) {
        this.ResLname = ResLname;
    }

    public int getComid() {
        return Comid;
    }

    public void setComid(int Comid) {
        this.Comid = Comid;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getComDescription() {
        return ComDescription;
    }

    public void setComDescription(String ComDescription) {
        this.ComDescription = ComDescription;
    }

    public int getBillid() {
        return Billid;
    }

    public void setBillid(int Billid) {
        this.Billid = Billid;
    }

    public void AddComplain(Complain c) throws IOException {
        ComplainQuery com = new ComplainQuery();
        com.AddComplaitQuery(c);
    }

    public void SetDetails(Complain c) throws SQLException {
        ComplainQuery com = new ComplainQuery();
        com.FindDocResQuary(c);

    }
}
