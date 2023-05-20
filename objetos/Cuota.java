/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra.objetos;

import EjerciciosExtra.Enum.FormaPago;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author lucia
 * Se registrarán y podrán consultar las cuotas generadas en cada póliza.
 * Esas cuotas van a contener la siguiente información: número de cuota, monto 
 * total de la cuota, si está o no pagada, fecha de vencimiento, forma de pago 
 * (efectivo, transferencia,etc.).
 */
public class Cuota {
    //private Integer num; Accedo desde el indice del ArrayList
    private Double monto;
    private boolean pago;
    private Date vence;
    private FormaPago formaPago;

    public Cuota() {
    }

    public Cuota(Double monto, boolean pago, Date vence, FormaPago formaPago) {
        this.monto = monto;
        this.pago = pago;
        this.vence = vence;
        this.formaPago = formaPago;
    }

    public Cuota(Double monto, Date vence) {
        this.monto = monto;
        this.vence = vence;
        this.pago=false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuota other = (Cuota) obj;
        if (!Objects.equals(this.monto, other.monto)) {
            return false;
        }
        return Objects.equals(this.vence, other.vence);
    }
    

    public Double getMonto() {
        return monto;
    }

    public boolean isPago() {
        return pago;
    }

    public Date getVence() {
        return vence;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public void setVence(Date vence) {
        this.vence = vence;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        String pag;
        if (pago==true){
            pag="pagado";
        } else pag="pendiente";
        String forma;
        if (formaPago==null){
            forma="pendiente";
        } else forma=formaPago.name();
        return "monto= " + monto + ", pago= " + pag + ", vence= " + vence + ", Forma de pago= " + forma + '}';
    }
     
    
}
