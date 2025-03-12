package Ejercicio11_Suma_Diagonales;

public class Ejercicio11_Suma_Diagonales {

	//	Método para rellenar la matriz
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
        for (int i = 0; i < matriz.length; i++) { // Filas
            for (int j = 0; j < matriz[i].length; j++) { // Columas
                System.out.print("["+matriz[i][j] + "] ");
            }
            System.out.println();
        }
        System.out.println();
    }

    
    //	Metodo para sumar las diagonales
	public static void sumaDiagonales (int[][] matriz) {
		
		//	Creamos:
		int sumaDiagonal1 = 0;	//	Diagonal Principal
		int sumaDiagonal2 = 0;	//	Diagonal Segundaria
		
		
		//	Suma Diagonal Principal
		for (int i = 0; i < matriz.length; i++) {
		    sumaDiagonal1 += matriz[i][i];
		}
		
		// Suma Diagonal Secundaria
		for (int i = 0; i < matriz.length; i++) {
		    sumaDiagonal2 += matriz[i][matriz.length - 1 - i];
		}

		
		//	Mostramos las sumas de las diagonales
		System.out.println("La suma de la diagonal principal es: "+sumaDiagonal1);
		System.out.println("La suma de la diagonal secundaria es: "+sumaDiagonal2);

	}
	
	
	//	Main
	public static void main(String[] args) {
		
		//	Creamos una matriz 5x5
		int [][] matriz = new int [5][5];
		
		//	Llamamos al metodo que llena la matriz y al que suma sus diagonales
		rellenarMatriz(matriz);
		mostrarMatriz(matriz);
		sumaDiagonales(matriz);

	}

}
