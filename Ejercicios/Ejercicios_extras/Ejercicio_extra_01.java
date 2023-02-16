package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio_extra_01 {

    /**
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
     * ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
     * equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int minutos;
        int dias;
        int horas;

        System.out.println("Ingrese un tiempo en minutos");
        minutos = leer.nextInt();

        dias = conversionDias(minutos);
        horas = conversionHoras(minutos);

        System.out.println("La conversion en dias " + dias + " horas " + horas);
    }

    public static int conversionDias(int variable) {
        int dias = 0;
        dias = variable / (24 * 60);
        return dias;
    }

    public static int conversionHoras(int variable) {
        int horas = 0;
        horas = (variable % (24 * 60)) / 60;
        return horas;
    }

}
