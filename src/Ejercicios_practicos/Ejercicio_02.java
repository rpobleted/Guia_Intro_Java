package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_02 {

    public static void main(String[] args) {

        /**
         * Escribir un programa que pida tu nombre, lo guarde en una variable y
         * lo muestre por pantalla.
         *
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();

        System.out.println("El nombre que ingresaste es: " + nombre);

    }

}
