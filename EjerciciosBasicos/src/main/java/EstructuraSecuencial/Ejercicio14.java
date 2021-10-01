package EstructuraSecuencial;

import java.util.Scanner;
/*
Ejercicio 14
Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número invertido.
Ejemplo, si se introduce 23 que muestre 32.
 */

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int digito1;
        int digito2;
        int inverso;

        System.out.println(" Introduce un numero de dos cifras ");
        num = sc.nextInt();
        digito1 = num / 10;
        digito2 = num % 10;
        inverso = digito2 * 10 + digito1;
        System.out.println(" El numero inverso es "+inverso);


    }
}