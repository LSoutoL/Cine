/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra.Service;

import EjerciciosExtra.Enum.Cobertura;
import EjerciciosExtra.Enum.FormaPago;
import EjerciciosExtra.Enum.Tipo;
import EjerciciosExtra.objetos.Cliente;
import EjerciciosExtra.objetos.Cuota;
import EjerciciosExtra.objetos.Poliza;
import EjerciciosExtra.objetos.Vehiculo;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class ServicioAseguradora {
    private ArrayList<Cliente> clientes;
    //El HashMap es merito se Sabri y Ange.
    private HashMap<Integer, Poliza> polizas;
    private ArrayList<Vehiculo> vehiculos;
    private Scanner leer;

    public ServicioAseguradora() {
        this.clientes=new ArrayList<>();
        this.polizas=new HashMap<>();
        this.leer= new Scanner(System.in).useDelimiter("\n");
        this.vehiculos=new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
        
    public void crearClientes(){
        System.out.println("En esta seccion, podra cargar nuevos clientes.");
        String opcion;
        do{
            HashMap <Integer, Poliza> polizas_cliente = new HashMap<>();
            System.out.println("Ingrese el nombre del cliente");
            String nombre = leer.next();
            Cliente cliente = new Cliente(nombre);
            System.out.println("Ahora, le asignaremos una poliza de cobertura.");
            polizas_cliente=crearPoliza(cliente);
            cliente.setPolizas(polizas_cliente);
            clientes.add(cliente);
            System.out.println("Desea ingrear un nuevo cliente? s/n");
            opcion=leer.next();
        }while (opcion.equalsIgnoreCase("s"));        
    }
    
    public HashMap<Integer, Poliza> crearPoliza(Cliente cliente){
        System.out.println("En esta seccion podra crear nuevas polizas.");
        String opcion;
        HashMap< Integer, Poliza> poliza = new HashMap<>();
        do{
            System.out.println("Antes de crear una poliza, debera asignarle un vehiculo.");
            System.out.println("Seleccione: 1. Cargar nuevo vehiculo; 2. Asignar vechiculo ya cargado.");
            int op=leer.nextInt();
            Vehiculo vehiculo= new Vehiculo();
            switch (op){
            case 1: vehiculo = cargarVehiculo();
            break;
            case 2: System.out.println("Indique la marca, modelo y anio");
            String marca=leer.next();
            String modelo=leer.next();
            Integer anio=leer.nextInt();
                for (Vehiculo var : vehiculos) {
                    if ((marca.equalsIgnoreCase(var.getMarca())) && (modelo.equalsIgnoreCase(var.getModelo())) && (anio.equals(var.getAnio()))){
                        vehiculo=var;
                    }
                }
            break;
        }
            ArrayList<Cuota> cuotas = crearCuota();
            System.out.println("Indique la cobertura: 1. Tercero simple; 2. Tercero completo; 3. Todo riesgo");
            int aux = leer.nextInt();
            Poliza poli = new Poliza(vehiculo, cliente,Cobertura.values()[aux-1], cuotas);
            Integer cod = poli.hashCode();
            System.out.println(cod);
            polizas.put(cod, poli);
            poliza.put(cod, poli);
            System.out.println("Desea crear una nueva poliza? s/n");
            opcion=leer.next();
        }while (opcion.equalsIgnoreCase("s"));        
        return poliza;
    }
    
    public Vehiculo cargarVehiculo (){
        System.out.println("En esta seccion podra cargar nuevos vehiculos");
        System.out.println("Ingrese los datos de su vehiculo");
        System.out.println("Marca");
        String marca= leer.next();
        System.out.println("Modelo");
        String modelo = leer.next();
        System.out.println("Anio");
        Integer anio = leer.nextInt();
        System.out.println("TIPO: 1. SUV; 2. Hatchback; 3. Sedan; 4. 4x4");
        int aux = leer.nextInt();
        vehiculos.add(new Vehiculo(marca, modelo, anio, Tipo.values()[aux-1]));
        return new Vehiculo(marca, modelo, anio, Tipo.values()[aux]);
    }
    
    public ArrayList<Cuota> crearCuota(){
        ArrayList<Cuota> cuotas = new ArrayList<>();
        System.out.println("Indique la cantidad de cuotas en las que abonara");
        int cant = leer.nextInt();
        System.out.println("Indique el monto a abonar por cuota");
        Double monto=leer.nextDouble();
        Date hoy = new Date();
        int year=hoy.getYear();
        int date = hoy.getDay();
        int month=hoy.getDate();
        for (int i = 0; i < cant; i++) {
            month++;
            Date vence = new Date(year,month, date);
            cuotas.add(new Cuota(monto, vence));
        }      
        return cuotas; 
    }
    
    public void cargarPago(int cod){
        System.out.println("Indique el numero la cuota que desea pagar");
        int aux = leer.nextInt()-1;
        polizas.get(cod).getCuotas().get(aux).setPago(true);
        System.out.println("Indique la forma de pago: 1. Efectivo; 2. Debito; 3. Credito; 4. Transferencia bancaria; 5. Bitcoins");
        int aux2 = leer.nextInt();
        polizas.get(cod).getCuotas().get(aux).setFormaPago(FormaPago.values()[aux2-1]);
        }
    
    public void gestionCuotas(){
        System.out.println("Ingrese el numero de poliza:");
        int cod = leer.nextInt();
        int opcion;
        do{
            System.out.println("Indique la accion que desea realizar");
            System.out.println("1. Cargar un pago");
            System.out.println("2. Consultar coutas");
            System.out.println("3. Salir");
            opcion=leer.nextInt();
            switch (opcion){
                case 1: cargarPago(cod);
                break;
                case 2:
                    for (Cuota cuota : polizas.get(cod).getCuotas()) {
                        System.out.println("Cuota" + (polizas.get(cod).getCuotas().indexOf(cuota) +1) + " : " +cuota);
                    }
                break;
            }
        } while (opcion!=3);   
    }
}
