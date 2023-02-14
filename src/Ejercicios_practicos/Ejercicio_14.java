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
Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de Euros :)");
        double euros = leer.nextDouble();
        System.out.println("elija la moneda en la que quiera comvertir :)");
        System.out.println("1* 0.86 libras es un 1 €\n"
                + "2* 1.28611 $ es un 1 €\n"
                + "3* 129.852 yenes es un 1 €");
        
        String options=leer.next();
        converti(options,euros);
    }

    public static void converti(String options, double euros) {
        double d,y, i;
        
        switch (options){
            case "dollar":
                System.out.println(d=euros * 1.28611 );
                break;
            case "yenes":
                System.out.println(y = euros * 129.852);
                break;
                        case "libras":
                            System.out.println("i = ueros * 0.86");
                            break;
                        default:
                            System.out.println("ha ingresado uina moneda incorrecta :(");
                                    

    }
    }
}
    


