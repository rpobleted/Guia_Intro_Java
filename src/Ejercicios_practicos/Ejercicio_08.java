package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_08 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese una frase ");

        String nombre = leer.next();
        int longi = nombre.length();

        if (8 == longi) {
            System.out.println("longitud es de : " + longi);

        } else {
            System.out.println("incorrecto " + longi);
        }

    }

}
