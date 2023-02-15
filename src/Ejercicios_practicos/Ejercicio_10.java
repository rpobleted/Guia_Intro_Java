package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_10 {

    /**
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a
     * continuación solicite números al usuario hasta que la suma de los números
     * introducidos supere el límite inicial.
     *
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese limite superior para la sumatoria");
        int valor = leer.nextInt();
        int suma = 0;

        do {

            System.out.println("Ingrese un numero para agregar a la sumatoria");
            int num = leer.nextInt();
            suma = suma + num;

        } while (suma <= valor);

        System.out.println("EL VALOR ACUMULADO SUPERO EL LIMITE DEFINIDO: )" + suma);
        System.out.println("Valor limite: )" + valor);
        System.out.println("Valor acumulado: )" + suma);

    }

}
