/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;

import DataBase.DBConnManager;
import Gui.Welcome;
import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Supun
 */
public class Clinic {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        
        Welcome w = new Welcome();
        w.setVisible(true);
    }

}
