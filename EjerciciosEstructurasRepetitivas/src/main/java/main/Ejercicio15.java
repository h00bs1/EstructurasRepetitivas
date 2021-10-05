package main;
import java.util.Scanner;
/*
Ejercicio 15
Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10 €, el
segundo 20 €, el tercero 40 € y así sucesivamente. Realizar un algoritmo para determinar
cuánto debe pagar mensualmente y el total de lo que pagó después de los 20 meses.
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ejercicio15 ejercicio15 = new Ejercicio15();
        ejercicio15.ejer15(sc);

    }
    public void ejer15(Scanner sc) {

        int mes = 0;
        double pago = 10;
        long pagoAcumulado = 0;
        for (int i = 1; i <= 20; i++){

            System.out.println(" Mes " + i + " ha pagado " + pago+ " euros");
            pagoAcumulado+=pago;
            pago*=2;
        }
        System.out.println(" Al final de los 20 meses tuvo que pagar: " + pagoAcumulado);
    }
}
