package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_08 {

    /**
     * Realizar un programa que solo permita introducir solo frases o palabras
     * de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
     * deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
     * contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
     * Lenght() en Java.
     *
     */

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
