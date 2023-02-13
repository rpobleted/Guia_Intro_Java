package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_14 {

    /*
    Crea una aplicación que a través de una función nos convierta una cantidad de euros
    introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
    función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
    una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
    (void).
    El cambio de divisas es:
    * 0.86 libras es un 1 €
    * 1.28611 $ es un 1 €
    * 129.852 yenes es un 1 €
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        double euro;
        double dolares;
        double yenes;
        double libras;

        System.out.println("*** CONVERSOR DE DIVISAS ***");
        System.out.println("Ingrese el valor en Euros");
        euro = leer.nextInt();

    }

}

public static void saludoPesonalizado(int){
  System.out.println();
}
