package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_04 {

    /**
     *
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en
     * grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     *
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresa la temperatura en grados C°");
        int temperatura = leer.nextInt();

        float resultado = 32 + (9 * temperatura / 5);

        System.out.println("La temperatura en grados F° es :" + resultado);

    }

}
