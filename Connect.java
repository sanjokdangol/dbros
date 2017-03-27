
package store;

import java.sql.*;
public class Connect {
    
Connection con = null;
String url = "jdbc:mysql://localhost:3306/sales";
String username = "root";
String password = "";

Connect(){
    try{
        con = DriverManager.getConnection(url, username, password);
        
        System.out.println("Database connected!");
    } catch (SQLException e) {
        throw new IllegalStateException("Cannot connect the database!", e);
    }
}

    public Connection getConnect(){
       return con;
    }
    public void closeConnection(){
        try{
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    
}

