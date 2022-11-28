/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bd.Conexion;
import Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Vista.*;

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
     
     public boolean actualizarTeclado(Teclado teclado){
        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            String query = "UPDATE  teclado SET marca_tec = ? ,precio_tec = ?)"
                    + "WHERE  cod_tec = ?";
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            ps.setString(1,teclado.getCodTeclado());
            ps.setString(2,teclado.getMarca());
            ps.setInt(3,teclado.getPrecio());
            
            ps.executeUpdate();
            ps.close();
            cn.close();
           
            return true;
        } catch (Exception e) {
            
            System.out.println("Error al actualizar teclado - "+ e.getMessage());
        }
        return false;
    }
     
     public boolean actualizarMouse(Mouses mouse){
        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            String query = "UPDATE mouse SET marca_mou = ? ,precio_mou = ?)"
                    + "WHERE  cod_mou = ?";
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            ps.setString(1,mouse.getCodMouse());
            ps.setString(2,mouse.getMarca());
            ps.setInt(3,mouse.getPrecio());
            
            ps.executeUpdate();
            ps.close();
            cn.close();
           
            return true;
        } catch (Exception e) {
            
            System.out.println("Error al actualizar mouse - "+ e.getMessage());
        }
        return false;
    }
     
     
     
     public boolean eliminarTeclado(String codigo){
        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            String query = "DELETE FROM teclado WHERE cod_tec = ?";
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            ps.setString(1,codigo);
            
            ps.executeUpdate();
            ps.close();
            cn.close();
           
            return true;
        } catch (Exception e) {
            
            System.out.println("Error al eliminar teclado - "+ e.getMessage());
        }
        return false;
    }
     
      public boolean eliminarMouse(String codigo){
          
        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            String query = "DELETE FROM mouse WHERE cod_mou = ?";
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            ps.setString(1,codigo);
            
            ps.executeUpdate();
            ps.close();
            cn.close();
           
            return true;
        } catch (Exception e) {     
            
            System.out.println("Error al eliminar mouse - "+ e.getMessage());
        }
        return false;
    }
      
       public Teclado buscarTeclado(String codigo){
           
           Teclado teclado = new Teclado();
        try 
        {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            String query = "SELECT cod_tec, marca_tec,precio_tec FROM teclado WHERE cod_tec = ?";
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            ps.setString(1,codigo);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) 
            {
                teclado.setCodTeclado(rs.getString("cod_tec"));
                teclado.setMarca(rs.getString("marca_tec"));
                teclado.setPrecio(rs.getInt("precio_tec"));
            }
            ps.close();
            cn.close();
            rs.close();
        } catch (Exception e) {
            System.out.println("Error al buscar teclado - "+ e.getMessage());
        }
        return teclado;
    }
       
       public Mouses buscarMouse(String codigo){
           
           Mouses mouse = new Mouses();
        try 
        {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            String query = "SELECT cod_mou, marca_mou, precio_mou FROM mouse WHERE cod_mou = ?";
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            ps.setString(1,codigo);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) 
            {
                mouse.setCodMouse(rs.getString("cod_mou"));
                mouse.setMarca(rs.getString("marca_mou"));
                mouse.setPrecio(rs.getInt("precio_mou"));
            }
            ps.close();
            cn.close();
            rs.close();
        } catch (Exception e) {
            System.out.println("Error al buscar mouse - "+ e.getMessage());
        }
        return mouse;
    }
       
       public ArrayList<Teclado> mostrarTeclado() {
        ArrayList<Teclado> listaTeclados=new ArrayList<Teclado>();
        
        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();

            String query = "SELECT cod_tec, marca_tec, precio_tec FROM teclado";
            PreparedStatement ps = cn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Teclado teclado = new Teclado();
                teclado.setCodTeclado(rs.getString("cod_tec"));
                teclado.setMarca(rs.getString("marca_tec"));
                teclado.setPrecio(rs.getInt("precio_tec"));

                listaTeclados.add(teclado);
            }
            ps.close();
            cn.close();
            rs.close();
        }  catch (Exception e) {
            System.out.println("Error en Consultar Teclados - " + e.getMessage());
        }
        return listaTeclados;
    }
       
       public ArrayList<Mouses> mostrarMouse() {
        ArrayList<Mouses> listaMouses =new ArrayList<Mouses>();
        
        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();

            String query = "SELECT cod_mou, marca_mou, precio_mou FROM mouse";
            PreparedStatement ps = cn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mouses mouse = new Mouses();
                mouse.setCodMouse(rs.getString("cod_mou"));
                mouse.setMarca(rs.getString("marca_mou"));
                mouse.setPrecio(rs.getInt("precio_mou"));

                listaMouses.add(mouse);
            }
            ps.close();
            cn.close();
            rs.close();
        } catch (Exception e) {
            System.out.println("Error en Consultar mouses - " + e.getMessage());
        }
        return listaMouses;
    }      
}
