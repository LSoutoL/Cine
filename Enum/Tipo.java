/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package EjerciciosExtra.Enum;

/**
 *
 * @author lucia
 */
public enum Tipo {
    
    SUV("SUV", 1), HB("Hatchback",2), SEDAN("Sedan",3), CUATRO("4x4", 4);
    
    public String value;
    public int cod;

    private Tipo(String value, int cod) {
        this.value = value;
        this.cod=cod;
    }

    @Override
    public String toString() {
        return value;
    }
    
    
    
}
