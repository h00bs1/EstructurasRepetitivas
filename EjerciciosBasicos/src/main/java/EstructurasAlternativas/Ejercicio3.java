package EstructurasAlternativas;

import java.util.Scanner;

/*
Ejercicio 3
Escribe un programa que lea un número e indique si es par o impar.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Introduce un numero ");
        int numero = sc.nextInt();

        if (numero % 2 == 0 && numero != 0) {
            System.out.println(" Es un numero par ");
        }
        else if (numero % 2 != 0) {
            System.out.println(" Es un numero impar ");
        }
        else {
            System.out.println(" Este numero es cero ");
        }
    }
}
