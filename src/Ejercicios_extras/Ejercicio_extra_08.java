package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio_extra_08 {

    /**
     * Escriba un programa que lea números enteros. Si el número es múltiplo de
     * cinco debe detener la lectura y mostrar la cantidad de números leídos, la
     * cantidad de números pares y la cantidad de números impares. Al igual que
     * en el ejercicio anterior los números negativos no deben sumarse. Nota:
     * recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int i = 0;
        int contadorGeneral = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        int num;

        do {
            System.out.println("Ingrese un numero entero");
            num = leer.nextInt();
            if (num > 0) { //NUMERO POSITIVO
                if (num % 2 == 0) { //NUMERO PAR
                    contadorPares++;
                }
                if (num % 2 != 0) { //NUMERO IMPAR
                    contadorImpares++;
                }
            }
        } while (num % 5 != 0);

        System.out.println("***RESUMEN DE INGRESO DE DATOS");
        System.out.println("PARES       :" + contadorPares);
        System.out.println("IMPARES     :" + contadorImpares);
        contadorGeneral = contadorPares + contadorImpares;
        System.out.println("T. GENERAL  :" + contadorGeneral);

    }

}
