package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio_extra_20 {

    /**
     * Crear una función rellene un vector con números aleatorios, pasándole un
     * arreglo por parámetro. Después haremos otra función o procedimiento que
     * imprima el vector.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int n = 4;
        int[] vector = new int[n];

        vector = rellenoDatos(vector, n);
        mostrarDatos(vector, n);
    }

    public static int[] rellenoDatos(int[] arreglo, int largo) {
        for (int i = 0; i < largo; i++) {
            arreglo[i] = (int) (Math.random() * 10);
        }
        return arreglo;
    }

    public static void mostrarDatos(int[] arreglo, int largo) {
        for (int i = 0; i < largo; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
}
