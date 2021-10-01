package EstructuraSecuencial;

import java.util.Scanner;
/*
Ejercicio 16
Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados por una
distancia d. El que está detrás viaja a una velocidad mayor. Se pide hacer un algoritmo para
ingresar la distancia entre los dos vehículos (km) y sus respectivas velocidades (km/h) y con
esto determinar y mostrar en que tiempo (minutos) alcanzará el vehículo más rápido al otro.
 */

public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Introduce la distancia en que se encuentran los dos vehiculos ");
        int distancia = sc.nextInt();

        System.out.println(" Velocidad en Km/h del vehiculo 1 lento.");
        int velocidad1 = sc.nextInt();

        System.out.println(" Velocidad en Km/h del vehiculo 2 rapido.");
        int velocidad2 = sc.nextInt();

        int minutosAlcanzar = distancia / (velocidad2-velocidad1)*60;


        System.out.println( " Los vehiculos coincidirán " + minutosAlcanzar + " minutos.");



    }
}

