package JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchDataSQL {
	
	  public static void main(String[] args) {
	        // Database credentials
	        String dbURL = "jdbc:sqlserver://PRAKAASH\\PRKSH;databaseName=Opencart;integratedsecurity=true;encrypt=true;trustServerCertificate=true";
	        String user = "sa";
	        String password = "0990";
	        
	        // SQL Query
	        String query = "SELECT * FROM UserRegistration";
	        
	        // Establishing the connection and executing the query
	        try (Connection connection = DriverManager.getConnection(dbURL, user, password);
	             Statement statement = connection.createStatement();
	             ResultSet resultSet = statement.executeQuery(query)) {
	            
	            // Processing the result set
	            while (resultSet.next()) {
	                // Example: retrieving columns from the result set
	                int id = resultSet.getInt("id");
	                String name = resultSet.getString("UR_Name");
	                String fname=resultSet.getString("UR_Fname");
	                String lname=resultSet.getString("UR_lname");
	                String Email=resultSet.getString("UR_Email");
	                String Mobile=resultSet.getString("UR_Mobile");
	                String pwd=resultSet.getString("UR_Pwd");
	                // Print the result
	                System.out.println("ID: " + id + ", Name: " + name + " "+  "Fname : "+fname + " " 
	                +  "lname : " + lname +"email : " + Email +"Mobile : " + Mobile + "Password : "+  pwd);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
