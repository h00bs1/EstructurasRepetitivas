package main;
import java.util.Scanner;
/*
Ejercicio 12
Realizar un algoritmo para determinar cuánto ahorrará una persona en un año, si al final de
cada mes deposita cantidades variables de dinero; además, se quiere saber cuánto lleva
ahorrado cada mes.
 */
public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ejercicio12 ejercicio12 = new Ejercicio12();
        ejercicio12.ejer12(sc);

    }
    public void ejer12(Scanner sc){

        int cantidadAhorradaMes;
        int dineroSuma = 0;
        for (int i =1; i <=12; i++) {

            System.out.println("Introduce la cantidad ahorrada en el mes " + i);
            cantidadAhorradaMes = sc.nextInt();
            dineroSuma += cantidadAhorradaMes;
            System.out.println(" En " + i + " llevas acumulado " + dineroSuma + " euros");

        }


    }

}