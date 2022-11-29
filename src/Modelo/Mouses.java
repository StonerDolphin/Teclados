/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PROPIETARIO
 */
public class Mouses extends Perifericos{
    
    String CodMouse;

    public Mouses(String CodMouse) {
        this.CodMouse = CodMouse;
    }

    public Mouses(String CodMouse, String marca, int precio) {
        super(marca, precio);
        this.CodMouse = CodMouse;
    }

    public Mouses() {
        
    }

    public String getCodMouse() {
        return CodMouse;
    }

    public void setCodMouse(String CodMouse) {
        this.CodMouse = CodMouse;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
