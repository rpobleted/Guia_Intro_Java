package Ejercicios_practicos;

import java.util.Scanner;

public class Ejercicio_17 {

    /**
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1
     * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int vector[];
        int resultado[] = new int[5];
        int num;
        int digitos = 0;

        System.out.println("Ingrese el valor de n para ingresa numeros enteros");
        num = leer.nextInt();
        vector = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese el número para la posición #" + (i + 1));
            vector[i] = leer.nextInt();
            digitos = (int) (Math.log10(vector[i]) + 1);
            switch (digitos) {
                case 1:
                    resultado[0]++;
                    break;
                case 2:
                    resultado[1]++;
                    break;
                case 3:
                    resultado[2]++;
                    break;
                case 4:
                    resultado[3]++;
                    break;
                case 5:
                    resultado[4]++;
                    break;
            }
        }
        System.out.println("*************************");
        System.out.println("RESUMEN CONTEO DE NUMEROS");
        System.out.println("Numeros de 1 digito  = " + resultado[0]);
        System.out.println("Numeros de 2 digitos = " + resultado[1]);
        System.out.println("Numeros de 3 digitos = " + resultado[2]);
        System.out.println("Numeros de 4 digitos = " + resultado[3]);
        System.out.println("Numeros de 5 digitos = " + resultado[4]);
    }
}
