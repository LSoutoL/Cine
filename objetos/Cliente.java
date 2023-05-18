/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra.objetos;

import java.util.ArrayList;

/**
 *
 * @author lucia
 * Nombre y apellido, documento, mail, domicilio, teléfono.
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private long DNI;
    private String mail;
    private String domicilio;
    private long tel;
    private ArrayList<Poliza> polizas;

    public Cliente() {
        this.polizas=new ArrayList<>();
    }

    public Cliente(String nombre, String apellido, long DNI, String mail, String domicilio, long tel, ArrayList<Poliza> polizas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.mail = mail;
        this.domicilio = domicilio;
        this.tel = tel;
        this.polizas = polizas;
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Poliza> getPolizas() {
        return polizas;
    }

    public void setPolizas(ArrayList<Poliza> polizas) {
        this.polizas = polizas;
    }

    @Override
    public String toString() {
        return "Cliente:" + "nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", polizas=" + polizas + '}';
    }

}
