/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra.objetos;

import java.util.Objects;

/**
 *
 * @author lucia
 * El sistema de votación de Egg tiene una clase llamada Alumno con los 
 * siguientes atributos: nombre completo, DNI y cantidad de votos.
 */
public class Alumno {
    private String nombre;
    private Long DNI;
    private Integer votos;

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.votos=0;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getDNI() {
        return DNI;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(Long DNI) {
        this.DNI = DNI;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + (int) (this.DNI ^ (this.DNI >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.DNI, other.DNI)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "El alumno " + nombre + " (DNI " + DNI + ") recibio " + votos + " votos.";
    }
    
    
}
