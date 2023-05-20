/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra.objetos;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author lucia
 * Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
 */
public class Voto {
    private Alumno alumno;
    private ArrayList<Alumno> votados;

    public Voto() {
        this.votados=new ArrayList<>();
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public ArrayList<Alumno> getVotados() {
        return votados;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setVotados(ArrayList<Alumno> votados) {
        this.votados = votados;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.alumno);
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
        final Voto other = (Voto) obj;
        return true;
    }
    

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", votados=" + votados + '}';
    }
    
    
    
}
