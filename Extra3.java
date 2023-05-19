/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtra;

import EjerciciosExtra.Service.ServicioAseguradora;
import EjerciciosExtra.objetos.Cliente;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioAseguradora service = new ServicioAseguradora();
        int opcion;
        do {
        System.out.println("Indique la accion que desea llevar a cabo");
        System.out.println("1. Gestion de Clientes");
        System.out.println("2. Gestion de Polizas");
        System.out.println("3. Gestion de Vehiculos");
        System.out.println("4. Gestion de cuotas");
        System.out.println("5. Salir");
        opcion = leer.nextInt();
        switch (opcion){
            case 1: service.crearClientes();
            break;
            case 2: System.out.println("Indique el nombre del cliente vinculado a la poliza (existente o a ser creada)");
                String nombre =leer.next();
                for (Cliente cliente: service.getClientes()) {
                    if (nombre.equalsIgnoreCase(cliente.getNombre())){
                   service.crearPoliza(cliente);
                    }
                }
            break;
            case 3: service.cargarVehiculo();
            break;
            case 4: service.gestionCuotas();
            break;               
            }
        } while (opcion!=5);
    }
}
