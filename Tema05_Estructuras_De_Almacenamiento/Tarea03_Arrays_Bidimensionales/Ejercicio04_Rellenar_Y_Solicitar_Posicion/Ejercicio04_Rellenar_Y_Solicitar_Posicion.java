package Ejercicio04_Rellenar_Y_Solicitar_Posicion;
import java.util.Scanner;

public class Ejercicio04_Rellenar_Y_Solicitar_Posicion {

    // Método para rellenar la matriz
    public static void rellenarMatriz(int[][] matriz, Scanner sc) {
     
    	// Pedimos los valores de la matriz
        System.out.println("Rellene las siguientes posiciones de la matriz 3x2");
        for (int i = 0; i < matriz.length; i++) { // Filas
            for (int j = 0; j < matriz[i].length; j++) { // Columnas
                System.out.print("Valor de la posición (" + i + "," + j + ") : ");
                matriz[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        //	Limpiamos el buffer
        sc.nextLine();
    }

    
    
    //	Método para ver el valor de una posición de la matriz
    public static void valorPosicion(int[][] matriz, Scanner sc, String continuar) {
        do {
            System.out.println("\n¿Qué posición desea consultar?");
            
            //	Fila
            System.out.print("Fila: ");
            int i = sc.nextInt();
          
            //	Validacion Fila
            while (i < 0 || i >= matriz.length) {
                System.out.print("Error, el número de fila debe ser (0 | 1 | 2)\n" +
                        "\nIntroduzca el número de la fila nuevamente: ");
                i = sc.nextInt();
            }
            
            
            //	Columna
            System.out.print("\nColumna: ");
            int j = sc.nextInt();
            
            //	Validacion Columna
            while (j < 0 || j >= matriz[i].length) {
                System.out.print("Error, el número de columna debe ser (0 | 1)\n" +
                        "\nIntroduzca el número de la columna nuevamente: ");
                j = sc.nextInt();
            }
            
            
            sc.nextLine();  // Limpiamos el buffer

            System.out.println("El valor de la matriz en la posición (" + i + "," + j + ") es: " + matriz[i][j]);

            System.out.print("¿Desea consultar otra posición? (S/N): ");
            continuar = sc.nextLine().toUpperCase();

            
            //	Validación de "continuar"
            while (!continuar.equals("S") && !continuar.equals("N")) {
                System.out.print("Error, debe escribir S ó N: ");
                continuar = sc.nextLine().toUpperCase();
            }

        } while (continuar.equals("S"));
    }

    
    
    // Main
    public static void main(String[] args) {
       
    	// Creamos:
        Scanner sc = new Scanner(System.in); 	// Teclado
        int[][] matriz = new int[3][2]; 		// Matriz 3x2

        // Método para rellenar la matriz
        rellenarMatriz(matriz, sc);

        
        // Preguntamos si desea comprobar el valor de alguna posición
        System.out.print("¿Desea comprobar alguna posición? (S/N): ");
        String continuar = sc.nextLine().toUpperCase();

        // Validación de "continuar"
        while (!continuar.equals("S") && !continuar.equals("N")) {
            System.out.print("Error, debe escribir S ó N: ");
            continuar = sc.nextLine().toUpperCase();
        }

        // Si desea comprobar alguna posición, le enviamos al método valorPosicion
        if (continuar.equals("S")) {
            
        	//	Llamamos al metodo valorPosicion
            valorPosicion(matriz, sc, continuar);
        }

        // En caso contrario, finaliza el programa
        System.out.println("\nFin del Programa");
        
        // Cerramos el teclado
        sc.close();
    }
}
