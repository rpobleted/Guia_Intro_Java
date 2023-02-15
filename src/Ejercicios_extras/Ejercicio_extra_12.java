package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio_extra_12 {

    /**
     * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
     * números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
     * aparezca un 3 lo sustituya por una E. Ejemplo: 0-0-0 0-0-1 0-0-2 0-0-E
     * 0-0-4 0-1-2 0-1-E Nota: investigar función equals() y como convertir
     * números a String.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int digitos;
        int u, d, c;
        String letra = "E";

        for (int i = 1; i < 1000; i++) {
            digitos = (int) (Math.log10(i) + 1);
            u = 0;
            d = 0;
            c = 0;
            switch (digitos) {
                case 1:
                    u = i;
                    if (u == 3) {
                        System.out.println("0-0-" + letra);
                    } else {
                        System.out.println("0-0-" + i);
                    }
                    break;

                case 2:
                    u = i % 10;
                    d = i / 10;

                    if (d == 3 || u ==3) {
                        System.out.println("0-" + "E" + "-" + u);

                       
                    } else {
                        System.out.println("0-" + d + "-" +u);
                    }

                    
                    

                    break;

                case 3:
                    u = i % 10;
                    d = (i / 10) % 10;
                    c = i / 100;

                    System.out.println(c + "-" + d + "-" + u);
                    break;
            }
        }
    }
}
