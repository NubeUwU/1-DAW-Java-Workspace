package Ejercicio13_Modifficar_Arrays;
import java.util.Scanner;

public class Ejercicio13_Modificar_Arrays {

    //	Main
    public static void main(String[] args) {
        
        //	Creamos:
        Scanner sc = new Scanner(System.in);    //	Teclado
        String cadena1 = "";                     //	Cadena 1
        String cadena2 = "";                     //	Cadena 2
        int numero = 0;                          //  Numero
        
        //	Pedimos dos cadenas de caracteres y la posición desde la que se quiere introducir la segunda en la primera
        System.out.println("Introduzca dos cadenas de caracteres");
        System.out.print("Cadena 1: ");
        cadena1 = sc.nextLine();
        System.out.print("Cadena 2: ");
        cadena2 = sc.nextLine();

        System.out.print("Introduzca el número del caracter desde el que quiere insertar la cadena 2 en la cadena 1: ");
        numero = sc.nextInt();

        // Verificamos que el número no sea mayor que la longitud de cadena 1
        while (numero < 0 || numero > cadena1.length()) {
            System.out.print("\nError, el número introducido no puede ser menor que 0 o mayor que la longitud de la primera cadena.\n"
                             + "Longitud de la cadena 1: " + cadena1.length() + "\nIntentelo de nuevo: ");
            numero = sc.nextInt();
            System.out.println();
        }

        
        //	Creamos un array con la longitud de las dos cadenas
        String arrayFinal[] = new String[(cadena1.length() + cadena2.length())];
        
        
        //	Concatenamos las cadenas y mostramos el resultado
        System.out.print("\nLa nueva cadena es { ");
        for (int i = 0; i < arrayFinal.length; i++) {
            if (i < numero) {
                arrayFinal[i] = String.valueOf(cadena1.charAt(i));
            } else if (i < numero + cadena2.length()) {
                arrayFinal[i] = String.valueOf(cadena2.charAt(i - numero));
            } else {
                arrayFinal[i] = String.valueOf(cadena1.charAt(i - cadena2.length()));
            }
            
            //	Evitamos la coma al final del último caracter
            if (i < arrayFinal.length - 1) {
                System.out.print(arrayFinal[i] + " , ");
            } else {
                System.out.print(arrayFinal[i]);
            }
        }
        
        System.out.println(" }");
        
        //Finalizamos el programa
        System.out.println("Fin del programa");
        sc.close();
    }
}
