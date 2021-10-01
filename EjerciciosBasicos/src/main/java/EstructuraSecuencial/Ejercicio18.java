package EstructuraSecuencial;

import java.util.Scanner;
/*
Ejercicio 18
Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.
 */

public class Ejercicio18 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);


        System.out.println(" Introduce tu nombre ");
        String nombre = sc.nextLine();

        System.out.println(" Introduce primer apellido ");
        String apellido1 = sc.nextLine();

        System.out.println(" Introduce segundo apellido ");
        String apellido2 = sc.nextLine();

        String iniciales = nombre.substring(0,1)+ apellido1.substring(0,1)+ apellido2.substring(0,1);
        //toUpperCase(). delante de substring para que las iniciales salgan en mayusculas.

        System.out.println(" Las iniciales son: "+ iniciales);



    }
}

