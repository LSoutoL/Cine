/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtra;

import EjerciciosPracticos.Enum.Raza;
import EjerciciosPracticos.objetos.Perro;
import EjerciciosPracticos.objetos.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucia
 * Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro 
 * programa va a tener que contar con muchas personas y muchos perros. El 
 * programa deberá preguntarle a cada persona, que perro según su nombre, quiere 
 * adoptar. Dos personas no pueden adoptar al mismo perro, si la persona eligió 
 * un perro que ya estaba adoptado, se le debe informar a la persona.
 * Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar
 * todas las personas con sus respectivos perros.
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList <Perro> p = new ArrayList<>();
        p.add(new Perro("Pepa",Raza.COQUER , 5, 50));
        p.add(new Perro("Baloo", Raza.LABRADOR, 1, 140));
        p.add(new Perro("pepito", Raza.PITBULL, 3, 70));
        ArrayList <Persona> ps = new ArrayList<>();
        ps.add(new Persona("Lucia", "Souto", 32, 35866027, null));
        ps.add(new Persona("Lautaro", "Valenzuela", 33, 35159044, null));
        ps.add(new Persona("Mer", "Souto", 30, 36547677, null));
        for (Persona p2 : ps) {
            System.out.println(p2.getNombre() + ", por favor indique cual mascota desea adoptar:");
            for (Perro p1 : p) {
                System.out.println(p1.getNombre()); 
            }
            String nombre = leer.next();
            do{
            for (Perro p1 : p) {
               if ((p1.getNombre().equals(nombre)) && (p1.getDuenio()==null)){
                   p1.setDuenio(p2);
                   p2.setMascota(p1);
               }
            }
            if (p2.getMascota()==null){
                System.out.println("Lo siento, esa mascota fue adoptada. Intente nuevamente:");
                nombre=leer.next();
            }
            } while (p2.getMascota()==null);
        }
        for (Persona p1 : ps) {
            System.out.println(p1);
        }
        
    }
    
}
