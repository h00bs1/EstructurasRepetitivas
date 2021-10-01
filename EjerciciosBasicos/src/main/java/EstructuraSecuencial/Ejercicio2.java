package EstructuraSecuencial;

import java.util.Scanner;

/*
Ejercicio 2
Calcular el perímetro y área de un rectángulo dada su base y su altura.
 */

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Introduce la base ");
        int base = sc.nextInt();
        System.out.println(" Introduce su altura ");
        int altura = sc.nextInt();
        int area = base*altura;
        int perimetro = 2*altura+2*base;
        System.out.println(" El perimetro es " +perimetro+ " y el area es " +area);

    }
}

