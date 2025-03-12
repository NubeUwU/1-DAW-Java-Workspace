package Ejercicio06_Comprobar_Iguales;

import java.util.Scanner;

public class Ejercicio06_Comprobar_Iguales {

    // Método para mostrar la matriz generada
    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("\nMatriz generada:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print("[" + valor + "] ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Método para mostrar la matriz actualizada
    public static void mostrarMatrizTemporal(int[][] matriz) {
        System.out.println("\nMatriz actual:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    System.out.print("[ ] "); 
                } else {
                    System.out.print("[" + matriz[i][j] + "] ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Método para llenar la matriz manualmente
    public static void llenarMatriz(int[][] matriz, Scanner sc) {
        System.out.println("Introduzca valores para la matriz 3x3:\n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese valor para la posición (" + i + "," + j + "): ");
                matriz[i][j] = sc.nextInt();
                mostrarMatrizTemporal(matriz); // Llama al metodo que actualiza la matriz
            }
        }
    }

    // Método que muestra si hay repeticiones en filas o columnas
    public static void repeticiones(int[][] matriz) {
    	
    	//	Creamos
        boolean hayFilasIguales = false;		//	Comprobacion filas iguales
        boolean hayColumnasIguales = false;		//	Comprobacion columnas iguales

        // Filas
        for (int i = 0; i < matriz.length; i++) {
            boolean filaIgual = true;
            int primerValor = matriz[i][0];

            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] != primerValor) {
                    filaIgual = false;
                    break;
                }
            }

            if (filaIgual) {
                System.out.println("Todos los valores de la fila " + (i + 1) + " son iguales.");
                hayFilasIguales = true;
            }
        }

        // Columnas
        for (int j = 0; j < matriz[0].length; j++) {
            boolean columnaIgual = true;
            int primerValor = matriz[0][j];

            for (int i = 1; i < matriz.length; i++) {
                if (matriz[i][j] != primerValor) {
                    columnaIgual = false;
                    break;
                }
            }

            if (columnaIgual) {
                System.out.println("Todos los valores de la columna " + (j + 1) + " son iguales.");
                hayColumnasIguales = true;
            }
        }

        // Si no hubo ninguna fila o columna con valores iguales, mostramos un mensaje
        if (!hayFilasIguales) {
            System.out.println("No hay filas con valores iguales.");
        }
        if (!hayColumnasIguales) {
            System.out.println("No hay columnas con valores iguales.");
        }
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        // Llamamos a los métodos
        mostrarMatrizTemporal(matriz);
        llenarMatriz(matriz, sc);

        // Mostramos la matriz final
        mostrarMatriz(matriz);
        repeticiones(matriz);

        // Cerramos el teclado
        sc.close();
    }
}
