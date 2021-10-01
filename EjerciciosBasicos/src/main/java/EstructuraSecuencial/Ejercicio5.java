package EstructuraSecuencial;

import java.util.Scanner;
/*
Ejercicio 5
Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
Recordar que la fórmula para la conversión es:
C = (F-32)*5/9
 */

public class Ejercicio5 {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Dame grados Farenhait: ");
        double gradosFarenhait = sc.nextDouble();
        double celsius = (gradosFarenhait - 32) *5 / 9.0;
        System.out.println(" en celsius " + celsius);
    }
}
