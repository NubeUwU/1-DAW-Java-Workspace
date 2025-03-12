package Tarea07_Desplazamiento_Array;
import java.util.*;
public class Ejercicio07_Desplazar_Array {
	
	//Metodo para rellenar el Array
    public static void rellenarArray(int[] array) { 
    	
        //Hacemos un bucle for que recorra cada hueco del array y le asigne un numero aleatorio (1-100)
        System.out.print("El array es: {");
    	for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
            System.out.print(array[i]); 
            
            //Añade una "," y un espacio mientras hasta la ultima posicion
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}\n");
      }
    
    
    //Main
	public static void main(String[] args) {	
		
		//Creamos el teclado y el array
		Scanner sc = new Scanner (System.in);
		int[] array = new int [15];
		int posicion=0;
		
		
		//Llamamos al metodo que llena el Array y preguntamos que posición desea eliminar
		rellenarArray(array);
		
		
		//Eliminamos y movemos los items del array a la izquierda añadiendo un 0 en el ultimo
		do {
		System.out.print("¿Qué posición desea eliminar? (0-14)\n"
				+ "(100 para finalizar el programa): ");
		posicion = sc.nextInt();
		
		
		//Si la posicion es correcta, mueve todos los huecos desde ese un espacio a la izquierda y pone un 0 en el ultimo
        if (posicion >= 0 && posicion < 15) {
        	for(int i=posicion; i<array.length-1; i++) {
        		array[i] = array[(i+1)];
        }
        array[array.length - 1] = 0;
        
        
        //Se muestra el nuevo Array
        System.out.print("El nuevo array es: {");
        for (int i = 0; i < array.length; i++) {
        	System.out.print(array[i]); 
                
            if (i < array.length - 1) {
            System.out.print(", ");
         }
     }
            System.out.println("}\n");
            
        //Si la posicion es 100, muestra un mensaje y finaliza el programa
        } else if(posicion == 100) {
            System.out.println("Fin del programa\n");
        
            
        //Si la posicion elegida es distinta de 0-14 o 100, muestra un error
        }else if(posicion != 100 && (posicion<0 || posicion >14)){
        	System.out.println("Error, número fuera de rango.\n");
        }
       

        //Cuando la posición sea 100 terminara el programa
		}while(posicion != 100);
		sc.close();
	}

}
