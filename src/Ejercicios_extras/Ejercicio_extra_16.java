package Ejercicios_extras;

import java.util.Scanner;
import org.omg.CORBA.UnionMemberHelper;

public class Ejercicio_extra_16 {

    /**
     * Diseñe una función que pida el nombre y la edad de N personas e imprima
     * los datos de las personas ingresadas por teclado e indique si son mayores
     * o menores de edad. Después de cada persona, el programa debe preguntarle
     * al usuario si quiere seguir mostrando personas y frenar cuando el usuario
     * ingrese la palabra “No”.
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int n = 0;
        String[] nombre = new String[50];
        int[] edad = new int[50];
        String respuesta;

        do {
            System.out.println("Ingrese el nombre de la persona");
            nombre[n] = leer.next();

            System.out.println("Ingrese edad de la persona");
            edad[n] = leer.nextInt();

            System.out.println("Desea ingresar una nueva persona?? Si o NO ");
            respuesta = leer.next();
            
            n++;
        } while (respuesta == "NO");

    }

}
