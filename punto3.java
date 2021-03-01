/*Trabajo hecho por
Juan Manuel Gonzalez Rincon
Jose Daniel Morales Gomez
*/

package tallerestructura3;

import javax.swing.JOptionPane;
public class productoCruz {
    public void cruz(){
        JOptionPane.showMessageDialog(null, "Aplicacion para hallar el producto cruz");
        String Mensaje="", Mensaje1="", Mensaje2="";
        int tamVector=3;
        
        int vectoruno[] = new int [tamVector + 1];
        
        for(int i = 1; i < tamVector + 1; i++){
            vectoruno[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los componentes del primer vector, X Y Z"));
        }
        for(int i = 1; i < tamVector + 1; i++){
            Mensaje+="Elemento posicion ("+ i +"):"+vectoruno[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, "Vector #1 :"+"\n"+Mensaje);
        
        
        int vectordos[] = new int [tamVector + 1];
        
        for(int i = 1; i < tamVector + 1; i++){
            vectordos[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los componentes del segundo vector, X Y Z"));
        }
        for(int i = 1; i < tamVector + 1; i++){
            Mensaje1+="Elemento posicion ("+ i +"):"+vectordos[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, "Vector #2 :"+"\n"+Mensaje1);
        
      
        
        int vectorProducto[] = new int [tamVector + 1];
        for(int i = 1; i < tamVector + 1; i++){
            
            vectorProducto[1]= (vectoruno[2] * vectordos[3]) - (vectoruno[3] * vectordos[2]);
            vectorProducto[2]= - ((vectoruno[1] * vectordos[3]) - (vectoruno[3] * vectordos[1]));
            vectorProducto[3]= (vectoruno[1] * vectordos[2]) - (vectoruno[2] * vectordos[1]);   
            
            Mensaje2+= "\n Elemento posicion ("+ i +"): "+ vectorProducto[i]+"\n";
            
            JOptionPane.showMessageDialog(null, "La entrega de los 3 vectores es: "+Mensaje2);        
    }
        
    }

public static void main(String[] args){
    productoCruz PC = new productoCruz();
    PC.cruz();
    
    
}


}