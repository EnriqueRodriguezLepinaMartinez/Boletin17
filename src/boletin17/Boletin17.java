/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class Boletin17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        Numeros num = new Numeros();
        num.cargarlista();
        num.visualizar();
        System.out.println("Al Reves");
        num.alreves();


        Ejer2y3 nts = new Ejer2y3();
        nts.cargarnotas();
        nts.visualizarNotas();
        
        nts.cargarnombres();
        nts.visualizarAprobados();
        nts.ListaOrdena();
        nts.cargarnotas();
        
        nts.BuscarNota();
        
        Ejer4 nif = new Ejer4();
        nif.pedirDNI();
        
        
        
        
    }
    
}
