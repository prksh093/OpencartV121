package JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcConn {
	
    public static void main(String[] args) {
        String conn="jdbc:sqlserver://PRAKAASH\\PRKSH;databaseName=Opencart;integratedsecurity=true;encrypt=true;trustServerCertificate=true";
        String Username ="sa";
        String Password ="0990";
        
        
        String query = "SELECT * FROM UserRegistration";
        try{
            Connection cn= DriverManager.getConnection(conn,Username,Password);
            
                    if(cn!=null){
                        System.out.println("connected");
                    }
        }catch(SQLException e){
            e.printStackTrace();
}}
}
