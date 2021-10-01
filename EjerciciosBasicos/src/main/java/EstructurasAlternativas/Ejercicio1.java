package EstructurasAlternativas;
import java.util.Scanner;
/*
Ejercicio 1
Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no.
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Introduce el primer numero ");
        int numero1 = sc.nextInt();

        System.out.println(" Introduce el segundo numero ");
        int numero2 = sc.nextInt();

        if ( numero1 > numero2) {
            System.out.println(+numero1+" es mayor que " +numero2);
        }

        else {
            System.out.println(+numero1+ " es menor que " + numero2);
        }

    }
}
