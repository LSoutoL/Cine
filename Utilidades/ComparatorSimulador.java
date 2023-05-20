/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra.Utilidades;

import EjerciciosExtra.objetos.Alumno;
import java.util.Comparator;

/**
 *
 * @author lucia
 */
public class ComparatorSimulador {
    public static Comparator <Alumno> votesAscendent = new Comparator <Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return o2.getVotos().compareTo(o1.getVotos());
        }
    };
}
