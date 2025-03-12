package Ejercicio01_Contar_Vocales;
import java.util.Scanner;

public class Ejercicio01_Contar_Vocales {
	
	public static void contarVocales (String[]args) {
		
		//Creamos:
		Scanner sc = new Scanner (System.in); 					// Teclado
		String palabra="";					  					// String Palabra
		int cantidadVocales = 0;								// Contador de vocales
		String[] vocales = new String[] {"a","e","i","o","u"};	// Array de vocales
		
		//Pedimos que introduzca una palabra
		System.out.print("Introduzca una palabra: ");
		palabra = sc.nextLine().toLowerCase();
		
		//Si no introduce nada, muestra un error
		while(palabra.isEmpty()) {
		    System.out.println("La palabra no puede estar vacía.");
		    palabra = sc.nextLine().toLowerCase();
		}
		
		//Iteramos sobre la palaba
		for (int i=0;i<palabra.length(); i++) {
			//Convertimos la letra en la posicion "i" en un string
			String letraPalabra = String.valueOf(palabra.charAt(i));
			
			//Comprobamos si la letra es una vocal y si lo es aumentamos el contador
			for (String vocalActual : vocales) {
				if (letraPalabra.equals(vocalActual)) {
					cantidadVocales++;
				}
			}
		}
		
		//Mostramos la cantidad de vocales en esa palabra y cerramos el teclado
		System.out.print("La cantidad de vocales en '" + palabra + "' son: " +cantidadVocales);
		sc.close();
	}
	
	
	//Main
	public static void main(String[] args) {
		
		//Llamamos al metodo que permite contar vocales
		contarVocales(args);

	}

}
