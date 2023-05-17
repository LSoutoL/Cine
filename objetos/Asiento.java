/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra.objetos;

import EjerciciosExtra.Enum.Columna;

/**
 *
 * @author lucia
 */
public class Asiento {
    private Espectador espectador;
    private Columna columna;
    private Integer fila;

    public Asiento() {
    }

    public Asiento(Columna columna, Integer fila) {
        this.espectador = espectador;
        this.columna = columna;
        this.fila = fila;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public Columna getColumna() {
        return columna;
    }

    public Integer getFila() {
        return fila;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public void setColumna(Columna columna) {
        this.columna = columna;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    @Override
    public String toString() {
        String aux= "[X]";
        if (espectador==null){
            aux="[ ]";
        }
        return fila + "" + columna + " " + aux + " |";
    }
    
            
   
}
