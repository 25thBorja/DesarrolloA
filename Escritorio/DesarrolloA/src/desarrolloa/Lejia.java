/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrolloa;

/**
 *
 * @author alumno
 */
public class Lejia extends Liquido{
    
    private Double pureza;

    public Lejia(Double litros) {
        super(litros, "Incoloro");
        this.pureza = 1.0;
        
    }

    @Override
    public Liquido mezclar(Liquido mezcla) {
        Lejia l = new Lejia(mezcla.litros+this.litros);
        super.color = "Incoloro-"+mezcla.color;
        l.pureza = this.litros/mezcla.litros;
        if(mezcla instanceof Lejia){
            l.pureza = 1.0;
        }
        return l;
    }

    public Double getPureza() {
        return pureza;
    }

    public void setPureza(Double pureza) {
        this.pureza = pureza;
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
