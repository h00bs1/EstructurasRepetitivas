package main;
import java.util.Scanner;
/*
Ejercicio 11
Escribe un programa que diga si un número introducido por teclado es o no primo. Un
número primo es aquel que sólo es divisible entre él mismo y la unidad. Nota: Es suficiente
probar hasta la raíz cuadrada del número para ver si es divisible por algún otro número.
 */
public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ejercicio11 ejercicio11 = new Ejercicio11();
        ejercicio11.ejer11(sc);

    }
    public void ejer11(Scanner sc){
        System.out.println("Introduzca un número ");
        double numero = sc.nextInt();
        boolean esPrimo = true;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (i != numero){
                if (numero % i == 0) {
                    esPrimo = false;
                }
            }
        }
        if (esPrimo) {
            System.out.println("Es numero primo");
        } else {
            System.out.println(" No es numero primo");
        }


    }

}
