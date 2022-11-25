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
            ps.setString(2,teclado.getMarca());
            ps.setInt(3,teclado.getPrecio());
            
            ps.executeUpdate();
            ps.close();
            cn.close();
           
            return true;
        } catch (Exception e) {
            
            System.out.println("Error al agregar teclado - "+ e.getMessage());
        }
        return false;
    }
    
     public boolean agregarMouse(Mouses mouse){
        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            String query = "INSERT INTO mouse (cod_mou,marca_mou,precio_mou)"
                    + "VALUES (?,?,?)";
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            ps.setString(1,mouse.getCodMouse());
            ps.setString(2,mouse.getMarca());
            ps.setInt(3,mouse.getPrecio());
            
            ps.executeUpdate();
            ps.close();
            cn.close();
           
            return true;
        } catch (Exception e) {
            
            System.out.println("Error al agregar mouse - "+ e.getMessage());
        }
        return false;
    }
    
}
