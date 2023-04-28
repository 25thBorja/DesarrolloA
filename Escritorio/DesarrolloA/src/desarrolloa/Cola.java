/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrolloa;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Cola extends Liquido{

    private boolean cafeina;

    public Cola(Double litros) {
        super(litros, "Marrón");
        this.cafeina = true;
    }
    
    @Override
    public Liquido mezclar(Liquido mezcla) {        
        try {
            throw new NoSePuedeMezclarException("No se puede mezclar");
        } catch (NoSePuedeMezclarException ex) {
            Logger.getLogger(Copa.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return null; 
    }

    public boolean isCafeina() {
        return cafeina;
    }

    public void setCafeina(boolean cafeina) {
        this.cafeina = cafeina;
    }

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cola{" + "cafeina=" + cafeina + '}';
    }
    
    
    
}
