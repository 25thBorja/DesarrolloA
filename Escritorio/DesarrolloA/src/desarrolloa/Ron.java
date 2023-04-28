/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrolloa;

/**
 *
 * @author alumno
 */
public class Ron extends Liquido implements Graduable{
    
    private Double grados;
    private final static Double MAX_GRADOS = 1.0;

    
    public Ron(Double litros, Double grados) {
        super(litros, "Ámbar");
        this.grados = grados;
        if(this.grados > MAX_GRADOS){
            this.grados = MAX_GRADOS;
        }
        
    }

    @Override
    public String toString() {
        return "Ron\n" + "grados = " + grados + "\ncantidad = " + super.litros;
    }

    @Override
    public Liquido mezclar(Liquido mezcla) {
        if(!(mezcla instanceof Ron) || !(mezcla instanceof Agua) || !(mezcla instanceof Agua) || !(mezcla instanceof Cola)){
            return null;
        }
        Ron r = new Ron(this.litros, this.grados);
        mezcla.litros += r.litros;
        mezcla.color += r.color;
        Copa c = new Copa(mezcla, r);
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
