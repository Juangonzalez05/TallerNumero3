/*Trabajo hecho por
Juan Manuel Gonzalez Rincon
Jose Daniel Morales Gomez
*/

package tallerestructura2;

import javax.swing.JOptionPane;
public class TallerEstructura2 {
    static int v[] , y[];
    static int tam;
   
    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null, "Aplicacion para hallar el producto escalar");
       tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de los vectores: "));
       
       v = new int[tam];
       y = new int[tam];
       
       llenarVector();
       
        JOptionPane.showMessageDialog(null, "El producto escalar es: "+ pEscalar());
        
    }
    static void llenarVector(){
    JOptionPane.showMessageDialog(null, "Llenar primer vector v[ ]");
    for(int i = 0; i < v.length; i++){
    v[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato v["+(i+1)+"]"));
    }
        JOptionPane.showMessageDialog(null, "Llenar primer vector y[ ]");
    for(int j = 0; j < y.length; j++){
    y[j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato y["+(j+1)+"]"));
    }
    
    }
    
    static double pEscalar(){
        int xEscalar = 0;
        
         for(int i = 0; i < v.length; i++){
             xEscalar = xEscalar + (v[i] * y[i]);
         }
        
         return xEscalar;
        
    }
   
    
    
}
