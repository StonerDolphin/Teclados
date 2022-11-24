/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

public class Validacion {
    
    public boolean validaVacio(String texto)
    {
        return !texto.isEmpty();
    }
    public boolean validaVacio2(String texto)
    {
        if (texto.length()==0) {
            return false;
        }else
        {
            return true;
        }
    }
    public boolean validaInt(String texto)
    {
        try
        {
            Integer.parseInt(texto);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public boolean validaCombo(String texto)
    {
        if (texto.equals("Seleccionar")) {
            return false;
        }else
        {
            return true;
        }
    }
    
}
