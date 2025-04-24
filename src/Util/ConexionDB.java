package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionDB {
    private static final String URL="jdbc:mysql://localhost:3306/ferreteria_bd";
    private static final String USER="root";
    private static final String PASSWORD="Alexander12";
    
    public static Connection getConnection() throws SQLException {
     try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         return DriverManager.getConnection(URL, USER, PASSWORD);
      }catch (ClassNotFoundException e){
       throw new SQLException("Driver de MYSQL no encontrado",e);
      }
    }


// Metodo tem´poral para probar 
public static void main(String[]args){
try{
    Connection c = getConnection();
    System.out.println("conexion exitosa a ferreteria_bd!");
    c.close();
  }catch (SQLException e){
      System.out.println("Error de conexion:" + e.getMessage());
  }
}

}