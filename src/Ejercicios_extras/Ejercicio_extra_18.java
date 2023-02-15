package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio_extra_18 {

    /**
     * Realizar un algoritmo que calcule la suma de todos los elementos de un
     * vector de tamaño N, con los valores ingresados por el usuario.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int[] vector;
        int n;
        int suma = 0;
        System.out.println("Ingrese el largo del vector");
        n = leer.nextInt();
        vector = new int[n];

        //INGRESO DE DATOS
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor #" + (i + 1));
            vector[i] = leer.nextInt();
        }
        //CALCULO DE SUMA
        for (int i = 0; i < n; i++) {
            suma = suma + vector[i];
        }
        System.out.println("La suma de todos los elementos del vector es: " + suma);
    }
}
