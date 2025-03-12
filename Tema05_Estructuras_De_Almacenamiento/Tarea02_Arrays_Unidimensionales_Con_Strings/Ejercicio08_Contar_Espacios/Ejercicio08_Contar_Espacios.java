package Ejercicio08_Contar_Espacios;
import java.util.Scanner;

public class Ejercicio08_Contar_Espacios {

	// Metodo para contar espacios en una frase
	public static void contarEspacios(String[] args) {
		
		// Creamos:
		Scanner sc = new Scanner (System.in);
		String frase;
		int contador = 0;
		
		// Pide una frase al usuario
		System.out.print("Introduzca una frase: ");
		frase = sc.nextLine();
		
		// Asigna la frase a un array
		String[] oracion = {frase};
		
		// Recorre el array y contamos los espacios
		for (int i = 0; i < oracion[0].length(); i++) {
            if (oracion[0].charAt(i) == ' ') {  
                contador++;                
            }
        }
		
		// Muestra la cantidad de espacios en esa frase
		System.out.print("\nEn la frase '"+frase+"' hay: "+contador+" espacios");
		sc.close();
		}
	
	
	// Main
	public static void main(String[] args) {
		
		// Llamada al metodo para contar espacios
		contarEspacios(args);
	}

}
