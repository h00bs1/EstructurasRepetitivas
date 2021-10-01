package EstructuraSecuencial;

import java.util.Scanner;
/*
Ejercicio 4
Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.
 */
public class Ejercicio4 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Introduce el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println(" Introduce el segundo numero: ");
        int num2 = sc.nextInt();
        int suma = num1+num2;
        int resta = num1-num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        System.out.println(suma+ " " + resta+ " " + multiplicacion + " " + division);
    }
}