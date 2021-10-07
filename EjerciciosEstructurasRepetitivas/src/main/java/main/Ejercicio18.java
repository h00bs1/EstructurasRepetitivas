package main;
import java.util.Scanner;

import static java.lang.Thread.*;

/*
Ejercicio 18
Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.
 */
public class Ejercicio18 {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        Ejercicio18 ejercicio18 = new Ejercicio18();
        ejercicio18.ejer18(sc);
    }
    public void ejer18(Scanner sc) throws InterruptedException {

        System.out.println(" El cronometro empieza en...3..., 2...., 1...");
        String horas = "0";
        String minutos = "0";
        String segundos = "0";

        for ( int i = 0; i<=23; i++) {
            for ( int j = 0; j <=59; j++){
                for ( int k = 0; k <=59; k++){

                    if ( i < 10) {
                        horas = "0" + i;
                    } else {
                        horas = "" + i;
                    }

                    if ( j < 10 ) {
                        minutos = "0" + j;
                    } else {
                        minutos = "" + j;
                    }

                    if ( k < 10 ) {
                        segundos = "0" + k;
                    } else {
                        segundos = "" + k;
                    }

                    System.out.println(horas +" : "+ minutos + " : " + segundos + " : ");
                    Thread.sleep (1000);

                }
            }
        }
    }
}
