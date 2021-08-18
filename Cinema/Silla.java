/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinema;

import java.util.Calendar;

/**
 *
 * @author Maria Camila Ochoa C
 */
public class Silla implements cobro{
    private int noSilla;
    private String imagen;
    private Estado estado;
//  

    public Silla(int noSilla, String imagen, Estado estado) {
        this.noSilla = noSilla;
        this.imagen = imagen;
        this.estado = estado;
    }

    public int getNoSilla() {
        return noSilla;
    }

    public String getImagen() {
        return imagen;
    }

    public Estado getEstado() {
        return estado;
    }

public void cambiarEstado (Estado estadoNuevo){
    this.estado= estadoNuevo; 
    
}

    @Override
    public double calcularPrecio(int dia) {
        
//        boolean estaEnSemana= dia >= Calendar.MONDAY && dia<= Calendar.FRIDAY;
//        esta es otra forma de hacerlo
        
        if(diaEnSemana(dia)){
           return 5000; 
        }
    return 7000;
        
      
    }
    
    public boolean diaEnSemana(int dia){
       
        return dia >= Calendar.MONDAY && dia<= Calendar.FRIDAY;
        
    }

    @Override
    public String toString() {
        return "Silla #"+ this.noSilla;
    }
    
    
    
    
}
