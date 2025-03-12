package Ejercicio01_Almacenar_Numeros_Aleatorios;

import java.util.Arrays;

public class Ejercicio01_Almacenar_Numeros_Aleatorios {

	
	// Método para rellenar la matriz con números aleatorios entre 0 y 20
    public static void rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) { // Filas
        	
            for (int j = 0; j < matriz[i].length; j++) { // Columnas
                matriz[i][j] = (int) (Math.random() * 21); // Genera un número aleatorio entre 0 y 20
            }
        }
    }
    
    
    
    //	Metodo para mostrar la matriz generada
    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("Matriz generada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+matriz[i][j] + "]\t ");
            }
            System.out.println();
        }
        System.out.println();
    }

    
    
    //	Metodo para sumar los numeros de la matriz
    public static void sumarMatriz(int[][] matriz) {
    	
    	//	Creamos una variable que guarde la suma
    	int sumaTotal = 0;
    	
    	//	Recorremos toda la matriz y sumamos sus contenidos
    	for (int i = 0; i < matriz.length; i++) {
    		
    		for (int j = 0; j < matriz[0].length; j++) {
    			sumaTotal += matriz[i][j];
    		}
    	}
    	
    	//	Mostramos el resultado
    	System.out.println("\nLa suma de todos los componentes de la matriz es: "+sumaTotal);
    }
    
    
    
    //	Metodo para encontrar el mayor número
    public static void mayorValor(int[][] matriz) {
    	
    	//	Creamos:
        int mayor = Integer.MIN_VALUE;		//	Mayor valor
        int filaMayor = -1, colMayor = -1;	//	Posicion mayor valor

        //	Recorremos la matriz para encontrar el mayor y el menor número
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    filaMayor = i;
                    colMayor = j;
                }
            }
        }
       
        //	Mostramos los resultados
        System.out.println("El mayor número de la matriz es el '" + mayor + "' en la posición (" + filaMayor + ", " + colMayor + ")");
}
	
    
    
    //	Metodo para sumar filas
    public static void sumaFila(int[][] matriz) {

    	//	Creamos un array que almacene la suma de las filas
		int [] sumaFilas = new int [matriz.length];
		int suma = 0;
		
		//	Sumamos las filas y asignamos el valor de cada suma a un array
        for (int i = 0; i < matriz.length; i++) {	//	Filas
        	
        	//Reiniciamos suma a 0
        	suma=0;
        	
        	for (int j = 0; j < matriz[0].length; j++) {	//	Columnas
        		suma+=(matriz[i][j]);
        	}
        	sumaFilas[i] = suma;
        }
        	System.out.println("\nLa suma de los valores de cada una de las filas es: "+Arrays.toString(sumaFilas));
    	}
    
    
    
    //	Metodo para sumar columnas
    public static void sumaColumna(int[][] matriz) {
    	 int[] sumaColumnas = new int[matriz[0].length];
         int suma;

         // Sumamos las columnas y asignamos el valor de cada suma a un array
         for (int j = 0; j < matriz[0].length; j++) { // Columnas
             suma = 0; // Reiniciamos suma a 0

             for (int i = 0; i < matriz.length; i++) { // Filas
                 suma += matriz[i][j];
             }
             sumaColumnas[j] = suma;
         }

         // Recorremos el array con un for-each para encontrar el máximo y su índice
         int maxNumero = sumaColumnas[0];
         int numColumna = 0;
         int indice = 0;
         
         for (int num : sumaColumnas) {
             if (num > maxNumero) {
                 maxNumero = num;
                 numColumna = indice;
             }
             indice++;
         }

         // Imprimimos los resultados
         System.out.println("La suma de los valores de cada una de las columnas es: " + Arrays.toString(sumaColumnas));
         System.out.println("El valor máximo de la suma de los valores de cada columna es '" + maxNumero + "' y pertenece a la columna número: " + numColumna);
     }
    
    
    
    //	Metodo que calcula cantidad de menores mayores e iguales que 10
    public static void menorMayorIgual(int [][] matriz) {
    	
    	//	Creamos
    	int menor = 0;	//	Cantidad menores de 10
    	int mayor = 0;	//	Cantidad mayores de 10
    	int igual = 0;	//	Cantidad de 10
    	
    	//	Iteramos sobre el array y sumamos la cantidad de valores menores, mayores o iguales a 10
    	for (int i = 0; i < matriz.length; i++) {
    		for (int j = 0; j < matriz[0].length; j++) {
    			if (matriz[i][j] < 10) {
    				menor++;
    				
    			}	else if(matriz[i][j] > 10) {
        			mayor++;
        				
    			}	else if (matriz[i][j] == 10) {
    				igual++;
    		}
    	}
    }
    	//	Mostramos los resultados
    	System.out.println("\nValores comparados a 10:");
    	System.out.println("Hay '"+menor+"' valores menores de 10");
    	System.out.println("Hay '"+mayor+"' valores mayores de 10");
    	System.out.println("Hay '"+igual+"' valores iguales a 10");
}   
    
    
    
    //	Main
	public static void main(String[] args) {
		
		//	Creamos la matriz
		int [][] matriz = new int [10][10];
		
		//	Llamamos a:
		rellenarMatriz(matriz);		//	Metodo para llenar la matriz
		
		mostrarMatriz(matriz);		//	Metodo que muestra la matriz
		
		sumarMatriz(matriz);		//	Metodo que suma los componentes de la matriz
			
		mayorValor(matriz);			//	Metodo que busca el componente con mayor valor
		
		sumaFila(matriz);			//	Metodo que suma las filas
		
		sumaColumna(matriz);		//	Metodo que suma las columnas
		
		menorMayorIgual(matriz);	//	Metodo que compara los valores con "10"
	}

}
