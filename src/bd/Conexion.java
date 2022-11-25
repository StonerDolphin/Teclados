/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author trivi
 */
public class Conexion {
    
        Connection conexion = null;
    public Connection conectar(){Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/perifactori","root","");
            System.out.println("Conexión exitosa");
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            
        } return conexion;
    }
}
