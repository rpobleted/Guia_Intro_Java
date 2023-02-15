package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio_extra_10 {

    /**
     * Realice un programa para que el usuario adivine el resultado de una
     * multiplicación entre dos números generados aleatoriamente entre 0 y 10.
     * El programa debe indicar al usuario si su respuesta es o no correcta. En
     * caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
     * su respuesta nuevamente. Para realizar este ejercicio investigue como
     * utilizar la función Math.random() de Java.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int num1;
        int num2;
        int resultadoPropuesto;
        int resultadoReal;
        boolean respuesta = false;

        num1 = (int) (Math.random() * 10);
        num2 = (int) (Math.random() * 10);
        resultadoReal = num1 * num2;

        System.out.println("El primer número es  : ?");
        System.out.println("El segundo número es : ?");
        System.out.println("Pista: Los números estan entre 0 y 10");
        System.out.println("");
        System.out.println("ADIVINA LA MULTIPLICACIÓN");

        do {
            System.out.println("Ingresa el resultado ");
            resultadoPropuesto = leer.nextInt();
            if (resultadoReal != resultadoPropuesto) {
                System.out.println("Respuesta incorrecta");
                respuesta = false;
            } else {
                System.out.println("Respuesta correcta");
                respuesta = true;
            }
        } while (respuesta == false);
    }

}
