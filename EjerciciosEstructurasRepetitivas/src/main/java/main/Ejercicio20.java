package main;
import java.util.Scanner;
/*
Ejercicio 20
Mostrar en pantalla los N primero número primos. Se pide por teclado
la cantidad de números primos que queremos mostrar.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio20 ejercicio20 = new Ejercicio20();
        ejercicio20.ejer20(sc);
    }
    public void ejer20(Scanner sc){
        System.out.println(" Cuantos numero primos quieres mostrar ");
        int numero = sc.nextInt();
        int cantidadPrimos = 0;
        int numeroInicio = 2;
        while (cantidadPrimos < numero) {

            int contador = 0;
            for ( int i = 2; i <= numeroInicio; i++) {
                if (numeroInicio % i == 0) {
                    contador++;
                }
            }
            if (contador == 1) {
                System.out.println(numeroInicio + ", ");
                cantidadPrimos++;
            }
            numeroInicio++;
        }
        }
    }

