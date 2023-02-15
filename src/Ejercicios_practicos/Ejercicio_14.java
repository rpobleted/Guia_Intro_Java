package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_14 {

    /**
     * Crea una aplicación que a través de una función nos convierta una
     * cantidad de euros introducida por teclado a otra moneda, estas pueden ser
     * a dólares, yenes o libras. La función tendrá como parámetros, la cantidad
     * de euros y la moneda a converir que será una cadena, este no devolverá
     * ningún valor y mostrará un mensaje indicando el cambio (void). El cambio
     * de divisas es: 0.86 libras es un 1 € 1.28611 $ es un 1 € 129.852 yenes es
     * un 1 €
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de Euros");
        double euros = leer.nextDouble();

        System.out.println("Elija conversion que desea usar");
        System.out.println("Dolares"); // 1,28611 dolares = 1 euro
        System.out.println("Yenes");   // 0,86 libras = 1 euro
        System.out.println("Libras");  // 129,852 yenes = 1 euro

        String opc = leer.next();
        convertir(opc.toUpperCase(), euros);
    }

    public static void convertir(String alternativa, double valor) {

        switch (alternativa) {
            case "DOLARES":
                System.out.println(valor * 1.28611);
                break;
            case "YENES":
                System.out.println(valor * 129.852);
                break;
            case "LIBRAS":
                System.out.println(valor * 0.86);
                break;
        }
    }
}
