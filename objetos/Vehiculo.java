/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra.objetos;

import EjerciciosExtra.Enum.Tipo;

/**
 *
 * @author lucia
 * vehículos. Se registra la información de cada vehículo asegurado. Marca,
 * modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private Integer anio;
    private long motor;
    private long chasis;
    private String color;
    private Tipo tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Integer anio, long motor, long chasis, String color, Tipo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.motor = motor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public Vehiculo(String marca, String modelo, Integer anio, Tipo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
    }
    

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public long getMotor() {
        return motor;
    }

    public long getChasis() {
        return chasis;
    }

    public String getColor() {
        return color;
    }

    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", motor=" + motor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + '}';
    }    
}
