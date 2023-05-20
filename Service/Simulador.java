/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra.Service;

import EjerciciosExtra.Utilidades.ComparatorSimulador;
import EjerciciosExtra.objetos.Alumno;
import EjerciciosExtra.objetos.Voto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author lucia
 *  
 *
 */
public class Simulador {
    
    /*La clase Simulador debe tener un método que genere un listado de alumnos manera
 aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser 
 generadas de manera aleatoria. Nota: usar listas de tipo String para generar 
 los nombres y los apellidos.*/
    public String nombres (){
        String [] nombres = {"Lucia", "Lautaro", "Marcos", "Maria", "Camila", "Jose", "Martin", "Agustina"};
        String [] apellidos = {" Souto", " Valenzuela", " Rojo", " Perez", " Gonzalez", " Gomez", " Latapie", " Guerrero"};
        String nomb = nombres [(int) (Math.round(Math.random()*7))];
        String apellido = apellidos [(int) (Math.round(Math.random()*7))];
        return  nomb.concat(apellido);
    }
    
   /* • Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
debe retornar la lista de dnis.*/
    
    public ArrayList<Long> DNIList (Alumno alumno, int i){
    ArrayList<Long> listDNI = new ArrayList<>();
        for (int j = 0; j < 64; j++) {
        Long DNI = (long) (Math.round(Math.random()*50000000));
        if (j>0){
            for (Long long1 : listDNI) {
              if (long1.equals(DNI)){
              DNI = (long) (Math.round(Math.random()*50000000));   
              }  
            }
        }
        listDNI.add(DNI);
        }
    alumno.setDNI(listDNI.get(i));
    return listDNI;
    }
    
    /*Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de
objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis de las dos
listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si con el
mismo nombre.*/
    
      public ArrayList<Alumno> alumnosList(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumno> alumnos = new ArrayList<>();
        int i=0;
        System.out.println("Indique la cantidad de alumnos que desea cargar (no puede ser menor a 10)");
        int cant = leer.nextInt();
        System.out.println("Cargando alumnos...");
        do {
         Alumno alumno = new Alumno(nombres());
         DNIList(alumno, i);
         alumnos.add(alumno);
         i++;
        } while (alumnos.size()<10 || alumnos.size()<cant);
    return alumnos;
    }
    
    /*Se debe imprimir por pantalla el listado de alumnos.*/
    public void mostrarAlumnos(ArrayList<Alumno> alumnos){
        System.out.println("ALUMNOS:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre() + " DNI: " + alumno.getDNI());
        }
        System.out.println("");
    }
    
    /*Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
para cada alumno genera tres votos de manera aleatoria. En este método debemos
guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
mismo alumno. Utilizar un hashset para resolver esto.*/
    
    public ArrayList<Voto> votacion (ArrayList<Alumno> alumnos){
        ArrayList <Voto> votacion = new ArrayList();
        for (Alumno alumno : alumnos) {
            Voto voto = new Voto();
            voto.setAlumno(alumno);
            HashSet<Alumno> alumnosHash = new HashSet();
            alumnosHash.add(alumno);
                while (alumnosHash.size()<4){
                      Alumno aux= alumnos.get((int) Math.round(Math.random()*(alumnos.size()-1)));
                      alumnosHash.add(aux);
                    }
                alumnosHash.remove(alumno);
                voto.getVotados().addAll(alumnosHash);
                for (Alumno alumno1 : alumnosHash) {
                alumno1.setVotos(alumno1.getVotos()+1);
            }  
            votacion.add(voto);
            }
        return votacion;
    }
    
    /*Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales
fueron sus 3 votos.*/
    
    public void mostrarVotaciones(ArrayList<Alumno> alumnos, ArrayList<Voto> votacion){
        System.out.println("VOTACIONES:");
        for (Alumno alumno : alumnos) {
            System.out.print(alumno);
            System.out.print(" Por su parte, ha votado a: ");
            System.out.println("");
            for (Voto voto : votacion) {
               if (voto.getAlumno().hashCode()==alumno.hashCode()){
                   for (Alumno votado : voto.getVotados()) {
                       System.out.println(votado.getNombre());
                   }
               } 
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    /*Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y
comienza a hacer el recuento de votos.*/
    
    public void recuentoVotos(ArrayList<Alumno> alumnos){
        Collections.sort(alumnos, ComparatorSimulador.votesAscendent);
        System.out.println("RECUENTO DE VOTOS:");
        int recuento=0;
        for (Alumno alumno : alumnos) {
            recuento+=alumno.getVotos();
            System.out.println(alumno.getNombre() + ": " + alumno.getVotos());
        }
        System.out.println("");
        System.out.println("VOTOS TOTALES: " + recuento);
        System.out.println("");
    }
    
    /*Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5
facilitadores suplentes con los 5 segundos alumnos más votados. A continuación, mostrar
los 5 facilitadores y los 5 facilitadores suplentes.*/
     public void facilitadores(ArrayList<Alumno> alumnos){
         Alumno[] facilitadores = new Alumno[5];
         Alumno [] suplentes = new Alumno[5];
         System.out.println("FACILITADORES:");
         for (int i = 0; i < 5; i++) {
             facilitadores[i]=alumnos.get(i);
             System.out.println(facilitadores[i].getNombre());
         }
         System.out.println("");
         System.out.println("SUPLENTES:");
         for (int i = 0; i < 5; i++) {
             suplentes[i]=alumnos.get(i+5);
             System.out.println(suplentes[i].getNombre());
         }  
     }
    
}
