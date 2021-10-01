package EstructurasAlternativas;

import java.util.Scanner;

/*
Ejercicio 2
Algoritmo que pida un número y diga si es positivo, negativo o 0.
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Introduce un numero ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println(" Este numero es positivo ");
        }
        else if (numero < 0) {
            System.out.println(" Este numero es negativo ");
        }
        else {
            System.out.println( " Este numero es cero ");
        }

    }
}
