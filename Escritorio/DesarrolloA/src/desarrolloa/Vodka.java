/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrolloa;

/**
 *
 * @author alumno
 */
public class Vodka extends Liquido implements Graduable{
    
    private Double grados;
    private final static Double MAX_GRADOS = 1.0;

    public Vodka(Double litros, Double grados) {
        super(litros, "Incoloro");
        this.grados = grados;
        if(this.grados > MAX_GRADOS){
            this.grados = MAX_GRADOS;
        }
    }

    @Override
    public Liquido mezclar(Liquido mezcla) {
        if(!(mezcla instanceof Ron) || !(mezcla instanceof Agua) || !(mezcla instanceof Vodka) || !(mezcla instanceof Cola)){
            return null;
        }
        Vodka v = new Vodka(this.litros, this.grados);
        mezcla.litros += v.litros;
        mezcla.color += v.color;
        Copa c = new Copa(mezcla, v);
        return c;
    }

    @Override
    public Double getGrados() {
        return grados;
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
