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
public class Copa extends Liquido implements Graduable{

    private Graduable alcohol;
    private Liquido mezcla;
    
    public Copa(Liquido mezcla, Graduable alcohol) {
        super(mezcla.litros, mezcla.color);
        this.alcohol = alcohol;       
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

    @Override
    public Double getGrados() {
        Double litrosAlcohol = mezcla.litros-super.litros;
        Double grados = alcohol.getGrados()*(litrosAlcohol/mezcla.litros);
        return grados;
    }

    @Override
    public String toString() {
        return "Copa{" + "alcohol=" + alcohol + ", mezcla=" + mezcla + '}';
    }

    public Graduable getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Graduable alcohol) {
        this.alcohol = alcohol;
    }

    public Liquido getMezcla() {
        return mezcla;
    }

    public void setMezcla(Liquido mezcla) {
        this.mezcla = mezcla;
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
    
    
    
}
