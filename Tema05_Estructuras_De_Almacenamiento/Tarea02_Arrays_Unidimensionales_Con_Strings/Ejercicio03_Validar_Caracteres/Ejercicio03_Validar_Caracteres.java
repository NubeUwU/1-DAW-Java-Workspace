package Ejercicio03_Validar_Caracteres;
import java.util.Scanner;

public class Ejercicio03_Validar_Caracteres {
	
	//Metodo que permite contar las veces que se repite una letra
	public static void contarLetras (String[]args) {
		
		//Creamos:
		Scanner sc = new Scanner (System.in); 	// Teclado
		String frase="";					  	// String Palabra
		int cantidadRepeticiones = 0;			// Contador de vocales
		String letra="";						// Letra a buscar
		String continuar="";					// Atributo que repite el programa
		
		
		// Bucle que permite repetir el programa
		do {
			
		
		//Pedimos que introduzca una palabra
		System.out.print("Introduzca una frase: ");
		frase = sc.nextLine().toLowerCase();
		System.out.println();
		
		//Validacion frase
		while(frase.isEmpty()) {
	    	System.out.print("La frase no puede estar vacía\n"
	    			+ "Introduzca de nuevo la frase: ");
	    	frase = sc.nextLine().toLowerCase();
	    	System.out.println();
		}
		
		
		//Pedimos que introduzca una letra
		System.out.print("Introduzca la letra que quiere contabilizar: ");
		letra = sc.nextLine().toLowerCase();
		System.out.println();
		
		
		//Validacion letra
		while (letra.isEmpty()|| letra.length()!=1) {
			
			//Si la letra esta vacía
			if (letra.isEmpty()) { 
				System.out.print("La letra no puede estar vacía\n"
						+ "Introduzca de nuevo la letra: ");
				letra = sc.nextLine().toLowerCase();
				System.out.println();
			}
		   
			//Si la letra mide mas de 1 caracter:
			else if (letra.length()!=1) { 
				System.out.print("La letra debe tener solo 1 caracter\n"
						+ "Introduzca de nuevo la letra: ");
				letra = sc.nextLine().toLowerCase();
				System.out.println();
	   }
}	
	
		
		//Creamos el array con la letra a buscar	
		String[] vocales = {letra};
		
		//Iteramos sobre la frase
		for (int i=0;i<frase.length(); i++) {
			//Convertimos la letra en la posicion "i" en un string
			String letraPalabra = String.valueOf(frase.charAt(i));
			
			//Comprobamos si la letra es una vocal y si lo es aumentamos el contador
			for (String vocalActual : vocales) {
				if (letraPalabra.equals(vocalActual)) {
					cantidadRepeticiones++;
				}
			}
		}
		
		//Mostramos la cantidad de vocales en esa palabra y cerramos el teclado
		System.out.print("La letra '"+letra+"' en la frase '" + frase + "' se repite: " +cantidadRepeticiones +" veces");
		
		// Continuar con el programa
		System.out.print("\n¿Quieres continuar? ('S' para seguir, cualquier otra tecla para salir): ");
		continuar = sc.nextLine().toUpperCase();
		
		}while(continuar.equals("S"));
		
		//Fin del programa
		System.out.println("Fin del programa");
		
		//Cerramos teclado
		sc.close();
	}
	
	
	//Main
	public static void main(String[] args) {
		
		//Llamamos al metodo que permite contar vocales
		contarLetras(args);

	}

}
