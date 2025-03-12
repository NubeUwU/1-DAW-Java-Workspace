package Ejercicio03_Crear_Matriz_6x10;

public class Ejercicio03_Crear_Matriz_6x10 {

    //	Método para rellenar la matriz con números aleatorios entre 0 y 9
    public static void rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) { // Filas
            for (int j = 0; j < matriz[i].length; j++) { // Columnas
                matriz[i][j] = (int) (Math.random() * 10); // Genera un número aleatorio entre 0 y 9
            }
        }
    }

    
    //	Main
    public static void main(String[] args) {
        
    	// Creamos la matriz
        int[][] matrizNumeros = new int[6][10];

        // Llamamos al metodo para rellenar la matriz
        rellenarMatriz(matrizNumeros);

        // Recorremos y mostramos los datos de la matriz
        for (int i = 0; i < 6; i++) { // Filas
            for (int j = 0; j < 10; j++) { // Columnas
                // Mostramos la matriz
                System.out.print("[" + matrizNumeros[i][j] + "] ");
            }
            System.out.println(); // Salto de línea entre filas
        }
    }
}
