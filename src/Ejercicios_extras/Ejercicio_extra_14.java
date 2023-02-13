package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio_extra_14 {

    /**
     * Se dispone de un conjunto de N familias, cada una de las cuales tiene una
     * M cantidad de hijos. Escriba un programa que pida la cantidad de familias
     * y para cada familia la cantidad de hijos para averiguar la media de edad
     * de los hijos de todas las familias.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int[] cantidadHijos;
        int n;
        int promedio=0;

        System.out.println("Ingresa la cantidad de familias");
        n = leer.nextInt();
        cantidadHijos = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingresa la cantidad de hijos para la familia " + (i + 1));
            cantidadHijos[i] = leer.nextInt();
        }

        for (int i = 0; i < n; i++) {
            promedio=promedio+cantidadHijos[i];
            
        }
        
        System.out.println("Promedio de hijos por familia " + (promedio/n));

        
    }

}
