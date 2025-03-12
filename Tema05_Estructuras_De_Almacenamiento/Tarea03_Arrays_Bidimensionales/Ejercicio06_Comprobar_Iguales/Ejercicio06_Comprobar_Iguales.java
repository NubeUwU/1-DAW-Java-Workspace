package Ejercicio06_Comprobar_Iguales;

import java.util.Scanner;

public class Ejercicio06_Comprobar_Iguales {

	//	Metodo para mostrar la matriz generada
    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("Matriz generada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+matriz[i][j] + "] ");
            }
            System.out.println();
        }
        System.out.println();
    }
	
    public static void repeticiones(int[][] matriz) {

    	// Filas
        for (int i = 0; i < matriz.length; i++) {
            boolean filaIgual = true;
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[i][0]) {
                    filaIgual = false; // Marcamos como false si no son iguales
                }
            }
            
            // Si todos los valores en la fila son iguales, se muestra por pantalla
            if (filaIgual) {
                System.out.println("Todos los valores de la fila " + (i + 1) + " son iguales.");
            }
        }

        
        
        // Columnas
        for (int j = 0; j < matriz[0].length; j++) {
            boolean columnaIgual = true;
            for (int i = 1; i < matriz.length; i++) {
                if (matriz[i][j] != matriz[0][j]) {
                    columnaIgual = false; // Marcamos como false si no son iguales
                }
            }
            
            // Si todos los valores en la columna son iguales, se muestra por pantalla
            if (columnaIgual) {
                System.out.println("Todos los valores de la columna " + (j + 1) + " son iguales.");
            }
        }
    }
    
    
    //	Main
	public static void main(String[] args) {
		
		//	Creamos:
		Scanner sc = new Scanner (System.in);	//	Teclado
		int[][] matriz = new int [3][3]; 		//	Matriz
		
		
		//	Pedimos que introduzca los valores para la matriz y los asignamos
		System.out.println("Introduzca valores para la siguiente matriz 3x3");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				System.out.print("Posicion ("+i+","+j+") : ");
				matriz[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		//	Llamamos al metodo para mostrar la matriz
		mostrarMatriz(matriz);
		
		//	Llamamos al metodo para mostrar si se repiten los valores
		repeticiones(matriz);
		
		//	Cerramos el teclado
		sc.close();
	}

}
