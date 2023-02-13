package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingrese el primer numero");
        int numero1 = leer.nextInt();

        System.out.println("ingrese el segundo numero");
        int numero2 = leer.nextInt();
        boolean exit = false;

        do {
            System.out.println("*** MENU ***");
            System.out.println("1 - SUMAR");
            System.out.println("2 - RESTAR");
            System.out.println("3 - MULTIPLICAR");
            System.out.println("4 - DIVIDIR");
            System.out.println("5 - SALIR");

            System.out.println("Escoja una opción, para realizar una operación");
            int opc = leer.nextInt();

            switch (opc) {
                case 1:
                    int suma = numero1 + numero2;
                    System.out.println("El resultado de la suma es :" + suma);
                    break;
                case 2:
                    int resta = numero1 - numero2;
                    System.out.println("El resultado de la resta es :" + resta);
                    break;
                case 3:
                    int multiplicar = numero1 * numero2;
                    System.out.println("El resultado de la resta es :" + multiplicar);
                    break;
                case 4:
                    int dividir = numero1 / numero2;
                    System.out.println("El resultado de la resta es :" + dividir);
                    break;

                case 5:
                    System.out.println("Estar seguro de salir? S/N");
                    String opc2 = leer.next();
                    if (opc2.equalsIgnoreCase("S")) {
                        System.out.println("Saliendo ...");
                        exit = true;
                    }
            }

        } while (exit == false);

    }

}
