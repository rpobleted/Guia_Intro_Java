package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_03 {

    /**
     * Escribir un programa que pida una frase y la muestre toda en mayúsculas y
     * después toda en minúsculas. Nota: investigar la función toUpperCase() y
     * toLowerCase() en Java.
     *
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresa una frase");
        String frase = leer.next();

        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());

    }

}
