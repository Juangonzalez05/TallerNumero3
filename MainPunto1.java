/*Trabajo hecho por
Juan Manuel Gonzalez Rincon
Jose Daniel Morales Gomez
*/

package com.mycompany.punto1;


import javax.swing.JOptionPane;

public class MainPunto1 {

    
    public static void main(String[] args) {
    
     int menu;
     menu = Integer.parseInt( JOptionPane.showInputDialog("Escoger una opcion"+
                           "\n1- Mostrar Solucion"));
                        
     
         
                 
      
         switch (menu){
             case 1:
                 Puntonumber1 a = new Puntonumber1();
                    String Solucion = a.solucionPuntoCuatro();
                    JOptionPane.showMessageDialog(null, Solucion);
                    break;         
        }
    }
}
     
     
     