package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_07 {

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
