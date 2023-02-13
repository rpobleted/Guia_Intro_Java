package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio_extra_11 {

    /**
     * Escribir un programa que lea un número entero y devuelva el número de
     * dígitos que componen ese número. Por ejemplo, si introducimos el número
     * 12345, el programa deberá devolver 5. Calcular la cantidad de dígitos
     * matemáticamente utilizando el operador de división. Nota: recordar que
     * las variables de tipo entero truncan los números o resultados.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;
        int aux;
        int contador = 0;

        System.out.println("Ingresa un número entero");
        num = leer.nextInt();
        aux = num;

        do {
            aux = aux / 10;
            contador++;

        } while (aux > 0);

        System.out.println("La cantidad de digitos del numero es: " + contador);

    }

}
