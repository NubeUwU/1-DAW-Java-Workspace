package Tarea02_CargarArrays;

import java.util.Scanner;

public class Ejercicio02_CargarArray {

    // Método para rellenar el array
    public static void rellenarArray(int[] array, Scanner sc) {
    	System.out.println("Introduzca los valores del siguiente array");
    	for (int i = 0; i < array.length; i++) {
            System.out.print("Introduzca el valor de la posición " + i + ": ");
            array[i] = sc.nextInt();
        }
    	System.out.println();
    }

    // Método para mostrar el contenido del array
    public static void mostrarArray(int[] array, String nombreArray) {
        System.out.print("El " + nombreArray + " es: {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            
            // Si es el último número del array, no añade la "," al final
            if (i < array.length - 1) {
                System.out.print(", ");
            }        }
        System.out.println("}");
        System.out.println();
    }

    public static void main(String[] args) {
        // Creamos el teclado
        Scanner sc = new Scanner(System.in);
    	
    	// Crea dos arrays de 5 elementos
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        // Llama al método para rellenar ambos arrays
        rellenarArray(array1, sc);
        rellenarArray(array2, sc);

        // Llama al método para mostrar ambos arrays
        mostrarArray(array1, "Array 1");
        mostrarArray(array2, "Array 2");

        // Cerramos el teclado al final
        sc.close();
    }
}
