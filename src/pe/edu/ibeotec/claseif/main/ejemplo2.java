/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ibeotec.claseif.main;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB-203
 */
public class ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numero =
        JOptionPane.showInputDialog(null,
                "ingrese numero:");
        int num = Integer.parseInt(numero);
        int contador = 2;
        boolean primo = true;
        while(primo && contador !=num ){
            if(num % contador == 0){
                primo = false;
                contador++;
            }
        }
        
    }
    
}
