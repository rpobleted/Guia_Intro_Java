package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio_extra_09 {

    /**
     * Simular la división usando solamente restas. Dados dos números enteros
     * mayores que uno, realizar un algoritmo que calcule el cociente y el
     * residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
     * obtener un resultado menor que el divisor, este resultado es el residuo,
     * y el número de restas realizadas es el cociente. Por ejemplo: 50 / 13: 50
     * – 13 = 37 una resta realizada 37 – 13 = 24 dos restas realizadas 24 – 13
     * = 11 tres restas realizadas dado que 11 es menor que 13, entonces: el
     * residuo es 11 y el cociente es 3.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int num1;
        int num2;
        int residuo;
        int cociente=0;
        
        do {
            System.out.println("***DIVISION DE 2 NUMEROS***");
            System.out.println("Ingresa 2 numeros enteros (mayores que 1)");
            num1 = leer.nextInt();
            num2 = leer.nextInt();

        } while (num1 <= 1 || num2 <= 1);
       
        
        residuo=num1;
        
        do {            
        residuo = residuo-num2;
        cociente++;    
            
        } while (residuo>num2);
        
        System.out.println("Resultado division entre "+ num1 + "/" + num2);
        System.out.println("Cociente  : " + cociente );
        System.out.println("Residuo  : " + residuo );

        

    }

}
