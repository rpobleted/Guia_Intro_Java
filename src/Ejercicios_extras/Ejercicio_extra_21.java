package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio_extra_21 {

    /**
     * Crear una función rellene un vector con números aleatorios, pasándole un
     * arreglo por parámetro. Después haremos otra función o procedimiento que
     * imprima el vector.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int n = 4; // 4 notas  + 1 promedio
        int m = 10; // Cantidad de alumnos
        int[][] matrizNotas = new int[10][5];
        double[] promedios = new double[10];

        matrizNotas = rellenoDatos(matrizNotas, m, n);
        promedioPonderado(promedios, matrizNotas, m, n);
        System.out.println("NOTAS DE ALUMNOS");
        mostrarDatos(promedios, matrizNotas, m, n);
    }

    public static int[][] rellenoDatos(int[][] arreglo, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas ; j++) {
                arreglo[i][j] = (int) (Math.random() * 7 + 1);
            }
        }
        return arreglo;
    }

    public static void promedioPonderado(double vector[], int[][] arreglo, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {

            vector[i] = arreglo[i][0] * 0.1 + arreglo[i][1] * 0.15 + arreglo[i][2] * 0.25 + arreglo[i][3] * 0.5;

        }
    }

    public static void mostrarDatos(double[] vector, int[][] arreglo, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            System.out.print("Estudiante " + (i + 1) + "  ");
            for (int j = 0; j < columnas ; j++) {
                System.out.print("[" + arreglo[i][j] + "]");
            }
            System.out.print("  Promedio :");
            System.out.println(vector[i]);
        }
    }
}
