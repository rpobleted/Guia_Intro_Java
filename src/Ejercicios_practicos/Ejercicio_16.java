package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_16 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n = 4;
        int cont = 0;
        int[] vector = new int[n];

        // INGRESO DE DATOS ALEATORIO
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        // RECORRIDO PARA MOSTAR DATOS
        System.out.println("MATRIZ ALEATORIA INGRESADA");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        // BUSCAR DATO DENTRO DE LA MATRIZ
        System.out.println("Ingrese el valor que desea buscar en la matriz");
        int num = leer.nextInt();

        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                cont++;
                System.out.println("Encontrado en posición " + (i + 1));
            }
        }

        if (cont > 0) {
            System.out.println("El valor se encontro " + cont + " veces");;
        } else {
            System.out.println("Valor no encontrado");
        }

    }

}
