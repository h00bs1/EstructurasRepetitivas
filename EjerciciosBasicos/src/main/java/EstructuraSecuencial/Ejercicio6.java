package EstructuraSecuencial;

import java.util.Scanner;

/*
Ejercicio 6
Calcular la media de tres números pedidos por teclado.
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduce el primer numero ");
        int num1 = sc.nextInt();
        System.out.println(" Introduce el segundo numero ");
        int num2 = sc.nextInt();
        System.out.println(" Introduce el tercer numero ");
        int num3 = sc.nextInt();
        double media = (num1+num2+num3)/3.0;
        System.out.println(" La media es " +media);
    }
}