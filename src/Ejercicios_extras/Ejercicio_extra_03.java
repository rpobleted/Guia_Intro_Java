package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio_extra_03 {

    /**
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
     * trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
     * la función equals() de la clase String.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String letra;

        System.out.println("Ingrese una letra");
        letra = leer.next();
        letra = letra.toUpperCase();

        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            System.out.println("La letra ingresa es una vocal");
        } else {
            System.out.println("La letra ingresa no es vocal");
        }

    }

}
