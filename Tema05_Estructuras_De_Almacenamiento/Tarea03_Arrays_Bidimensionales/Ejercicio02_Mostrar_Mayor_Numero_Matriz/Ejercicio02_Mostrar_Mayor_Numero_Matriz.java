package Ejercicio02_Mostrar_Mayor_Numero_Matriz;

public class Ejercicio02_Mostrar_Mayor_Numero_Matriz {

	public static void main(String[] args) {
		
		//Creamos:
		int [][]matrizNumeros = new int[3][2];	 	 // Matriz
		int mayor = Integer.MIN_VALUE;				 // Mayor Numero
		int menor = Integer.MAX_VALUE;				 // Menor Numero
		int filaMayor = -1; 						 // Numero Mayor Fila
		int columnaMayor = -1;	 					 // Numero Mayor Columna
		int filaMenor = -1; 						 // Numero Menor Fila 
		int columnaMenor =-1;						 // Numero Menor Columna
		
		System.out.println("La matriz 3x2 es:");
		
		//Recorremos y mostramos los datos de la matriz
		for (int i = 0; i<3; i++) { // Filas
					
			for(int j = 0; j<2; j++) { // Columnas
				
				//Genera un numero aleatorio para esa posicion de la matriz
				matrizNumeros[i][j] = (int) (Math.random() * 10);
				
				//Mostramos la matriz
				System.out.print("["+matrizNumeros[i][j]+"] ");
				
				
				//Guarda el mayor y el menor numero de la matriz
				if(matrizNumeros[i][j]>mayor) {
					mayor = matrizNumeros [i][j];
					filaMayor = i;
					columnaMayor = j;
				}
				if(matrizNumeros[i][j]<menor) {
					menor = matrizNumeros [i][j];
					filaMenor = i;
					columnaMenor = j;
				}
			}
			//Salto de linea entre filas
			System.out.println();
			
		}
	
		
		//Mostramos cual es el mayor y el menor elemento de la matriz, y sus posiciones
		System.out.println("\nEl elemento de mayor valor es: " + mayor +"\n"
				+ "Se encuentra en la posicion: ("+filaMayor+","+columnaMayor+")");
		
		System.out.println("\nEl elemento de menor valor es: " + menor +"\n"
				+ "Se encuentra en la posicion: ("+filaMenor+","+columnaMenor+")");
	}
}

