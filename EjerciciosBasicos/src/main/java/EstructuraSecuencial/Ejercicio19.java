package EstructuraSecuencial;

import java.util.Scanner;
/*
Ejercicio 19
Escribir un algoritmo para calcular la nota final de un estudiante, considerando que: por cada
respuesta correcta 5 puntos, por una incorrecta -1 y por respuestas en blanco 0.
Imprime el resultado obtenido por el estudiante.
 */

public class Ejercicio19 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Introduce el total de respuestas correctas ");
        int correctas = sc.nextInt();

        System.out.println(" Introduce las respuestas incorrectas ");
        int incorrectas = sc.nextInt();

        System.out.println(" Introduce las respuestas en blanco ");
        int enBlanco = sc.nextInt();

        double nota = ((5.0 * correctas) + ((-1) * incorrectas)) / ((correctas + incorrectas + enBlanco) * 5) * 10;

        System.out.println(" Tu nota final es " + nota);



    }
}

