package EstructuraSecuencial;

import java.util.Scanner;
/*
Ejercicio 10
Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha
calificación se compone de los siguientes porcentajes:
•55% del promedio de sus tres calificaciones parciales.
•30% de la calificación del examen final.
•15% de la calificación de un trabajo final.
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double parcial1;
        double parcial2;
        double parcial3;
        double parciales;
        double examen;
        double trabajo;
        double nota;
        System.out.println(" Indica la nota del primer parcial: ");
        parcial1 = sc.nextDouble();
        System.out.println(" Indica la nota del segundo parcial: ");
        parcial2 = sc.nextDouble();
        System.out.println(" Indica la nota del tercer parcial: ");
        parcial3 = sc.nextDouble();
        System.out.println(" Indica la nota del examen: ");
        examen = sc.nextDouble();
        System.out.println(" Indica la nota del trabajo final: ");
        trabajo = sc.nextDouble();

        parciales = (parcial1 + parcial2 + parcial3) / 3;
        nota = parciales * 0.55 + examen * 0.3 + trabajo * 0.15;
        System.out.println(" La nota final es de "+nota);


    }
}

