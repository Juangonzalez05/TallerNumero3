/*Trabajo hecho por
Juan Manuel Gonzalez Rincon
Jose Daniel Morales Gomez
*/

package com.mycompany.punto1;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Puntonumber1 {
    String Entrada;
    String[] Split;
    int NumMenor;
    int NumMayor;
    int Suma;
    double Prom;
    int[] Num;

    public Puntonumber1() {
        this.Entrada = JOptionPane.showInputDialog(null, "Digite los números separados por guiones.");
        this.Split = this.Entrada.split("-");
        this.NumMenor = 0;
        this.NumMayor = 0;
        this.Suma = 0;
        this.Prom = 0;
        this.Num = new int[this.Split.length];
    }
    
    public String solucionPuntoCuatro(){
        String Resultado = "";
        int Cont = 0;
        for (int i = 0; i < this.Split.length; i++){ 
            this.Num[i] = Integer.parseInt(this.Split[i]); 
        }
        
        for (int i = 0; i < this.Num.length; i++){
            this.Suma = this.Suma + this.Num[i]; 
        }
        Resultado += "Suma: " + this.Suma + "\n";
        
        for (int i = 0; i < this.Num.length; i++){
            Cont = Cont + 1; 
        }
        Resultado += "Prom: " + this.Suma/Cont + "\n";
        
         for (int i = 0; i < this.Num.length; i++){
            this.NumMenor = Arrays.stream(this.Num).min().getAsInt(); 
        }
        Resultado += "Menor: " + this.NumMenor + "\n";
        
        for (int i = 0; i < this.Num.length; i++){
            this.NumMayor =  Arrays.stream(this.Num).max().getAsInt(); 
        }
        Resultado += "Mayor: " + this.NumMayor + "\n";
        
       
        
        return Resultado;
    }
}