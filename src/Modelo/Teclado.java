/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PROPIETARIO
 */
public class Teclado extends Perifericos{
    
    String CodTeclado;

    public Teclado() {
    }

    public Teclado(String CodTeclado) {
        this.CodTeclado = CodTeclado;
    }

    public Teclado(String CodTeclado, String marca, int precio) {
        super(marca, precio);
        this.CodTeclado = CodTeclado;
    }

    public String getCodTeclado() {
        return CodTeclado;
    }

    public void setCodTeclado(String CodTeclado) {
        this.CodTeclado = CodTeclado;
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
