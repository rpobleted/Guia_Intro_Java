package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresa un numero entero");
        int numero = leer.nextInt();

        if (0 == numero % 2) {
            System.out.println("El numero ingresado " + numero + " es par");
        } else {

            System.out.println("El numero ingresado " + numero + " es impar");

        }

    }

}
