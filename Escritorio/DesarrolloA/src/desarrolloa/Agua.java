/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrolloa;

/**
 *
 * @author alumno
 */
public class Agua extends Liquido{
    
    private Double pureza;

    public Agua(Double litros) {
        super(litros, "Incoloro");
        this.pureza = 1.0;
        
    }

    @Override
    public Liquido mezclar(Liquido mezcla) {
        Agua a = new Agua(mezcla.litros+this.litros);
        super.color = "Incoloro-"+mezcla.color;
        a.pureza = this.litros/mezcla.litros;
        if(mezcla instanceof Agua){
            a.pureza = 1.0;
        }
        return a;
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
