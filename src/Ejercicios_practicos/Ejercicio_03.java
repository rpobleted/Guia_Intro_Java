package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_03 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresa una frase");
        String frase = leer.next();

        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());

    }

}
