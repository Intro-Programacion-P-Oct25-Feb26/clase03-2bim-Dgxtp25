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

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombresEstacion = new String[5];
        String[] nombresEncargados = new String[5];
        double[][] produccion = new double[5][12];
        double[] totalProduccion = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre de la estacion" + (i + 1) + ":");
            nombresEstacion[i] = entrada.nextLine();
            System.out.println("Ingrese nombre del encargado de la estacion"
                    + (i + 1) + ":");
            nombresEncargados[i] = entrada.nextLine();
            for (int j = 0; j < 12; j++) {
                System.out.println("Produccion del mes" + (j + 1) + ":");
                produccion[i][j] = entrada.nextDouble();
                totalProduccion[i] += produccion[i][j];
            }
            entrada.nextLine(); // limpiar buffer
        }

        // Buscar estación más productiva
        double mayorProduccion = totalProduccion[0];
        int posicionMayor = 0;

        for (int i = 1; i < 5; i++) {
            if (totalProduccion[i] > mayorProduccion) {
                mayorProduccion = totalProduccion[i];
                posicionMayor = i;
            }
        }

        // Reporte
        System.out.println("\nAnálisis de Producción\n");
        System.out.println("Estación\n");

        for (int i = 0; i < 5; i++) {
            System.out.printf(
                    "%s - Total Producción: $ %.2f%n",
                    nombresEstacion[i],
                    totalProduccion[i]
            );
        }

        System.out.println("\nEstación más productiva: " + nombresEstacion[posicionMayor]);
        System.out.println("Encargado de la estación: " + nombresEncargados[posicionMayor]);
        System.out.printf("Cantidad de la estación más productiva: $ %.2f%n", mayorProduccion);
    }
}
