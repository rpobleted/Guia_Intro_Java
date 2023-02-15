package Ejercicios_practicos;

import java.util.Scanner;
import sun.tools.jar.resources.jar_ja;

public class Ejercicio_13 {

    /**
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
     * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
     * lo siguiente:
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n;

        System.out.println("Ingrese el tamaño del cuadrado que desea dibujar");
        n = leer.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("");
            for (int j = 1; j <= n; j++) {

                if (i < 2 || i == n || j < 2 || j == n) {

                    System.out.print(" * ");

                } else {

                    System.out.print("   ");

                }

            }

        }

    }

}
