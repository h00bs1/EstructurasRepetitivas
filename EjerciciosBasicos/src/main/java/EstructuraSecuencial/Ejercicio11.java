package EstructuraSecuencial;

import java.util.Scanner;
/*
Ejercicio 11
Pide al usuario dos números y muestra la “distancia” entre ellos (el valor absoluto de su
diferencia, de modo que el resultado sea siempre positivo).
 */

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        int distancia;

        System.out.println(" Introduce el primer número: ");
        numero1 = sc.nextInt();
        System.out.println(" Introduce el segundo número ");
        numero2 = sc.nextInt();
        distancia = Math.abs(numero1 - numero2);
        System.out.println(" La distancia entre ambos números es " +distancia);

    }
}