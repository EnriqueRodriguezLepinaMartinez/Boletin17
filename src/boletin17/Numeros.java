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
public class Numeros {
    private int [] lista = new int[6];

    public Numeros() {
    }
    
    public void cargarlista(){
        for(int i=0; i<6;i++){
            lista[i] = (int)(Math.random()*50)+1;
        }
    }
    
    public void visualizar(){
        for(int i=0; i<6 ;i++){
            System.out.println(lista[i]);
        }
    }
    
    public void alreves(){
          for(int i=0; i<6 ;i++){
            System.out.println(lista[5 - i]);
        }
    }
    
    
}
