package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_05 {

    /**
     *
     * Escribir un programa que lea un número entero por teclado y muestre por
     * pantalla el doble, el triple y la raíz cuadrada de ese número. Nota:
     * investigar la función Math.sqrt().
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresa un numero entero");
        int numero = leer.nextInt();

        int doble = numero * 2;
        int triple = numero * 3;
        double raiz = Math.sqrt(numero);

        System.out.println("El doble del numero es:" + doble);
        System.out.println("El triple del numero es:" + triple);
        System.out.println("La raiz cuadrada del numero es:" + raiz);

    }

}
