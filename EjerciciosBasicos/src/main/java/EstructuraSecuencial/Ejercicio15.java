package EstructuraSecuencial;

import java.util.Scanner;
/*
Ejercicio 15
Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un
algoritmo que intercambie los valores de ambas variables y muestre cuanto valen al final las
dos variables.
 */

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Introduce valor de A ");
        int a = sc.nextInt();

        System.out.println(" Introduce valor de B ");
        int b = sc.nextInt();

        int swap = a; // se llama swap a la variable auxiliar
        a = b;
        b = swap;

        System.out.println(" Valor real de A es " +a);
        System.out.println(" Valor real de B es " +b);

        System.out.println(" A toma el valor de B, ahora vale " +swap);
        System.out.println(" B toma el valor de A, ahora vale " +a);
    }

}
