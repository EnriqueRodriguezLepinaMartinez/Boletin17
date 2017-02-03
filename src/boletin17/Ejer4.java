/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

import javax.swing.JOptionPane;


/**
 *
 * @author erodriguez-lepinamartinez
 */
public class Ejer4 {
    
    private String [] letra = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    public void pedirDNI(){
        int dni = Integer.parseInt(JOptionPane.showInputDialog("DNI sin letra: "));
        int resto = dni % 23;
        System.out.println(letra[resto]);
              }
          } 