/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package EjerciciosExtra.Enum;

/**
 *
 * @author lucia
 */
public enum Cobertura {
    TERCEROS_SIMPLE ("Tercero simple", 1), TERCEROS_COMPLETO ("Tercero completo", 2), TODO_RIESGO ("Todo riesgo", 3);
    
    public String value;
    public int cod;

    private Cobertura(String value, int cod) {
        this.value = value;
        this.cod=cod;
    }

    @Override
    public String toString() {
        return value;
    }
    
}
