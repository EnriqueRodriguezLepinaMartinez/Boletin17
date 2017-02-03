/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class Ejer2y3 {
    private final int[] notas = new int[10];
    private final String[] nombres = new String[10];

    public Ejer2y3() {
    }
    
    public void cargarnombres(){
        nombres[0] = "Jorge";
        nombres[1] = "Luis";
        nombres[2] = "Ana";
        nombres[3] = "Juan";
        nombres[4] = "Diana";
        nombres[5] = "Jose";
        nombres[6] = "Antonio";
        nombres[7] = "Javi";
        nombres[8] = "Anxo";
        nombres[9] = "Guille";
        
    }
    
    public void cargarnotas(){
        notas[0] = 3;
        notas[1] = 7;
        notas[2] = 3;
        notas[3] = 4;
        notas[4] = 8;
        notas[5] = 6;
        notas[6] = 7;
        notas[7] = 9;
        notas[8] = 8;
        notas[9] = 10;
    }
    
    public void visualizarNotas(){
        int apro = 0;
        int susp = 0;
        int media = 0;
        int alta = 0;
        
        for(int i=0; i<10 ;i++){
          if(notas[i] >= 5){
              apro += 1;
              media += notas[i];
              if(notas[i]> alta){
                  alta = notas[i];
              }
          }else{
              susp += 1;
              media += notas[i];
              if(notas[i]> alta){
                  alta = notas[i];
          }
        }
        }
          System.out.println("VISUALIZACION DE NOTAS"); 
          System.out.println("Numero de aprobados: " + apro + " .");
          System.out.println("Numero de suspensos: " + susp + " .");
          System.out.println("Nota media: " + (media / 10) + " .");
          System.out.println("Nota mas alta: " + alta + " .");
    }
    
    public void visualizarAprobados(){
        System.out.println("");
        System.out.println("ALUMNOS APROBADOS");
        for(int i=0; i<10 ;i++){
          if(notas[i] >= 5){
              System.out.println(nombres[i]);
          }
        }
    }
    
    public void ListaOrdena(){
        System.out.println("");
        System.out.println("NOTAS ORDENADAS");
        
        int[] copianotas = new int[10];
        
        for(int i=0; i<notas.length;i++){
            copianotas[i] = notas[i];
        }
        Arrays.sort(copianotas);
        
        for(int i=0;i<copianotas.length;i++){
            System.out.println(copianotas[i]);
        }
    }
    
    public void BuscarNota(){
        boolean boleano = false;
        int pos = 0;
        do{
         String nombre = JOptionPane.showInputDialog("Nome: ");
         for(int i=0;i<nombres.length;i++){
            if(nombres[i].equals(nombre)){
                boleano = true;
                pos = i;
            }
         }
        }
        while(boleano == false);
        
        System.out.println("Tiene un: " + notas[pos]);
    }
    
    
}
