package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio_extra_22 {

    /**
     * Realizar un programa que rellene una matriz de tamaño NxM con valores
     * aleatorios y muestre la suma de sus elementos.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int[][] matriz;
        int m = 4;
        int n = 4;
        int suma = 0;

        matriz = new int[m][n];

        // LLENADO Y SUMA DE MATRIZ ALEATORIO
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 9 + 1);
                suma = suma + matriz[i][j];
            }
        }
        // MOSTRAR MATRIZ
        System.out.println("MATRIZ ALEATORIA");
        mostrarDatos(matriz, m, n);
        
        System.out.println("La suma total de elementos de la matriz es: "+ suma);
        
    }    
            

    public static void mostrarDatos(int[][] arreglo, int filas, int columnas){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + arreglo[i][j] + "]");
            }
            System.out.println("");
        }
    }

}


