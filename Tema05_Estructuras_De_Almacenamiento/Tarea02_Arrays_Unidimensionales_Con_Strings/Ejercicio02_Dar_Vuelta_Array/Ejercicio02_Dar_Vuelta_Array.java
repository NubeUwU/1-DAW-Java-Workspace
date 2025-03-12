package Ejercicio02_Dar_Vuelta_Array;
import java.util.Scanner;

public class Ejercicio02_Dar_Vuelta_Array {

	//	Metodo para dar la vuelta a la frase
	public static void voltearFrase(String[] args) {
		
		//	Creamos el teclado
		Scanner sc = new Scanner (System.in);
		
		//	Pedimos una frase por teclado
		System.out.print("Introduzca una frase: ");
		String frase = sc.nextLine();
		
		//	Convertimos la frase a un array de caracteres
		char[] fraseArray= frase.toCharArray();
		
		//	Creamos un array nuevo con la longitud del array anterior
		char[] fraseReversa= new char[fraseArray.length];
		
		//	Iteramos sobre la longitud de la frase para cambiar las letras
		for (int i = 0; i<fraseArray.length;i++) {
			
			//La letra final de la frase se convierte en la inicial del nuevo array 
			fraseReversa[i] = fraseArray[frase.length() -1 -i];  //Añadimos el -1 para que no se desborde el array
		}
		
		//	Mostramos por pantalla la frase invertida y cerramos el teclado
		System.out.println(fraseReversa);
		sc.close();
	}
	
	
	//	Main
	public static void main(String[] args) {
		
		//L	lamamos al metodo voltearFrase
		voltearFrase(args);
	}

}
