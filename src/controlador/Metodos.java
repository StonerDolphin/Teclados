/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bd.Conexion;
import Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Metodos {
    
    public boolean agregarTeclado(Teclado teclado){
        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            String query = "INSERT INTO teclado (cod_tec,marca_tec,precio_tec)"
                    + "VALUES (?,?,?)";
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            ps.setString(1,teclado.getCodTeclado());
            ps.setString(2,teclado.());
            ps.setString(3,teclado.getCodTeclado());
            
            
            
            return true;
        } catch (Exception e) {
        }
        return false;
    }
    
}
