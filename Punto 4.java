/*Trabajo hecho por
Juan Manuel Gonzalez Rincon
Jose Daniel Morales Gomez
*/
package tallerestructuranumero4;

import java.util.Scanner;

public class EjercicioMatriz {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int fila, columna;



        System.out.println("digite la cantidad de fias");
        fila=sc.nextInt();
        System.out.println("digite la cantidad ed columnas");
        columna=sc.nextInt();


        int[][]matriz=new int [fila][columna];

        for (int i=0;i<fila;i++)
        {
            for(int j=0;j<columna;j++)
            {
                System.out.println("ingrese el dato en la posicion "+i+","+j);
                matriz[i][j]=sc.nextInt();
            }

        }



        System.out.println("los datos  de la matriz son");

        for(int i=0;i<fila;i++)
        {
            for(int j=0;j<columna;j++)
            {
                System.out.println("matriz ["+i+","+j+"]="+matriz[i][j]);
            }
        }






    }
    }


