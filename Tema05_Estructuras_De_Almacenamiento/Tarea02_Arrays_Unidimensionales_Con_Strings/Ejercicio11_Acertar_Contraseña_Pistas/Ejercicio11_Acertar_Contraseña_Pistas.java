package Ejercicio11_Acertar_Contraseña_Pistas;

import java.util.Scanner;

public class Ejercicio11_Acertar_Contraseña_Pistas {
	
	// Metodo acertarContrasenya
	public static void acertarContrasenya(String[]args){
	
    
    // Creamos:
	Scanner sc = new Scanner(System.in);	// Teclado
    String contrasenya = "";  	           // Contrasenya
    String continuar = "S";     	      // Continuar
    String adivinar = "";           	 // Adivinar
    
    
    // Pedimos la Contrasenya inicial a descubrir y la almacenamos
    System.out.print("Introduzca una contraseña: ");
    contrasenya = sc.nextLine().toLowerCase();
    String [] contrasenyaTrue = new String[contrasenya.length()];
    
    // Llenamos un string con la contraseña
    for (int i = 0; i<contrasenyaTrue.length;i++) {
    	contrasenyaTrue[i] = String.valueOf(contrasenya.charAt(i));
    }
    
    // Imprime 50 líneas vacías para simular el borrado de la consola
    for (int i = 0; i < 50; i++) {  
        System.out.println();
    }

    
    // Se pide al usuario que introduzca su predicción hasta que la Contraseña tenga el mismo tamaño
    do {
        System.out.print("\nIntroduzca su predicción: ");
        adivinar = sc.nextLine().toLowerCase();
        
        while(adivinar.length()>contrasenyaTrue.length) {
        	System.out.println("\nLa contraseña tiene una longitud menor\n"
        			+ "Introduzca otra contraseña: ");
        	adivinar = sc.nextLine().toLowerCase();
        }
        
        System.out.print("Contraseña: ");
        
        // Comparamos Contraseñas
        for (int i = 0; i<contrasenyaTrue.length;i++) {
        	if (i < adivinar.length() && adivinar.charAt(i) == contrasenyaTrue[i].charAt(0)) {
                System.out.print(contrasenyaTrue[i]);
        	}else {
        		System.out.print("*");
        	}
        }
        
        //	Si acierta la contraseña termina el metodo
        if(adivinar.equals(contrasenya)) {
        	System.out.println("\nFelicidades, has acertado la contraseña");
        	break;
        }
        
        // Pregunta si desea continuar
        System.out.print("\n\n¿Desea continuar? (S/N): ");
        continuar = sc.nextLine().toUpperCase();

        // Validación de "continuar"
        while (!continuar.equals("S") && !continuar.equals("N")) {
            System.out.print("Error, debe escribir S ó N: ");
            continuar = sc.nextLine().toUpperCase();
        }
        
        System.out.println();
    } while (continuar.equalsIgnoreCase("S"));

    //	Fin del programa
    System.out.println("Fin del programa");
    sc.close();
}
	
	
	//	Main
	public static void main(String[] args) {
		
		//	Llamada al metodo "acertarContrasenya"
		acertarContrasenya(args);

	}

}
