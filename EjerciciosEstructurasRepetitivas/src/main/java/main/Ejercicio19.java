package main;
import java.util.Locale;
import java.util.Scanner;
/*
Ejercicio 19
Realizar un ejemplo de menú, donde podemos escoger las
distintas opciones hasta que seleccionamos la opción de “Salir”.
 */
public class Ejercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ejercicio19 ejercicio19 = new Ejercicio19();
        ejercicio19.ejer19(sc);
    }
    public void ejer19(Scanner sc){
        String opcion ="";
        do {
            System.out.println(" Menu de Opciones. Indique Opcion Salir si quiere salir del ejercicio");
            System.out.println("1. Ejercicio 1 \2. Ejercicio 2  \3. Ejercicio 3  \4. Ejercicio 4  \5. Ejercicio 5 \6. Salir. ");
            opcion = sc.nextLine();
        } while (!opcion.toUpperCase().equals("SALIR"));
        System.out.println("Hasta luego");

    }
}
