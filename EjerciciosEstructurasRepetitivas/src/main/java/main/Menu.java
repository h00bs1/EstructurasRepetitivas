package main;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n----Menu ejercicio----\n" +
                "\nElige una de las opciones o pulsa 0 para salir\n" +
                "\t1.  Ejercicio 11\n" +
                "\t2.  Ejercicio 12\n" +
                "\t3.  Ejercicio 13\n" +
                "\t4.  Ejercicio 14\n" +
                "\t5.  Ejercicio 15\n" +
                "\t6.  Ejercicio 16\n" +
                "\t7.  Ejercicio 17\n" +
                "\t8.  Ejercicio 18\n" +
                "\t9.  Ejercicio 19\n" +
                "\t10. Ejercicio 20");

        int opcion = sc.nextInt();

        do {

            switch (opcion) {

                case 1:
                    Ejercicio11 ejercicio11 = new Ejercicio11();
                    ejercicio11.ejer11(sc);
                    break;

                case 2:
                    Ejercicio12 ejercicio12 = new Ejercicio12();
                    ejercicio12.ejer12(sc);
                    break;

                case 3:
                    Ejercicio13 ejercicio13 = new Ejercicio13();
                    ejercicio13.ejer13(sc);
                    break;

                case 4:
                    Ejercicio14 ejercicio14 = new Ejercicio14();
                    ejercicio14.ejer14(sc);
                    break;

                case 5:
                    Ejercicio15 ejercicio15 = new Ejercicio15();
                    ejercicio15.ejer15(sc);
                    break;

                case 6:
                    Ejercicio16 ejercicio16 = new Ejercicio16();
                    ejercicio16.ejer16(sc);
                    break;

                case 7:
                    Ejercicio17 ejercicio17 = new Ejercicio17();
                    ejercicio17.ejer17(sc);
                    break;

                case 8:
                    Ejercicio18 ejercicio18 = new Ejercicio18();
                    ejercicio18.ejer18(sc);
                    break;

                case 9:
                    Ejercicio19 ejercicio19 = new Ejercicio19();
                    ejercicio19.ejer19(sc);
                    break;

                case 10:
                    Ejercicio20 ejercicio20 = new Ejercicio20();
                    ejercicio20.ejer20(sc);
                    break;
            }

        } while(opcion != 0);
    }
}
