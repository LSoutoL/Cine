/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra.objetos;

import java.util.ArrayList;

/**
 *
 * @author lucia
 * 
 * Para asignar aisentos, usar random con el Integer para ala fila y uno con 
 * Integer que se convierta a String para la columna
 * 
 * Para dar valor a fila y columna, usar la matriz (i*j);
 */
public class Cine {
   private Asiento [][] sala;
   private Pelicula pelicula;
   private ArrayList <Espectador> espectadores;
   private Integer precio;

    public Cine() {
        this.sala = new Asiento [8][6];
        this.espectadores = new ArrayList<>();
    }

    public Cine(Asiento[][] sala, Pelicula pelicula, ArrayList<Espectador> espectadores, Integer precio) {
        this.sala = sala;
        this.pelicula = pelicula;
        this.espectadores = espectadores;
        this.precio = precio;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "sala=" + sala + ", pelicula=" + pelicula + ", espectadores=" + espectadores + ", precio=" + precio + '}';
    }
    
   
   
}
