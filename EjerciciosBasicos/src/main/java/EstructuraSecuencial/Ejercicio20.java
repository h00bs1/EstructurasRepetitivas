package EstructuraSecuencial;

import java.util.Scanner;
/*
Ejercicio 20
Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos) después de
pedirnos cuantas monedas tenemos (de 2€, 1€, 50 céntimos, 20 céntimos o 10 céntimos).
 */

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dosEuros;
        int unEuro;
        int fiftyCent;
        int veinteCent;
        int diezCent;

        System.out.println(" Introduce las monedas de 2 €: ");
        dosEuros = sc.nextInt();

        System.out.println(" Introduce las monedas de 1 €: ");
        unEuro = sc.nextInt();

        System.out.println(" Introduce las monedas de 50 centimos: ");
        fiftyCent = sc.nextInt();

        System.out.println(" Introduce las monedas de 20 centimos: ");
        veinteCent = sc.nextInt();

        System.out.println(" Introduce las monedas de 10 centimos: ");
        diezCent = sc.nextInt();

        int totalCents = ((dosEuros * 200) + (unEuro * 100) + (fiftyCent *50) + (veinteCent * 20) + (diezCent *10));
        int numeroEuros = totalCents/100;
        int numeroCent = totalCents%100;

        System.out.println( " Tienes " +numeroEuros+ " euros y " +numeroCent+ " centimos. ");
    }
}

