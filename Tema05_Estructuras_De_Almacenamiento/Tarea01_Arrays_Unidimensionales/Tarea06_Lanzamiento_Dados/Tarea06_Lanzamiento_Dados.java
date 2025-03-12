package Tarea06_Lanzamiento_Dados;
import java.util.*;
public class Tarea06_Lanzamiento_Dados {

	
	//Metodo que lanza dados
	public static int caraDado(int[] array){
		Scanner sc = new Scanner (System.in);
		
		//Pregunta cuantas veces se lanzara el dado
		System.out.print("Cuantas veces desea lanzar el dado: ");
		int repeticiones = sc.nextInt();
		System.out.println();
		
		//Genera X veces un número aleatorio entre 0 y 5
		for (int i = 0; i < repeticiones; i++) {
			int num = (int) (Math.random() * 6);
	
        //Generamos un switch que aumente las veces que sale cada cara
        switch (num) {
        
        	case 0: //Cara 1
        		array [0]++;
        		break;
        	
        	case 1: //Cara 2
        		array [1]++;
        		break;
        			
        	case 2: //Cara 3
        		array [2]++;
				break;
			
        	case 3: //Cara 4
        		array [3]++;
				break;
			
        	case 4: //Cara 5
        		array [4]++;
				break;
			
        	case 5: //Cara 6
        		array [5]++;
				break;
        }
	}	
		//Cerramos el teclado
		sc.close();
		
		//Pedimos que devuelva el número de repeticiones
		return repeticiones;
}
	
	
	//Main
	public static void main(String[] args) {
		//Creamos el array de 6 posiciones
		int[] array = new int[6];
		
		//Llamamos al metodo caraDado
		//Asignamos el numero de repeticiones del metodo al atributo repeticiones
		int repeticiones = caraDado(array);
		
		//Mostramos por pantalla cuantas veces ha salido cada cara
		System.out.print("En "+ repeticiones +" lanzamientos, ha salido:\n"
				+ "Cara 1: "+array[0]+" veces\n"
				+ "Cara 2: "+array[1]+" veces\n"
				+ "Cara 3: "+array[2]+" veces\n"
				+ "Cara 4: "+array[3]+" veces\n"
				+ "Cara 5: "+array[4]+" veces\n"
				+ "Cara 6: "+array[5]+" veces");
	}
}
