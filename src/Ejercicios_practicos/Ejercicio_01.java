package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_01 {

    /**
     * Escribir un programa que pida dos números enteros por teclado y calcule
     * la suma de los dos. El programa deberá después mostrar el resultado de la
     * suma
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresa primer numero");
        int numero1 = leer.nextInt();

        System.out.println("Ingresa segundo numero");
        int numero2 = leer.nextInt();

        int suma = numero1 + numero2;
        System.out.println("La suma de los numeros es :" + suma);

    }

}
