package EstructuraSecuencial;

import java.util.Scanner;
/*
Ejercicio 12
Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano.
Calcula y muestra la distancia entre ellos.
 */

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1;
        int x2;
        int y1;
        int y2;
        double distancia;
        System.out.println(" Introduce el valor X del primero punto: ");
        x1 = sc.nextInt();
        System.out.println(" Introduce el valor Y del primero punto: ");
        y1 = sc.nextInt();
        System.out.println(" Introduce el valor X del segundo punto: ");
        x2 = sc.nextInt();
        System.out.println(" Introduce el valor Y del segundo punto: ");
        y2 = sc.nextInt();

        distancia = Math.sqrt(Math.pow((x2-x1), 2)+ Math.pow((y2-y1), 2));
        System.out.println(" La distancia entre ambos puntos es " + distancia);


    }
}
