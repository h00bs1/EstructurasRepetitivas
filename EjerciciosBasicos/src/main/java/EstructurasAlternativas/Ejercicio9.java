package EstructurasAlternativas;
import java.util.Scanner;
/*
Ejercicio 9
Algoritmo que pida tres números y los muestre ordenados (de mayor a menor);
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Introduce el primer numero ");
        int numero1 = sc.nextInt();

        System.out.println(" Introduce el segundo numero ");
        int numero2 = sc.nextInt();

        System.out.println(" Introduce el tercer numero ");
        int numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3)
        {
            if (numero2 > numero3);

            System.out.println(numero1+"" + numero2+""+numero3);

        }
        else {
            System.out.println();
        }

    }

}
