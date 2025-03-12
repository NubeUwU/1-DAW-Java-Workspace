package Ejercicio05_Cambiar_Espacios;
import java.util.Scanner;

public class Ejercicio05_Cambiar_Espacios {
	
	// Creamos el metodo espacios
	public static void espacios(String[] args) {
		
		// Creamos:
		Scanner sc = new Scanner (System.in);	// Tecladoo
		String frase = "";						// Atributo "frase"
		
		
		// Pedimos una frase, la almacenamos y creamos un string del mismo tamaño
				System.out.print("Introduzca una frase: ");
				frase = sc.nextLine();
				String[] stringFrase = new String[frase.length()];
				
				
				// Llenamos el String con los valores de num
				for (int i = 0; i<frase.length();i++) {
					
					if(String.valueOf(frase.charAt(i)).equals(" ")){
						stringFrase [i] = "-";
						
					} else {
						stringFrase [i] = String.valueOf(frase.charAt(i));
					}
					
					// Mostramos el nuevo arreglo
					System.out.print(stringFrase[i]);
				}

					// Cerramos el teclado
					sc.close();
	}
	
	
	// Main
	public static void main(String[] args) {
		
		// Llamamos al metodo espacios
		espacios (args);

	}

}
