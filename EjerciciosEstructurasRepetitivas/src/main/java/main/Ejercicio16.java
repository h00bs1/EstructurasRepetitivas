package main;
import java.util.Scanner;
/*
Ejercicio 16
Una empresa les paga a sus empleados con base en las horas trabajadas en la semana.
Realice un algoritmo para determinar el sueldo semanal de N trabajadores y, además,
calcule cuánto pagó la empresa por los N empleados.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ejercicio16 ejercicio16 = new Ejercicio16();
        ejercicio16.ejer16(sc);
    }
    public void ejer16(Scanner sc) {


        System.out.println(" Introduce numero de trabajadores que hay en la empresa ");
        int numTrabajadores = sc.nextInt();

        System.out.println(" Introduce la tarifa por hora ");
        double tarifa = sc.nextDouble();
        int horasAcumuladas = 0;

        for ( int i = 1; i <= numTrabajadores; i++) {

        System.out.println("\nHola trabajador numero " + i + ", indique el numero de dias que has trabajado: ");
        int dias = sc.nextInt();
        int horasTrabajador = 0;

        for( int j = 1; j <= dias; j++) {
            System.out.println(" Hola trabajador numero "+ i +", en el dia "+ j +", indique el número de horas que has trabajado ");
            int horas = sc.nextInt();
            horasTrabajador+=horas;
        }
            System.out.println(" El trabajador número " + i + " tiene de sueldo " + horasTrabajador * tarifa);
            horasAcumuladas+=horasTrabajador;

        }
        System.out.println(" El pago total de " +numTrabajadores + " trabajadores ha sido " + horasAcumuladas*tarifa);

    }

}
