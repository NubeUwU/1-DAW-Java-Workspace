package Ejercicio07_Longitud_Array;
import java.util.Scanner;
public class Ejercicio07_Longitud_Array {

	// Metodo para comparar la longitud
	public static void compararLongitud(String[] args) {
		
		// Creamos:
		Scanner sc = new Scanner (System.in);
		String palabra1;					
		String palabra2;
		
		
		// Solicitamos las dos palabras
		do {
			System.out.print("Introduzca la primera palabra: ");
			palabra1 = sc.nextLine().trim();

			// Validamos que la palabra no esté vacía
			if (palabra1.isEmpty()) {
				System.out.println("La palabra no puede estar vacía. Por favor ingrese una palabra válida.\n");
				continue;
			}

			// Validamos que la palabra contenga solo letras
			if (!palabra1.matches("[a-zA-Z]+")) {
				System.out.println("La palabra solo puede contener letras. Por favor ingrese una palabra válida.\n");
			}
			
		} while (palabra1.isEmpty() || !palabra1.matches("[a-zA-Z]+"));
		
		
		// Validaciónes para la segunda palabra
		do {
			System.out.print("Introduzca la segunda palabra: ");
			palabra2 = sc.nextLine().trim();

			// Validamos que la palabra no esté vacía
			if (palabra2.isEmpty()) {
				System.out.println("La palabra no puede estar vacía. Por favor ingrese una palabra válida\n");
			}

			// Validamos que la palabra contenga solo letras
			if (!palabra2.matches("[a-zA-Z]+")) {
				System.out.println("La palabra solo puede contener letras. Por favor ingrese una palabra válida.\n");
			}
			
		} while (palabra2.isEmpty() || !palabra2.matches("[a-zA-Z]+"));
		
		
		// Creamos Arrayss con las longitudes de las palabras
		String[] stringPalabra1 = new String[palabra1.length()];
		String[] stringPalabra2 = new String[palabra2.length()];
		
		
		// Comparamos la longitud de los strings y mostramos el resultado
		if(stringPalabra1.length>stringPalabra2.length) {
			System.out.println("\nLa palabra '" +palabra1+ "' es mas larga que la palabra '" + palabra2 + "'.");
		
		}else if(stringPalabra2.length>stringPalabra1.length){
			System.out.println("\nLa palabra '" +palabra2+ "' es mas larga que la palabra '" + palabra1 +"'.");
		
		}else {
			System.out.println("\nLas palabras '" +palabra1+ "' y '" + palabra2 +"' tienen la misma longitud.");
		}

		// Cerramos el teclado
		sc.close();
	}
	
	
	// Main
	public static void main(String[] args) {
	
		// Llamamos al metodo compararLongitudes
		compararLongitud(args);
		
	}

}
