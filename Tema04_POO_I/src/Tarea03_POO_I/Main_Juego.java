package Tarea03_POO_I;

import java.util.Scanner;

public class Main_Juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Creamos el teclado "sc" y los atributos "fin", "numero" y "resultado"
		Scanner sc = new Scanner (System.in);
		String fin;
		int numero;
		String resultado;
		
	//Realizamos un do-while que permita repetir el programa y asigne un nuevo número aleatorio.
		do{
			Juego juego = new Juego (1,100); //Creamos el objeto juego con mínimo 1 y máximo 100
			System.out.println("Se ha generado un número aleatorio entero entre 1 y 100. ¡Intente adivinarlo!");
			
	//Realizamos un do-while anidado para que pueda escribir el número hasta que acierte	
			do{
				System.out.print("Introduzca un número: ");
				numero = sc.nextInt();
				
	//Verificamos que el número esté entre 1 y 100
			    while (numero < 1 || numero > 100) {
			        System.out.print("Por favor, ingrese un número entre 1 y 100: ");
			        numero = sc.nextInt();
			        System.out.println();
			    }
			    
				resultado = juego.mismoNumero(numero);
                System.out.println(resultado);
                System.out.println();
			}while (!resultado.equals("¡Has acertado!"));
			
	//Si el número es el mismo número que el aleatorio, imprimira por pantalla lo siguiente:     		
			System.out.print("¿Quieres jugar de nuevo? (S/N): ");
            fin = sc.next().toUpperCase();
            System.out.println();
		
    //Si no quiere jugar mas, el programa termina	
		}while(!fin.equals("N"));
		System.out.println("Fin del programa");
		
	//Cerramos el teclado
		sc.close();
	
	}
}
