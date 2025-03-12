package Ejercicio07_Matriz_Transpuesta;

public class Ejercicio07_Matriz_Transpuesta {

	//	Método para rellenar la matriz con números aleatorios entre -9 y 9
	public static void rellenarMatriz(int[][] matriz) {

	    for (int i = 0; i < matriz.length; i++) { // Filas
	        for (int j = 0; j < matriz[i].length; j++) { // Columnas
	            matriz[i][j] = (int) (Math.random() * 19) - 9; // Genera un número aleatorio entre -9 y 9
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

    
    //	Metodo para mostrar la matriz tranpuesta
    public static void matrizTranspuesta(int[][] matriz) {
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("["+matriz[j][i] + "] ");
            }
            System.out.println();
        }
        System.out.println();
    }

	
    //	Main
	public static void main(String[] args) {
		
		//	Creamos un matriz 3x3
		int[][] matriz = new int [3][3];
		
		//	Llamamos a los metodos para rellenar y mostrar las matrices
		rellenarMatriz(matriz);
		mostrarMatriz(matriz);
		matrizTranspuesta(matriz);

	}

}
