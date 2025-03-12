package Tarea05_Lanzamiento_De_Moneda;

public class Ejercicio05_Lanzamiento_De_Moneda {

	public static void caraCruz(int[] array){
		//Genera 10 veces un número aleatorio entre 0 y 1
		for (int i = 0; i < 10; i++) {
        int num = (int) (Math.random() * 2);
	
        //Si sale 0 se aumenta el número en la posición 0 (Cara)
		if (num == 0){
			array[0]++;
		}
		
		//Si sale 1 se aumenta el numero en la posición 1 (Cruz)
		else if (num == 1) {
			array[1]++;
		}
	}
}	
	
	public static void main(String[] args) {
		//Creamos el array
		int[] array = new int[2];
		
		//Llamamos al metodo que lanza la moneda 10 veces
		caraCruz(array);
		
		//Imprimimos por pantalla cuantas veces ha salido cada cara
		System.out.println("Ha salido cara: "+array[0]+" veces\n"
				+ "Ha salido cruz: "+array[1]+" veces");
		
	}
	
}
