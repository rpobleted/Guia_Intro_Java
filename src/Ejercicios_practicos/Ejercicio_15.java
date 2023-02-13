package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_15 {

    /*
    Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
    muestre por pantalla en orden descendente.
    
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n = 100;
        int[] vector = new int[n];

        // INGRESO DE DATOS
        for (int i = 0; i < n - 1; i++) {
            vector[i] = i + 1;
        }
        // RECORRIDO PARA MOSTAR DATOS ALREVES
        System.out.println("Contenido decreciente del arreglo");
        for (int i = n - 1; i > -1; i--) {
            System.out.println(vector[i]);
        }

    }

}
