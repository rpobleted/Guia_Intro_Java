package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio_extra_15 {

    /**
     * Crea una aplicación que le pida dos números al usuario y este pueda
     * elegir entre sumar, restar, multiplicar y dividir. La aplicación debe
     * tener una función para cada operación matemática y deben devolver sus
     * resultados para imprimirlos en el main.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num1;
        int num2;
        int opcion;
        int suma, resta, multiplicacion;
        double division;

        System.out.println("Ingresa 2 numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        do {

            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.err.println("5. Salir");

            System.out.println("Escoge una opción para realizar la operación: ");
            opcion = leer.nextInt();

            switch(opcion){

                case 1:
                    System.out.println("El resultado de la suma es : " + suma(num1, num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es : " + resta(num1, num2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es : " + multiplicacion(num1, num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No es posible la division por 0 en numeros enteros");
                    } else {
                        System.out.println("El resultado de la división es : " + division(num1, num2));
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
            }
        } while (opcion != 5);
    }

    public static int suma(int valor1, int valor2) {
        int resultado;
        resultado = valor1 + valor2;
        return resultado;
    }

    public static int resta(int valor1, int valor2) {
        int resultado;
        resultado = valor1 - valor2;
        return resultado;
    }

    public static int multiplicacion(int valor1, int valor2) {
        int resultado;
        resultado = valor1 * valor2;
        return resultado;
    }

    public static double division(int valor1, int valor2) {
        int resultado;
        resultado = valor1 / valor2;
        return resultado;
    }

}
