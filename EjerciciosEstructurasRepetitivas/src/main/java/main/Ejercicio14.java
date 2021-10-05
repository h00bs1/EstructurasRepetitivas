package main;
import java.util.Scanner;
/*
Ejercicio 14
Una persona se encuentra en el kilómetro 70 de una carretera, otra se encuentra en el km
150, los coches tienen sentido opuesto y tienen la misma velocidad. Realizar un programa
para determinar en qué kilómetro de esa carretera se encontrarán.
 */
public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ejercicio14 ejercicio14 = new Ejercicio14();
        ejercicio14.ejer14(sc);
    }
    public void ejer14(Scanner sc) {

        int diferenciaKm = 150-70;
        double encuentro = 70+(diferenciaKm / 2.0);
        System.out.println(" Los coches se encontraran en el kilometro "+ encuentro);

    }
}
