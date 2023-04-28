/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrolloa;

/**
 *
 * @author alumno
 */
public abstract class Liquido {
    
    protected Double litros;
    protected String color;

    public Liquido(Double litros, String color) {
        this.litros = litros;
        this.color = color;
    }
    
    public void incrementar(Double cantidad){
        litros += cantidad;
    }
    
    public abstract Liquido mezclar(Liquido mezcla);
}
