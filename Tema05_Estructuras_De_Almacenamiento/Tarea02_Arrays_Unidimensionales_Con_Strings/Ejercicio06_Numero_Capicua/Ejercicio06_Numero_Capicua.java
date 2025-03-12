package Ejercicio06_Numero_Capicua;
import java.util.Scanner;

public class Ejercicio06_Numero_Capicua {

	public static void capicua(String[] args) {
		
		//Creamos:
		Scanner sc = new Scanner (System.in);	// Teclado
		String num="";							// String "num"
		int contador=0;							// Contador

		
		// Se pide un número y se almacena en un string
		System.out.print("Introduzca un número: ");
		num = sc.nextLine();
		String[] numCapicua = num.split("");
		
		
		// Si el valor de i en el array es el mismo que el de num.length - i aumenta el contador
		for (int i = 0; i<num.length();i++) {
			if (numCapicua[i].equals(String.valueOf(num.charAt(num.length()-1-i)))){
			contador++;
		}
	}
			// Mostramos el resultado
			if(contador == numCapicua.length) {
				System.out.println("El número " + num + " es capicua");
			}else {
				System.out.println("El número " + num + " no es capicua");
			}
			
			// Cerramos el teclado
			sc.close();
		}
	
	
	// Main
	public static void main(String[] args) {

		//Llamamos al metodo capicua
		capicua(args);
	}

}
