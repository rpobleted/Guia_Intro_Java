package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio_extra_05 {

    /**
     * Una obra social tiene tres clases de socios:
     *
     * 1) Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
     * descuento en todos los tipos de tratamientos.
     *
     * 2) Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
     * descuento para los mismos tratamientos que los socios del tipo A.
     *
     * 3) Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos
     * sobre dichos tratamientos.
     *
     * 4) Solicite una letra (carácter) que representa la clase de un socio, y
     * luego un valor real que represente el costo del tratamiento (previo al
     * descuento) y determine el importe en efectivo a pagar por dicho socio.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String letra;
        int costo;
        double importe;

        System.out.println("Ingrese la letra de clasificación de socio");
        System.out.println("Tipo A");
        System.out.println("Tipo B");
        System.out.println("Tipo C");
        letra = leer.next();
        letra = letra.toUpperCase();

        System.out.println("Ingrese el costo total del tratamiento");
        costo = leer.nextInt();

        switch (letra) {
            case "A":
                System.out.println("Cliente tipo A: Aplica 50% dscto.");
                importe = costo * 0.5;
                System.out.println("El importe en efectivo a pagar es: $" + importe);
                break;

            case "B":
                System.out.println("Cliente tipo B: Aplica 35% dscto.");
                importe = costo * 0.75;
                System.out.println("El importe en efectivo a pagar es: $" + importe);
                break;

            case "C":
                System.out.println("Cliente tipo C: No aplica dscto.");
                importe = costo * 1;
                System.out.println("El importe en efectivo a pagar es: $" + importe);
                break;
        }

    }

}
