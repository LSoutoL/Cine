/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtra;

import EjerciciosExtra.Service.Simulador;
import EjerciciosExtra.objetos.Alumno;
import EjerciciosExtra.objetos.Voto;
import java.util.ArrayList;

/**
 *
 * @author lucia
 */
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulador servicio = new Simulador ();
        ArrayList<Alumno> alumnos = servicio.alumnosList();
        servicio.mostrarAlumnos(alumnos);
        ArrayList<Voto> votacion = servicio.votacion(alumnos);
        servicio.mostrarVotaciones(alumnos, votacion);
        servicio.recuentoVotos(alumnos);
        servicio.facilitadores(alumnos);
    }
    
}
