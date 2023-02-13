package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio_extra_02 {

    /*
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
     * diferente a cada una. A continuación, realizar las instrucciones
     * necesarias para que: B tome el valor de C, C tome el valor de A, A tome
     * el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
     * valores finales de cada variable. Utilizar sólo una variable auxiliar.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int A;
        int B;
        int C;
        int D;
        int aux;

        System.out.println("Ingrese el valor de A");
        A = leer.nextInt();
        System.out.println("Ingrese el valor de B");
        B = leer.nextInt();
        System.out.println("Ingrese el valor de C");
        C = leer.nextInt();
        System.out.println("Ingrese el valor de D");
        D = leer.nextInt();

        System.out.println("Orden inicial");
        System.out.println(A +""+ B +""+ C +""+ D);

        aux = B; 
        B = C;
        C = A;
        A = D;
        D = aux;
       
        //INVERSO
        //aux = D;
        //D = A;
        //A = aux;
        //aux = B;
        //B = C;
        //C = aux;

        System.out.println("Orden final");
        System.out.println(A +""+ B +""+ C +""+ D);

    }

}
