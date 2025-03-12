package Ejercicio09_Eliminar_Vocales;
import java.util.Scanner;

public class Ejercicio09_Eliminar_Vocales {

    // Método para pedir el nombre y apellidos y eliminar las vocales
    public static void eliminarVocales(String[] args) {
        
    	// Creamos:
        Scanner sc = new Scanner(System.in);
        String nombre;
        String apellido1;
        String apellido2;
        
        
        // Pedimos un nombre y apellidos al usuario
        System.out.print("Introduce un nombre: ");
        nombre = sc.nextLine();

        System.out.print("Introduce el primer apellido: ");
        apellido1 = sc.nextLine();

        System.out.print("Introduce el segundo apellido: ");
        apellido2 = sc.nextLine();

        
        // Juntamos el nombre y los apellidos en un array
        String[] nombreApellido = {nombre, apellido1, apellido2};

        
        // Recorremos el array y eliminamos las vocales de cada palabra
        for (int i = 0; i < nombreApellido.length; i++) {
            
        	// Eliminamos las vocales de cada palabra
            nombreApellido[i] = nombreApellido[i].replaceAll("[aeiouáéíóúAEIOUÁÉÍÓÚ]", "");
        }

        // Mostramos el resultado
        System.out.print("\nEl nombre completo sin vocales es: ");
        for (int i = 0; i < nombreApellido.length; i++) {
            System.out.print(nombreApellido[i]);
            
            //Si no es el ultimo elemento, añade un espacio
            if (i < nombreApellido.length - 1) {  
                System.out.print(" ");  
            }
        }


        // Cerramos el teclado
        sc.close();
    }

    // Main
    public static void main(String[] args) {
       
    	// Llamamos al método eliminarVocales
        eliminarVocales(args);
    }
}
