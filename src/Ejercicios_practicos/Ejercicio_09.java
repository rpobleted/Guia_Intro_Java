package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_09 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese una frase ");
        String frase = leer.next();

        String letra = frase.substring(0, 1);

        if (letra.equals("A")) {
            System.out.println("CORRECTO");

        } else {
            System.out.println("INCORRECTO");
        }

    }

}
