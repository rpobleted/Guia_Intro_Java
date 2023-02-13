package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int correctas = 0;
        int incorrectas = 0;
        String FDE = "&&&&&";
        boolean salir = true;

        do {
            System.out.println("Ingrese una cadena de caracteres");
            String cadena = leer.next();

            if (cadena.equalsIgnoreCase(FDE)) {
                salir = false;

            } else {

                int largo = cadena.length();
                String ini = cadena.substring(0, 1);
                String fin = cadena.substring(largo - 1, largo);

                if (largo <= 5 && ini.equalsIgnoreCase("X") && fin.equalsIgnoreCase("O")) {
                    correctas++;
                } else {
                    incorrectas++;
                }
            }
        } while (salir);

        System.out.println("*** INFORME DE INGRESOS ***");
        System.out.println("Correctas =" + correctas);
        System.out.println("InCorrectas =" + incorrectas);

    }

}
