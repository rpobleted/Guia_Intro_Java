package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio_extra_07_02 {

    /**
     * Realice un programa que calcule y visualice el valor máximo, el valor
     * mínimo y el promedio de n números (n>0). El valor de n se solicitará al
     * principio del programa y los números serán introducidos por el usuario.
     * Realice dos versiones del programa, una usando el bucle “while” y otra
     * con el bucle “do - while”.
     */
    public static void main(String[] args) {
        //VERSION BUCLE DO WHILE
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int n;              // Cantidad de numeros
        int i = 0;          // Contador
        int valorMaximo = 0;
        int valorMinimo = 0;
        float promedio = 0;

        System.out.println("Ingrese la cantidad de numeros que desea evaluar");
        n = leer.nextInt();
        int[] numeros = new int[n];

        do {
            System.out.println("Ingrese el valor " + (i + 1));
            numeros[i] = leer.nextInt();
            i++;
        } while (i < n);

        valorMaximo = buscarMaximo(numeros, n);
        System.out.println("El valor maximo es: " + valorMaximo);

        valorMinimo = buscarMinimo(numeros, n);
        System.out.println("El valor minimo es: " + valorMinimo);

        promedio = calcularPromedio(numeros, n);
        System.out.println("El promedio general: " + promedio);

    }

    public static int buscarMaximo(int[] vector, int valor) {
        int resultado = vector[0];

        for (int i = 0; i < valor; i++) {
            if (resultado < vector[i]) {
                resultado = vector[i];
            }
        }
        return resultado;
    }

    public static int buscarMinimo(int[] vector, int valor) {
        int resultado = vector[0];

        for (int i = 0; i < valor; i++) {
            if (resultado > vector[i]) {
                resultado = vector[i];
            }
        }
        return resultado;
    }

    public static float calcularPromedio(int[] vector, int valor) {
        float resultado = 0;

        for (int i = 0; i < valor; i++) {
            resultado = resultado + vector[i];
        }
        resultado = resultado / valor;
        return resultado;
    }

}
