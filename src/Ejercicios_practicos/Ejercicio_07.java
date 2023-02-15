package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_07 {

    /**
     * Crear un programa que pida una frase y si esa frase es igual a “eureka”
     * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
     * Incorrecto. Nota: investigar la función equals() en Java.
     *
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresa una palabra clave");
        String palabra = leer.next();

        /**
         * Funcion para comparar strings .equals() sirve para comparacion exacta
         * .equalsIgnoreCase() sirve para comparación sin importar Mayus, Minus
         */
        if (palabra.equalsIgnoreCase("eureka")) {
            System.out.println("CORRECTO");

        } else {
            System.out.println("INCORRECTO");
        }

    }

}
