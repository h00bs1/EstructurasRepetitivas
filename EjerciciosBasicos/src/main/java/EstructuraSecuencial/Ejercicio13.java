package EstructuraSecuencial;

import java.util.Scanner;
/*
Ejercicio 13
Realizar un algoritmos que lea un número y que muestre su raíz cuadrada y su raíz cúbica.
Python3 no tiene ninguna función predefinida que permita calcular la raíz cúbica, ¿Cómo se
puede calcular?
 */

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;
        double raiz2;
        double raiz3;

        System.out.println(" Introduce el numero: ");
        numero = sc.nextDouble();
        raiz2 = Math.sqrt(numero);
        raiz3 = Math.pow(numero, 1.0/3.0);

        System.out.println(" La raiz cuadrada de " +numero+ " es " +raiz2);
        System.out.println(" La raiz cubica de " + numero+ " es " + raiz3);

    }
}
