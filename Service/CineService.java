/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra.Service;

import EjerciciosExtra.Enum.Columna;
import EjerciciosExtra.objetos.Asiento;
import EjerciciosExtra.objetos.Cine;
import EjerciciosExtra.objetos.Espectador;
import EjerciciosExtra.objetos.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucia
 * Crear sala;
 * Cargar espectadores;
 * Cargar película;
 * Mostrar matriz;
 */
public class CineService {
    private Cine cine;
    
    public void crearCine(){
        cine = new Cine();
        Asiento [][] sala = new Asiento [8][6];
        for (int i = 7; i >= 0; i--) {
            for (Integer j = 0; j <6 ; j++) {
             sala[i][j]=new Asiento(Columna.values()[j], i+1);
                //System.out.print(sala[i][j]);
            }
            //System.out.println("");
        }
        cine.setSala(sala);
        cine.setPelicula(cargarPelicula());
        cine.setPrecio(500);
    }
    public Pelicula cargarPelicula(){
        return new Pelicula("El Hobbit", 18, "Peter Jackson", 185);
    }
    public void cargarEspectadores(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Espectador> espectadores = new ArrayList<>();
        String opcion;
        do{
            System.out.println("Ingresar nombre");
            String name = leer.next();
            System.out.println("Ingresar edad");
            Integer age = leer.nextInt();
            System.out.println("Ingresar dinero disponible");
            Integer cash=leer.nextInt();
            espectadores.add(new Espectador(name, age, cash));
            System.out.println("Desea ingresar otre? s/n");
            opcion = leer.next();
        }while(opcion.equalsIgnoreCase("s"));
        cine.setEspectadores(espectadores);
        asignarAsiento();
    }
    public void mostrarSala(){
        //System.out.println("aqui comienza mostrar sala");
        //Asiento [][] sala = new Asiento [8][6];
        //sala=cine.getSala();
        for (int i = 7; i >=0; i--) {
            for (int j = 0; j < 6; j++) {
                System.out.print(cine.getSala()[i][j]);
            }
            System.out.println("");
        }
    }
    public void asignarAsiento(){
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                
            }
        }
 
    }
}
