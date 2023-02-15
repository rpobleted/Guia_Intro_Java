package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio_extra_23 {

    /**
     * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres
     * y, a medida que el usuario las va ingresando, construya una “sopa de
     * letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se
     * ubicarán todas en orden horizontal en una fila que será seleccionada de
     * manera aleatoria. Una vez concluida la ubicación de las palabras, rellene
     * los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente
     * imprima por pantalla la sopa de letras creada. Nota: Para resolver el
     * ejercicio deberá investigar cómo se utilizan las siguientes funciones de
     * Java substring(), Length() y Math.random().
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String palabra;
        String[][] matriz = new String[20][20];

        int contPalabras = 0;
        //INICIALIZAR MATRIZ
        rellenoDatos(matriz);

        do {
            System.out.println("Ingrese la palabra #" + (contPalabras + 1));
            palabra = leer.next().toUpperCase();

            if (palabra.length() >= 3 && palabra.length() <= 5) {

                insertarPalabra(palabra, matriz);
                contPalabras++;
            } else {
                System.out.println("Palabra incorrecta");
                System.out.println("*****");
            }

        } while (contPalabras < 5);

        rellenarEspacios(matriz);
        mostrarMatriz(matriz);

    }

    public static void rellenoDatos(String[][] arreglo) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                arreglo[i][j] = "*";
            }
        }
    }

    public static void insertarPalabra(String texto, String[][] arreglo) {
        int indice = (int) (Math.random() * 20 + 1); // PUNTO DE MEJORA PARA QUE NO SE REPITA EL INDICE ASI NO BORRARA EL ANTERIOR
        int letras = texto.length();
        for (int i = 0; i < letras; i++) {
            arreglo[indice][i] = texto.substring(i, i + 1);
        }
    }

    public static void rellenarEspacios(String[][] arreglo) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (arreglo[i][j].equals("*")) {
                   arreglo[i][j] = String.valueOf((int)(Math.random()*9+1));
                }

            }
        }
    }

    public static void mostrarMatriz(String[][] arreglo) {

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + arreglo[i][j] + "]");
            }
            System.out.println("");
        }

    }

}
