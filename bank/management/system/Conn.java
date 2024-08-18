
package bank.management.system;

import java.sql.*;

public class Conn {
    
     Connection c;
     Statement s;
     Conn(){
        try{
            //Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_management_system","Bank","Samatha@123");
            s=c.createStatement();
            
        }catch (Exception e){
            System.out.println(e);
        }
     }
}