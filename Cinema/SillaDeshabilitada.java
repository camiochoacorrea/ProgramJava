/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinema;

/**
 *
 * @author Maria Camila Ochoa C
 */
public class SillaDeshabilitada extends Silla {
    
    public SillaDeshabilitada(int noSilla, String imagen, Estado estado) {
        super(noSilla, imagen, estado);
    }

    @Override
    public double calcularPrecio(int dia) {
        return -1; 
        
    }
    
    
}
