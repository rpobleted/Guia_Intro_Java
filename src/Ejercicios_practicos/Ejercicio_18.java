package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_18 {

    /**
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
     * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
     * A se denota por B y se obtiene cambiando sus filas por columnas (o
     * viceversa).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int n = 4;
        int m = 4;
        int matrizA[][] = new int[n][m];
        int matrizB[][] = new int[n][m];

        //INGRESO DE MATRIZ DE MANERA ALEATORIA
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrizA[i][j] = (int) (Math.random() * 10);
            }
        }

        //MOSTRAR MATRIZ INGRESADA
        System.out.println("MATRIZ A - NORMAL");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println("");
        }

        //MOSTRAR TRANSPUESTA
        System.out.println("MATRIZ A - TRANSPUESTA SIN CAMBIAR VARIABLES");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matrizA[j][i] + "]");
            }
            System.out.println("");
        }

        //ALMACENAR TRANSPUESTA EN OTRA MATRIZ
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrizB[i][j] = matrizA[j][i];
            }
        }

        //MOSTRAR MATRIZ INGRESADA
        System.out.println("MATRIZ B - NORMAL ALMACENANDO VALORES");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matrizB[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
