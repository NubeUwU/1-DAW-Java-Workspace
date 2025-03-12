package Ejercicio12_Juego_Ahorcado;

import java.util.Scanner;

public class Ejercicio12_Juego_Ahorcado {

	public static void juego (String [] args) {
	
		//	Creamos:
		Scanner sc = new Scanner(System.in);	// Teclado
	    String palabra = "";  	   	 	       // Palabra 
	    String adivinar = "";           	  // Adivinar 
	    int intentos = 7;					// Numero de intentos
	    
	    
	    //	Solicitamos una palabra para el juego
	    System.out.print("Jugador 1, introduzca la palabra a adivinar: ");
	    palabra = sc.nextLine().toLowerCase();
	    String [] palabraTrue = new String[palabra.length()];
	    
	    
	    //	Llenamos un string con la palabra sustituida por los huecos
	    for (int i = 0; i<palabraTrue.length;i++) {
	    	palabraTrue[i] = "_";
	    }
	    
	    //	Imprime 50 líneas vacías para simular el borrado de la consola
	    for (int i = 0; i < 50; i++) {  
	        System.out.println();
	    }
	    
	    
	    
	    //	Se pide al jugador 2 que introduzca su predicción
	    do {
	    	
	    	System.out.print("\nLa palabra es: ");
	    	for (int i = 0; i < palabraTrue.length; i++) {
	    	    System.out.print(palabraTrue[i]);
	    	}
	    	System.out.println();
	    	
	    
	    	//	Mostramos los intentos y pedimos una predicción
	        System.out.print("\nIntroduzca su predicción (Le quedan "+intentos+" intentos): ");
	        adivinar = sc.nextLine().toLowerCase();
	        
	        //	Validacion adivinar
	        while((adivinar.length() != (palabraTrue.length))) {
	        	System.out.print("\nError, la palabra tiene "+palabraTrue.length+" letras\n"
	        			+ "Introduzca otra palabra: ");
	        	adivinar = sc.nextLine().toLowerCase();
	        }
	        
	      
	        //	Si la letra coincide, la cambia el array
	        for (int i = 0; i<palabraTrue.length; i++) {
	        	if(String.valueOf(adivinar.charAt(i)).matches(String.valueOf(palabra.charAt(i)))) {
	        		palabraTrue[i] = String.valueOf(adivinar.charAt(i));
	    		
	    	}
	    }
	    
	        //	Si adivina la palabra muestra un mensaje y cierra el metodo
	        if(adivinar.equals(palabra)) {
	        	System.out.println("\n¡Correcto! La palabra era "+palabra+"\n"
	        			+ "Ha ganado el jugador 2");
	        	break;
	        }
	    
	        //	Disminuye el numero de intentos
	        intentos--;
	
	        
		    //	Si se queda sin intentos muestra cual era la palabra correcta y termina el juego
	        if(intentos == 0) {
	        	System.out.println("\nLo sentimos, no has acertado\n"
	        			+ "La palabra correcta era: "+palabra+"\n"
	        					+ "Ha ganado el jugador 1");
	        }
	        
	        
	    }while (intentos!=0);
	    
	    //	Cerramos el teclado
	    System.out.println("\nFin del juego");
	    sc.close();
}    
	  
	//	Main
	public static void main(String[] args) {
		
		//	Llamada al metodo "juego"
		juego(args);

	}

}
