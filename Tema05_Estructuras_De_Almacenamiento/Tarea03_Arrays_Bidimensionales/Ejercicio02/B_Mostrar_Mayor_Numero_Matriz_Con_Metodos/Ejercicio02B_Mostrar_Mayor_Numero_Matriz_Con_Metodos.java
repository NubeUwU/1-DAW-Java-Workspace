package Ejercicio02.B_Mostrar_Mayor_Numero_Matriz_Con_Metodos;

public class Ejercicio02B_Mostrar_Mayor_Numero_Matriz_Con_Metodos {

    // Método para rellenar la matriz con números aleatorios entre 1 y 10
    public static void rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) { // Filas
        	
            for (int j = 0; j < matriz[i].length; j++) { // Columnas
                matriz[i][j] = (int) (Math.random() * 10); // Genera un número aleatorio entre 1 y 9
            }
        }
    }

    //Metodo que muestra los valores maximos y minimos, y sus posiciones
    public static void minmaxValores (int mayor, int filaMayor,int columnaMayor, int menor, int filaMenor, int columnaMenor){
        
    	// Mostramos cuál es el mayor y el menor elemento de la matriz, y sus posiciones
        System.out.println("\nEl elemento de mayor valor es: " + mayor + "\n"
                + "Se encuentra en la posición: (" + filaMayor + "," + columnaMayor + ")");

        System.out.println("\nEl elemento de menor valor es: " + menor + "\n"
                + "Se encuentra en la posición: (" + filaMenor + "," + columnaMenor + ")");
    }
    
    
    //Main
    public static void main(String[] args) {
        // Creamos:
        int[][] matrizNumeros = new int[3][2]; 	// Matriz 3x2
        int mayor = Integer.MIN_VALUE; 			// Mayor número
        int menor = Integer.MAX_VALUE; 			// Menor número
        int filaMayor = -1; 					// Fila del número mayor
        int columnaMayor = -1; 					// Columna del número mayor
        int filaMenor = -1; 					// Fila del número menor
        int columnaMenor = -1; 					// Columna del número menor

        
        System.out.println("La matriz 3x2 es:");

        // Llamamos al método que llena la matriz con números aleatorios
        rellenarMatriz(matrizNumeros);

        
        // Recorremos y mostramos los datos de la matriz
        for (int i = 0; i < 3; i++) { // Filas
            for (int j = 0; j < 2; j++) { // Columnas
                // Mostramos la matriz
                System.out.print("[" + matrizNumeros[i][j] + "] ");

                // Guarda el mayor y el menor número de la matriz
                if (matrizNumeros[i][j] > mayor) {
                    mayor = matrizNumeros[i][j];
                    filaMayor = i;
                    columnaMayor = j;
                }
                if (matrizNumeros[i][j] < menor) {
                    menor = matrizNumeros[i][j];
                    filaMenor = i;
                    columnaMenor = j;
                }
            }
            // Salto de línea entre filas
            System.out.println();
        }
        
        //Llamada al metodo que muestra los valores minimos, maximos y sus posiciones
        minmaxValores(mayor, filaMayor, columnaMayor, menor, filaMenor, columnaMenor);
  
    }
}
