package Ejercicio05_SumaFilas_SumaColumnas;

import java.util.*;

public class Ejercicio05_SumaFilas_SumaColumnas {

	//	Método para rellenar la matriz con números aleatorios entre 0 y 9
    public static void rellenarMatriz(int[][] matriz) {
    	
        for (int i = 0; i < matriz.length; i++) { // Filas
            for (int j = 0; j < matriz[i].length; j++) { // Columnas
                matriz[i][j] = (int) (Math.random() * 10); // Genera un número aleatorio entre 0 y 9
            }
        }
    }
    
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

	
    //	Main
	public static void main(String[] args) {
		
		//	Creamos dos arrays que almacenen las sumas de las filas y las columnas
		int [] sumaFilas = new int [3];
		int [] sumaColumnas = new int [4];
		int suma = 0;
		
		//	Creamos la matriz
        int[][] matrizNumeros = new int[3][4];

        //	Llamamos al metodo para rellenar la matriz
        rellenarMatriz(matrizNumeros);
        
        //	Llamamos al metodo para mostrar la matriz
        mostrarMatriz(matrizNumeros);
        
        
        //	Suma de las Filas
        for (int i = 0; i < 3; i++) {
        	suma=0;
        	for (int j = 0; j < 4; j++) {
        		suma+=(matrizNumeros[i][j]);
        	}
        	sumaFilas[i] = suma;
        }
        
        
        //	Suma de las Columnas
        for (int j = 0; j < 4; j++) {
        	suma=0;
        	for (int i = 0; i < 3; i++) {
        		suma+=(matrizNumeros[i][j]);
        	}
        	sumaColumnas[j] = suma;
        }
        
        //Mostramos las sumas con un array
        System.out.println("Suma de las filas: " + Arrays.toString(sumaFilas));
        System.out.println("Suma de las columnas: " + Arrays.toString(sumaColumnas));
	}
}
