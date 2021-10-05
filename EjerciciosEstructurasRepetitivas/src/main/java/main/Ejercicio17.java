package main;
import java.util.Scanner;
/*
Ejercicio 17
Una empresa les paga a sus empleados con base en las horas trabajadas en la semana.
Para esto, se registran los días que trabajó y las horas de cada día.
Realice un algoritmo para determinar el sueldo semanal de N trabajadores
y además calcule cuánto pagó la empresa por los N empleados.
 */
public class Ejercicio17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ejercicio17 ejercicio17 = new Ejercicio17();
        ejercicio17.ejer17(sc);
    }
    public void ejer17(Scanner sc) {

        System.out.println(" Indique el numero de trabajadores que tiene la empresa: ");
        int numTrabajadores = sc.nextInt();
        System.out.println(" Indique la tarifa por horas ");
        double tarifaHora = sc.nextDouble();
        int horasAcumuladas = 0;

        for (int i = 1; i <= numTrabajadores; i++){
            System.out.println("\n Hola trabajador numero " +i+ ", indica el número de dias que has trabajado: ");
            int dias = sc.nextInt();
            int horasTrabajador = 0;

            for (int j = 1; j <= dias; j++) {
                System.out.println(" Hola trabajador numero "+i+ " en el dia "+j+", indique el numero de horas que has trabajado: ");
                int horas = sc.nextInt();
                horasTrabajador+=horas;
            }
            System.out.println(" El trabajador número " +i+ " tiene de sueldo " + horasTrabajador*tarifaHora);
            horasAcumuladas+=horasTrabajador;
        }
        System.out.println(" El pago total de " + numTrabajadores+ " trabajadores ha sido " + horasAcumuladas*tarifaHora);
    }
}
