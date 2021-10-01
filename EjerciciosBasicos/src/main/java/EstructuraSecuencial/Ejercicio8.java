package EstructuraSecuencial;

import java.util.Scanner;
/*
Ejercicio 8
Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, el
vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las tres
ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta su sueldo
base y comisiones.
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduce ventas realizadas ");
        int ventas = sc.nextInt();
        System.out.println(" Introduce tu sueldo base ");
        int sueldoBase = sc.nextInt();
        double comision = ventas * 0.10;
        double sueldo = sueldoBase+comision;
        System.out.println("sueldo " +sueldo);
    }
}
