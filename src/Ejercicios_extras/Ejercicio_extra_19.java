package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio_extra_19 {

    /**
     * Escriba un programa que averigüe si dos vectores de N enteros son iguales
     * (la comparación deberá detenerse en cuanto se detecte alguna diferencia
     * entre los elementos).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int[] vector1;
        int[] vector2;
        int n;
        int salir = 0;

        System.out.println("Ingrese el largo del vector");
        n = leer.nextInt();
        vector1 = new int[n];
        vector2 = new int[n];

        // INGRESO DE DATOS
        // VECTOR 1
        System.out.println("INGRESO DE DATOS VECTOR 1");
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor #" + (i + 1));
            vector1[i] = leer.nextInt();
        }
        // VECTOR 2
        System.out.println("INGRESO DE DATOS VECTOR 2");
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor #" + (i + 1));
            vector2[i] = leer.nextInt();
        }

        //COMPARACION DE VECTORES
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                salir++;
                break;
            }
        }
        // CONDICION DE SALIDA
        if (salir == 0) {
            System.out.println("VECTOR IGUALES");
        } else {
            System.out.println("VECTOR NO SON IGUALES");
        }
    }
}
