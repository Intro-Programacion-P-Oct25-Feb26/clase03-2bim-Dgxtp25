/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;
import java.util.Scanner;
/**
 *
 * @author dgxbt
 */
public class Ejercicio01 {
    public static void main(String[] args){
        Scanner entrada = new
    Scanner (System.in);
        String[] nombresEstacion = new String[5];
        String[] nombresEncargados = new String[5];
        double[][] produccion = new double [5][12];
        double [] totalProduccion = new double [5];
        for (int i = 0; i < 5; i++){
            System.out.println("Ingrese nombre de la estacion" + (i + 1) + ":");
            nombresEstacion[i] = entrada.nextLine();
            System.out.println("Ingrese nombre del encargado de la estacion" 
                    + (i + 1) + ":");
            nombresEncargados[i] = entrada.nextLine();
          for (int j = 0; j < 12; j++){
              System.out.println("Produccion del mes" + (j + 1) + ":");
            produccion[i][j] = entrada.nextDouble();
            totalProduccion[i]+= entrada.nextDouble();
              
          }
            
        }
        
    }
    
}
