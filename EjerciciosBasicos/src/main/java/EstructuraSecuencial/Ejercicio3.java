package EstructuraSecuencial;
import java.util.Scanner;
/*
Ejercicio 3
Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
 */


public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduce el primer cateto ");
        int cat1 = sc.nextInt();
        System.out.println(" Introduce el segundo cateto ");
        int cat2 = sc.nextInt();
        sc.nextLine();
        double hipotenusa = Math.hypot(cat1, cat2);
        System.out.println(" La hipotenusa de los catetos es " +hipotenusa);

    }
}
