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
public class ejemplo1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
    /*SE DEBE INGRESAR LA EDAD DE LA PERSONA Y DE ACUERDO AL RANGO SE DEBE CALCULAR
            SU SEGURO.
            18 - 30 =100.00
            30 - 40 =150.00
            40 - 50 =250.00
            60 - +  =500.00
          
          */
    String edad_txt = JOptionPane.
            showInputDialog(null,"Ingrese edad:",
                    "Mi calculo",
                    JOptionPane.INFORMATION_MESSAGE);
    int edad = Integer.parseInt(edad_txt);
    double seguro = 0.00;
    
    if(edad > 17 && edad < 30){
    seguro = 100.00;
} else if ( edad > 29 && edad < 40){
    seguro = 150.00;
    }else if( edad > 39 && edad < 50){
        seguro = 250.00;
    }else if ( edad >= 59){
        seguro = 500.00;
    }
    

    System.out.println("El precio del suguro es" + seguro);
    JOptionPane.showMessageDialog(null,
            " el precio del seguro es"+ seguro,
            "resultado",
            JOptionPane.INFORMATION_MESSAGE);
}
    
            
  
        
    }
    

