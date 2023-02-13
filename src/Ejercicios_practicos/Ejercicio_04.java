package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_04 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresa la temperatura en grados C°");
        int temperatura = leer.nextInt();

        float resultado = 32 + (9 * temperatura / 5);

        System.out.println("La temperatura en grados F° es :" + resultado);

    }

}
