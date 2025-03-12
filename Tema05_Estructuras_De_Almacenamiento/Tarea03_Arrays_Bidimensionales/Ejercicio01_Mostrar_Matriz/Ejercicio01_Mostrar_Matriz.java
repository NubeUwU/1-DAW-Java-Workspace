package Ejercicio01_Mostrar_Matriz;
public class Ejercicio01_Mostrar_Matriz {
	
	public static void main(String[] args) {
		
		//Creamos una matriz con datos
		int [][]matrizNumeros = {{0,4},{5,7},{9,2}};
		
		//Recorremos y mostramos los datos de la matriz
		for (int i = 0; i<3; i++) { // Filas
			
			for(int j = 0; j<2; j++) { // Columnas
			System.out.print(matrizNumeros[i][j]+" ");
		}
		//Hacemos un salto de linea entre cada fila
		System.out.println();
		}
	}

}
