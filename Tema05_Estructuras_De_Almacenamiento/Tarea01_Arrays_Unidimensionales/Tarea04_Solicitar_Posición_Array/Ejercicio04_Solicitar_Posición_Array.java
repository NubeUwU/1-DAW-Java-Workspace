package Tarea04_Solicitar_Posición_Array;

import java.util.Scanner;

public class Ejercicio04_Solicitar_Posición_Array {

	//Creamos un metodo que permita rellenar el array con números aleatorios entre 0 y 100
    public static void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
    }

    public static void main(String[] args) {        
    	//Creamos el teclado, el array y el atributo "i"
    	Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int i;

        //Llamamos al metodo que permite rellenar el array
        rellenarArray(array);

        //Realizamos un bucle do-while que permita preguntar varias veces el número que desea saber el usuario
        do {
            System.out.print("Introduzca el número del hueco del que quiere saber su valor (0-9)\n"
            		+ "Introduzca 10 para salir: ");
            i = sc.nextInt();
            
            //Si el valor no esta entre 0 y 9 muestra un error
            if (i >= 0 && i < 10) {
                System.out.println("El valor en la posición " + i + " es: " + array[i] + "\n");
            } else if (i != 10) {
                System.out.println("Error: número fuera de rango.\n");
            }

        //Si el número es 10, se cierra el programa    
        } while (i != 10);

        System.out.println("Fin del Programa");
        
        //Cerramos el teclado
        sc.close();
    }
}
