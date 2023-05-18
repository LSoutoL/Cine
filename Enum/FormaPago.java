/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package EjerciciosExtra.Enum;

/**
 *
 * @author lucia
 */
public enum FormaPago {
    
    EFECTIVO ("Efectivo", 1), DEBITO ("Debito", 2), CREDITO ("Credito",3), TRANSFERENCIA ("Transferencia bancaria", 4), BITCOINS ("Bitcoins", 5);
    
    private String value;
    private int cod;

    private FormaPago(String value, int cod) {
        this.value = value;
        this.cod=cod;
    }

    @Override
    public String toString() {
        return "Forma de pago: " + value;
    }
    
    
    
}
