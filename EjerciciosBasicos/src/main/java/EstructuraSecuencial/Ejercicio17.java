package EstructuraSecuencial;

import java.util.Scanner;
/*
Ejercicio 17
Un ciclista parte de una ciudad A, a las HH horas, MM minutos y SS segundos. El tiempo de
viaje hasta llegar a otra ciudad B es de T segundos. Escribir un algoritmo que determine la
hora de llegada a la ciudad B.
 */
public class Ejercicio17 {

    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Introduce la hora");
        int horaSalida = sc.nextInt();

        System.out.println(" Introduce los minutos ");
        int minutos = sc.nextInt();

        System.out.println(" Introduce los segundos ");
        int secs = sc.nextInt();

        System.out.println(" Introduce la duración del viaje en segundos ");
        int tiempo = sc.nextInt();

        secs = (horaSalida * 3600 + minutos * 60 + secs) + tiempo;

        int horasLlegada = secs / 3600;

        int secsRestantes = secs % 3600;

        minutos = secsRestantes / 60;

        secs = secsRestantes % 60;

        System.out.println(" La hora de llegada a la ciudad B sera: " + horasLlegada+ ":" + minutos+ ":"+ secs);

    }
}
