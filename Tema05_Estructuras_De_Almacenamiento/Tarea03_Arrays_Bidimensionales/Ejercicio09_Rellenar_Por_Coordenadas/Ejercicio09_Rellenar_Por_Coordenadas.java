package Ejercicio09_Rellenar_Por_Coordenadas;
import java.util.Scanner;

public class Ejercicio09_Rellenar_Por_Coordenadas {
	
	//	Metodo para rellenar la matriz
    public static void rellenarMatriz(int[][] matriz, Scanner sc) {
       
    	//	Creamos un bucle while que permita rellenar todas las posiciones
    	int valor = 1;
        while (valor <= 9) {
            System.out.println("¿Qué posición desea rellenar?");
            
            // Filas
            System.out.print("Fila: ");
            int i = sc.nextInt();

            // Validación Filas
            while (i < 0 || i >= matriz.length) {
                System.out.print("Error, el número de fila debe ser (0 | 1 | 2)\n" +
                        "Introduzca el número de la fila nuevamente: ");
                i = sc.nextInt();
            }

            // Columnas
            System.out.print("Columna: ");
            int j = sc.nextInt();

            // Validación Columnas
            while (j < 0 || j >= matriz[i].length) {
                System.out.print("Error, el número de columna debe ser (0 | 1 | 2)\n" +
                        "Introduzca el número de la columna nuevamente: ");
                j = sc.nextInt();
            }

            // Verificamos si la casilla está vacía y le asignamos un valor
            if (matriz[i][j] == 0) {
                matriz[i][j] = valor;  
                valor++; 				//	Aumenta el numero y la repeticion
                
            //	Si está ocupada muestra un mensaje y vuelve a empezar
            } else {
                System.out.println("La casilla ya está ocupada. Elija otra casilla.");
            }
        }
    }

    
    //	Método para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {
    	System.out.println("Matriz final:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(+matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    
    //	Main
    public static void main(String[] args) {
        
    	//	Creamos:
    	Scanner sc = new Scanner(System.in);	//	Teclado
        int[][] matriz = new int[3][3]; 		//	Matriz de 3x3

        //	Llamamos al metodo para rellenar la matriz
        rellenarMatriz(matriz, sc);

        // 	Llamamos al metodo para mostrar la matriz final
        mostrarMatriz(matriz);
    }
}
