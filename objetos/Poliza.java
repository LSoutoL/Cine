/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra.objetos;

import EjerciciosExtra.Enum.Cobertura;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author lucia
 * Se registrará una póliza, donde se guardará los datos tanto de un vehículo, 
 * como los datos de un solo cliente. Los datos incluidos en ella son: número de
 * póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago,
 * monto total segurado, incluye granizo, monto máximo granizo, tipo de cobertura 
 * (total, contra terceros, etc.).
 */
public class Poliza {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private long num;
    private Cobertura cobertura;
    private Date inicio;
    private Date fin;
    private ArrayList<Cuota> cuotas;
    private Double monto;
    private boolean granizo;

    public Poliza() {
    }

    public Poliza(Vehiculo vehiculo, Cliente cliente, long num, Cobertura cobertura, Date inicio, Date fin, ArrayList<Cuota> cuotas, Double monto, boolean granizo) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.num = num;
        this.cobertura = cobertura;
        this.inicio = inicio;
        this.fin = fin;
        this.cuotas = cuotas;
        this.monto = monto;
        this.granizo = granizo;
    }

    public Poliza(Vehiculo vehiculo, Cliente cliente, Cobertura cobertura, ArrayList<Cuota> cuotas) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.cobertura = cobertura;
        this.cuotas = cuotas;
    }
    

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public long getNum() {
        return num;
    }

    public Cobertura getCobertura() {
        return cobertura;
    }

    public Date getInicio() {
        return inicio;
    }

    public Date getFin() {
        return fin;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public Double getMonto() {
        return monto;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public String toString() {
        return "Poliza{" + "vehiculo=" + vehiculo + ", cliente=" + cliente + ", num=" + num + ", cobertura=" + cobertura + ", inicio=" + inicio + ", fin=" + fin + ", cuotas=" + cuotas + ", monto=" + monto + ", granizo=" + granizo + '}';
    }
    
    
}
