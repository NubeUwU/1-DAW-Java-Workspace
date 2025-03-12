package Ejercicio04_Número_Telefonico;
import java.util.Scanner;

public class Ejercicio04_Numero_Telefonico {

	//Metodo que cambia el formato de un número de telefono
	public static void numeroTelefonico(String[]args) {
		
		//Creamos:
		Scanner sc = new Scanner (System.in);		// Teclado
		String numTelefono = "";					// Atributo "numTelefono"
		int j=0;									// Atributo "j"
		String[] arregloTelefono = new String[14];	// Array "ArregloTelefono"
		
		
		//Pedimos al usuario que introduzca un número de telefono
		System.out.print("Introduzca un número de telefono (10 digitos): ");
		numTelefono = sc.nextLine();

			//Validacion numTelefono
			while (!numTelefono.matches("\\d{10}")) { //Si no se introducen 10 digitos numericos:
				System.out.println("Error: El número de teléfono debe tener exactamente 10 dígitos.");
				System.out.print("Introduzca un número de teléfono (10 dígitos): ");
				numTelefono = sc.nextLine();
			}
			
			
		//Mostramos por pantalla el número de telefono corregido
		System.out.print("\nEl número de telefono es: ");
		
		
		//For que recorre todo el todo el telefono y asigna sus valores al array
		for (int i = 0; i<(arregloTelefono.length);i++) {
			
			//Se asignan valores especificos en i = "0", "3" ,"4" y "6"
			if (i == 0) {
			arregloTelefono[i] = "(";
		}			
			else if (i == 3 ) {
			arregloTelefono[i] = ")";
		}
			else if (i == 4 || i == 6) {
			arregloTelefono[i] = "-";
		}
			//Añade al array los valores del número de telefono
			else {
			arregloTelefono [i] = String.valueOf(numTelefono.charAt(j));
			j++;
		}
			
			//Imprimimos por pantalla el nuevo numero de telefono
			System.out.print(arregloTelefono[i]);
				
		}	
			//Cerramos el teclado
			sc.close();
	}
	
	//Main
	public static void main(String[] args) {
		
		//Llamada al metodo numeroTelefonico
		numeroTelefonico(args);
	}

}
