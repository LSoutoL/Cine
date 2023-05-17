/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtra;

import EjerciciosExtra.Service.CineService;

/**
 *
 * @author lucia
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CineService service = new CineService();
       service.crearCine();
       service.mostrarSala();
    }
    
}
