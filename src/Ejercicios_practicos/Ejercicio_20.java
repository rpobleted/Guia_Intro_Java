package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_20 {
// Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
// suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
// permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
// El programa deberá comprobar que los números introducidos son correctos, es decir,
// están entre el 1 y el 9.

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n = 3;
        int m = 3;
        int[][] matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Ingresa el valor para la posición " + "[" + i + "," + j + "]");
                matriz[i][j] = leer.nextInt();
            }
        }
        //INGRESO DE MATRIZ
        System.out.println("MATRIZ INGRESADA");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        //VALIDADOR DE FILAS
        System.out.println("VALIDADOR DE FILAS");
        int[] validadorFilas = new int[n];
        boolean validadorFilasX = false;
        int aux = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                validadorFilas[i] = validadorFilas[i] + matriz[i][j];
            }
        }
        aux = validadorFilas[0];
        for (int i = 1; i < n; i++) {
            if (aux == validadorFilas[i]) {
                validadorFilasX = true;
            } else {
                validadorFilasX = false;
            }
        }
        System.out.println(validadorFilasX);

        //VALIDADOR DE COLUMNAS
        System.out.println("VALIDADOR DE COLUMNAS");
        int[] validadorColumnas = new int[n];
        boolean validadorColumnasX = false;
        int aux1 = 0;

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                validadorColumnas[j] = validadorColumnas[j] + matriz[i][j];
            }
        }
        aux1 = validadorColumnas[0];
        for (int i = 1; i < n; i++) {
            if (aux1 == validadorColumnas[i]) {
                validadorColumnasX = true;
            } else {
                validadorColumnasX = false;
            }
        }
        System.out.println(validadorColumnasX);

        //VALIDADOR DE DIAGONALES
        System.out.println("VALIDADOR DE DIAGONALES");
        int diagonalDirecta = 0;
        int diagonalInversa = 0;
        boolean validadorDiagonalesX = false;

        for (int i = 0; i < n; i++) {
            diagonalDirecta = diagonalDirecta + matriz[i][i];
        }

        for (int i = 0; i < n; i++) {
            diagonalInversa = diagonalInversa + matriz[i][n - 1];
        }

        if (diagonalDirecta == diagonalInversa) {
            validadorDiagonalesX = true;
        } else {
            validadorDiagonalesX = false;
        }
        System.out.println(validadorDiagonalesX);

        //VALIDADOR TOTAL DE CONDICIONES
        System.out.println("VALIDACION TOTAL DE CUBO MAGICO");
        if (validadorFilasX == true && validadorColumnasX == true && validadorDiagonalesX == true) {
            System.out.println("La matriz corresponde a un cubo mágico");
        } else {
            System.out.println("NO ES MÁGICA");
        }

    }

}
