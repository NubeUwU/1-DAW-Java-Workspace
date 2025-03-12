package Ejercicio10_Acierta_La_Contraseña;

import java.util.Scanner;

public class Ejercicio10_Acierta_La_Contraseña {

	//	Metodo acertarcontrasenya
    public static void acertarContrasenya(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Creamos:
        String contrasenya = "";           // Contraseña
        String continuar = "S";           // Continuar
        String adivinar = "";            // Adivinar
        
        
        // Pedimos la contrasenya inicial a descubrir y la almacenamos
        System.out.print("Introduzca una contraseña: ");
        contrasenya = sc.nextLine().toLowerCase();
        
        // Imprime 50 líneas vacías para simular el borrado de la consola
        for (int i = 0; i < 50; i++) {  
            System.out.println();
        }

        
        // Se pide al usuario que introduzca su predicción hasta que la contrasenya tenga el mismo tamaño
        do {
            System.out.print("Introduzca su predicción: ");
            adivinar = sc.nextLine().toLowerCase();

            // Comparamos contrasenyas
            if (adivinar.length() < contrasenya.length()) {
                System.out.println("La contraseña es más grande");
            
            } else if (adivinar.length() > contrasenya.length()) {
                System.out.println("La contraseña es más pequeña");
            
            } else {
                System.out.println("Felicidades, la contraseña mide lo mismo");
                break; // Finaliza el programa
            }

            // Pregunta si desea continuar
            System.out.print("\n¿Desea continuar? (S/N): ");
            continuar = sc.nextLine().toUpperCase();

            // Validación de "continuar"
            while (!continuar.equals("S") && !continuar.equals("N")) {
                System.out.print("Error, debe escribir S ó N: ");
                continuar = sc.nextLine().toUpperCase();
            }

        } while (continuar.equalsIgnoreCase("S"));

        //	Fin del programa
        System.out.println("\nFin del programa");
        sc.close();
    }

    
    //	Main
    public static void main(String[] args) {
       
    	// Llamada al método acertarContrasenya
        acertarContrasenya(args);
    }
}
