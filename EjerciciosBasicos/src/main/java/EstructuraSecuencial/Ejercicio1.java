package EstructuraSecuencial;

import java.util.Scanner;

/*
Ejercicio 1
Escribir un programa que pregunte al usuario su nombre, y luego lo salude.
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduce tu nombre ");
        String nombre = sc.nextLine();
        System.out.println(" Hola " +nombre);

    }
}