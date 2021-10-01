package EstructurasAlternativas;
import java.util.Scanner;

/*
Ejercicio 13
Escribe un programa que pida una fecha (día, mes y año) y diga si es correcta.
 */

public class EjercicioMenu13a20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n----Menu ejercicio----\n" +
                "\nElige una de las opciones o pulsa 0 para salir\n"+
                "\t1. Ejercicio 9\n"+
                "\t2. Ejercicio 13\n"+
                "\t3. Ejercicio 14\n"+
                "\t4. Ejercicio 15\n"+
                "\t5. Ejercicio 16\n"+
                "\t6. Ejercicio 17\n"+
                "\t7. Ejercicio 18\n"+
                "\t8. Ejercicio 19\n"+
                "\t9. Ejercicio 20\n");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(" Algoritmo que pida tres números y los muestre ordenados (de mayor a menor)");
                System.out.println(" Introduce el primer numero ");
                int numero1 = sc.nextInt();

                System.out.println(" Introduce el segundo numero ");
                int numero2 = sc.nextInt();

                System.out.println(" Introduce el tercer numero ");
                int numero3 = sc.nextInt();

                if (numero1 > numero2 && numero1 > numero3) {
                    if (numero2 > numero3) ;

                    System.out.println(numero1 + "" + numero2 + "" + numero3);

                } else {
                    System.out.println();
                }
                break;
            case 2:
                System.out.println(" Escribe un programa que pida una fecha (día, mes y año) y diga si es correcta.");
                System.out.println(" Introduce el año ");
                int anio = sc.nextInt();

                System.out.println(" Introduce el mes ");
                int mes = sc.nextInt();

                System.out.println(" Introduce el dia ");
                int dia = sc.nextInt();

                if (anio > 1900 && anio < 2020) {
                    System.out.println(" El año elegido es correcto");

                } else if (mes > 1 && mes < 12) {
                    System.out.println(" El mes elegido es correcto");

                } else if (dia > 1 && dia < 31) {
                    System.out.println(" El dia elegido es correcto ");
                }
                System.out.println(" La fecha elegida es " + dia + "/" + mes + "/" + anio);

                break;

            case 3:
                System.out.println
                        (" \n La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se\n" +
                                " \t clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la venta del producto,\n" +
                                " \t ésta es de un solo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la\n" +
                                " \t uva que entrega en un embarque, considerando lo siguiente: si es de tipo A,\n" +
                                " \t se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de\n" +
                                " \t tamaño 2. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos\n" +
                                " \t cuando es de tamaño 2. Realice un algoritmo para determinar la ganancia obtenida.");

                System.out.println(" Introduce la cantidad de kilos de uva ");

                int kilouva = sc.nextInt();

                System.out.println(" Indica el tipo de uva, A o B ");
                int tipo = sc.nextInt();

                System.out.println(" Introduce el tamaño de uva 1 o 2 ?");
                int tamanio = sc.nextInt();


            case 4:
                System.out.println
                        ("\n El director de una escuela está organizando un viaje de estudios, y requiere determinar\n" +
                                "\t cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el\n" +
                                "\t servicio. La forma de cobrar es la siguiente: si son 100 alumnos o más, el costo por cada\n" +
                                "\t alumno es de 65 euros; de 50 a 99 alumnos, el costo es de 70 euros, de 30 a 49, de 95\n" +
                                "\t euros, y si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos." +
                                "\t Realice un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.\n");

                System.out.println(" Introduce la cantidad de alumnos que van a viajar ");
                int alumnos = sc.nextInt();

                if (alumnos <= 30)
                    System.out.println(" El precio del viaje sera de " + 4000);
                else if (alumnos >= 31 && alumnos <= 49)
                    System.out.println(" El precio del viaje sera de " + alumnos * 95);
                else if (alumnos >= 50 && alumnos <= 99)
                    System.out.println(" El precio del viaje sera de " + alumnos * 70);
                else if (alumnos > 100)
                    System.out.println(" El precio del viaje sera de " + alumnos * 65);
                break;

            case 5:
                System.out.println
                        ("\t  La política de cobro de una compañía telefónica es: cuando se realiza una llamada, el cobro \n" +
                                "\t  es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro, \n" +
                                "\t  los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, y a partir del décimo minuto, 50 céntimos.\n" +
                                "\t  Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de \n" +
                                "\t  mañana, 15 %, y en turno de tarde, 10 %. Realice un algoritmo para determinar cuánto debe \n" +
                                "\t  pagar por cada concepto una persona que realiza una llamada.");

                System.out.println(" Introduce el tiempo de la duración de la llamada en minutos ");
                int minutos = sc.nextInt();
                double precioMinutos = 1;


                if (minutos > 5) {
                    precioMinutos += 0.80;
                }
                if (minutos > 8) {
                    precioMinutos += 0.70;
                }
                if (minutos > 10) {
                    precioMinutos += 0.50;
                }
                System.out.println(" Cuando ha realizado la llamada. Indica la opción que corresponda" +
                        "\t 1. Domingo " +
                        "\t 2. Mañana " +
                        "\t 3. Tarde ");
                double impuestos = 0;

                int llamada = sc.nextInt();

                switch (llamada) {

                    case 1:
                        impuestos = precioMinutos * 0.03;
                        break;

                    case 2:
                        impuestos = precioMinutos * 0.15;
                        break;

                    case 3:
                        impuestos = precioMinutos * 0.30;
                        break;
                }
                double total = precioMinutos + impuestos;
                System.out.println(" Precio de llamada por minutos " + precioMinutos + " euros " +
                        " Impuestos: " + impuestos + " euros. \n + " +
                        " Precio total de la llamada: " + total);

            case 6:
                System.out.println(
                        "\t Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un \n" +
                        "\t dado de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.\n" +
                        "\t Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.\n" +
                        "\t Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto.”.\n");

                System.out.println(" Indica el resultado obtenido al lanzar un dado  ");

                int numero = sc.nextInt();

                String cara = "";

             switch (numero) {

                 case 1:
                     cara = "seis";
                     break;
                 case 2:
                     cara = " Cinco";
                     break;
                 case 3:
                     cara = " Cuatro ";
                     break;
                 case 4:
                     cara = " Tres ";
                     break;
                 case 5:
                     cara = " Dos";
                     break;
                 case 6:
                     cara = " Uno ";
                     break;

             }
             if (cara.equals("")) {
                 System.out.println(" Error: Numero incorrecto ");
             } else {
                 System.out.println(" En la cara opuesta es el " + cara);
             }

            case 7:
                System.out.println(
                        "\t Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente." +
                        "\t Si introducimos otro número nos da un error");

                int number = sc.nextInt();
                String diaSemana = "";

                switch (number) {

                    case 1:
                        diaSemana = " Lunes ";
                        break;
                    case 2:
                        diaSemana = " Martes ";
                        break;
                    case 3:
                        diaSemana = " Miercoles ";
                        break;
                    case 4:
                        diaSemana = " Jueves " ;
                        break;
                    case 5:
                        diaSemana = " Viernes ";
                        break;
                    case 6 :
                        diaSemana = " Sabado ";
                        break;
                    case 7 :
                        diaSemana = " Domingo";
                        break;
                }
                if (diaSemana.equals("")) {
                    System.out.println(" Ese numero es incorrecto");
                } else {
                    System.out.println(" El dia de la semana elegido es " +diaSemana);
                }

            case 8:
                System.out.println(
                        "\t Escribe un programa que pida un número entero " +
                        "\t entre uno y doce e imprima el número de \n" +
                        "\t días que tiene el mes correspondiente.");

                System.out.println(" Introduce un numero entre 1 y 12");
                int numDias = sc.nextInt();

                switch (numDias) {

                    case 1:
                        System.out.println(" Enero tiene 31 dias ");
                        break;
                    case 2:
                        System.out.println(" Febrero tiene 28 o 29 dias ");
                        break;
                    case 3:
                        System.out.println(" Marzo tiene 31 dias ");
                        break;
                    case 4:
                        System.out.println(" Abril tiene 30 dias ");
                        break;
                    case 5:
                        System.out.println(" Mayo tiene 31 dias ");
                        break;
                    case 6:
                        System.out.println(" Junio tiene 30 dias ");
                        break;
                    case 7:
                        System.out.println(" Julio tiene 31 dias ");
                        break;
                    case 8:
                        System.out.println(" Agosto tiene 31 dias ");
                        break;
                    case 9:
                        System.out.println(" Septiembre tiene 30 dias ");
                        break;
                    case 10:
                        System.out.println(" Octubre tiene 31 dias ");
                        break;
                    case 11:
                        System.out.println(" Noviembre tiene 30 dias ");
                        break;
                    case 12:
                        System.out.println(" Diciembre tiene 31 dias ");
                        break;

                        }
                        if (numDias >= 0 && numDias <= 13 ) {
                            System.out.println(" El numero introducido no es valido ");
                } else {
            }
            case 9 :
                System.out.println(
                        "\t Una compañía de transporte internacional tiene servicio en algunos países de América del \n" +
                        "\t Norte, América Central, América del Sur, Europa y Asia. El costo por el servicio de transporte \n" +
                        "\t se basa en el peso del paquete y la zona a la que va dirigido. Lo anterior se muestra en la tabla: " +
                        "\t Zona Ubicación Costo/gramo\n" +
                        "\t 1 América del Norte 24.00 euros\n" +
                        "\t 2 América Central 20.00 euros\n" +
                        "\t 3 América del Sur 21.00 euros\n" +
                        "\t 4 Europa 10.00 euros\n" +
                        "\t 5 Asia 18.00 euros\n" +
                        "\t Parte de su política implica que los paquetes con un peso superior a 5 kg no son \n" +
                        "\t transportados, esto por cuestiones de logística y de seguridad.\n" +
                        "\t Realice un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.\n");

                final int precioAmericaNorte = 24;
                final int precioAmericaCentral = 20;
                final int precioAmericaSur = 21;
                final int precioEuropa = 10;
                final int precioAsia = 18;



                System.out.println(" Introduce el peso del paquete en gramos ");
                int peso = sc.nextInt();

                if (peso <= 5000) {
                    System.out.println(" Introduce la zona a la que va dirigida: \n " +
                            "\t 1 América del Norte.\n" +
                            "\t 2 América Central.\n" +
                            "\t 3 América del Sur.\n" +
                            "\t 4 Europa.\n" +
                            "\t 5 Asia.\n ");

                    int precioEnvio = 0;
                    int zona = sc.nextInt();

                    switch (zona) {

                        case 1:
                            precioEnvio = peso * precioAmericaNorte;
                            break;
                        case 2:
                            precioEnvio = peso * precioAmericaCentral;
                            break;
                        case 3:
                            precioEnvio = peso * precioAmericaSur;
                            break;
                        case 4:
                            precioEnvio = peso * precioEuropa;
                            break;
                        case 5:
                            precioEnvio = peso * precioAsia;
                            break;
                    }
                    System.out.println("El precio de su envio es " + precioEnvio + " euros.\n" +
                            "Muchas gracias. ");
                } else {
                    System.out.println(" Paquete superior a 5 kg. Por seguridad, no podemos realizar su envio\n " +
                            "Disculpe las molestias. Gracias ");
                }
        }
    }
}
