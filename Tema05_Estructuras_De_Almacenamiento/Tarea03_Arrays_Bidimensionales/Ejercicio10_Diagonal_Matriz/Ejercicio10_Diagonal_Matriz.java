package Ejercicio10_Diagonal_Matriz;

public class Ejercicio10_Diagonal_Matriz {

	//	Método para rellenar la matriz con la diagonal
	public static void rellenarDiagonal(int[][] matriz) {

	    for (int i = 0; i < matriz.length; i++) { // Filas
	        for (int j = 0; j < matriz[i].length; j++) { // Columnas
	            
	        	//	Si el valor de la fila coincide con la columna muestra un 1
	        	if(i == j) {
	            	matriz [i][j] = 1;
	            
	            //	Si no, muestra un 0
	            }else {
	            	matriz [i][j] = 0;
	            }
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
	
    
    //	Main
	public static void main(String[] args) {
		
		//	Creamos una matriz 10 x 10
		int[][] matriz = new int [10][10];
		
		//	Llamamos a los metodos que llenan la diagonal y la muestran
		rellenarDiagonal(matriz);
		mostrarMatriz(matriz);
		
			
	}

}
