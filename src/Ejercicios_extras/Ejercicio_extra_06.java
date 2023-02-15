package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio_extra_06 {

    /**
     * Leer la altura de N personas y determinar el promedio de estaturas que se
     * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int n, i;
        double promedioMenores;
        double promedioGeneral;

        System.out.println("Ingrese una cantidad de personas");
        n = leer.nextInt();

        double[] personas = new double[n];

        for (i = 0; i < n; i++) {
            System.out.println("Ingrese la estatura de la persona  #" + (i + 1) + " [metros]");
            personas[i] = leer.nextDouble();
        }
        // INVOCAR FUNCION PROMEDIO PERSONAS MENORES
        promedioMenores = promedioMenores(personas, n);
        System.out.println("Promedio de las estaturas menores a 1,6mts es: " + promedioMenores);
        // INVOCAR FUNCION PROMEDIO GENERAL
        promedioGeneral = promedioGeneral(personas, n);
        System.out.println("Promedio general de las estaturas es: " + promedioGeneral);

    }

    public static double promedioMenores(double matriz[], int n) {
        double resultado = 0;
        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (matriz[i] < 1.6) {
                resultado = resultado + matriz[i];
                cont++;
            }

        }

        if (cont == 0) {
            resultado = 0;
        } else {
            resultado = resultado / cont;
        }
        return resultado;

    }

    public static double promedioGeneral(double matriz[], int n) {
        double resultado = 0;
        for (int i = 0; i < n; i++) {
            resultado = resultado + matriz[i];
        }
        resultado = resultado / n;
        return resultado;

    }

}
