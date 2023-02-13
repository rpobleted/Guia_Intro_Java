package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio_extra_13 {

    /**
     * Crear un programa que dibuje una escalera de números, donde cada línea de
     * números comience en uno y termine en el número de la línea. Solicitar la
     * altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el
     * número 3: 1 12 123
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;
        int aux = 1;

        System.out.println("Ingrese la altura de la escalera de numeros");
        num = leer.nextInt();

        for (int i = 0; i < num; i++) {

            for (int j = 0; j < i+1; j++) {
                System.out.print(aux);
                aux++;
            }
            aux = 1;
            System.out.println("");
        }

    }

}
