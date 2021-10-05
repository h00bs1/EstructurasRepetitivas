package main;
import java.util.Scanner;
/*
Ejercicio 13
Una empresa tiene el registro de las horas que trabaja diariamente un empleado durante la
semana (seis días) y requiere determinar el total de éstas, así como el sueldo que recibirá
por las horas trabajadas.
*/
public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ejercicio13 ejercicio13 = new Ejercicio13();
        ejercicio13.ejer13(sc);

    }
    public void ejer13(Scanner sc) {

        System.out.println(" Introduce la tarifa por horas; ");
        double tarifa = sc.nextDouble();
        int horasAcumuladas = 0;

        for (int i = 1; i <=6; i++) {
            System.out.println(" Introduce la cantidad de horas trabajadas en el dia "+i);
            int horas = sc.nextInt();
            horasAcumuladas+=horas;
        }

        System.out.println(" En la semana has trabajado un total de  " + horasAcumuladas + " horas ");
        System.out.println(" Salario de la semana: "+horasAcumuladas*tarifa + " euros");




    }

}
