package Tarea01_Arrays_Unidimensionales;

public class Ejercicio01_SumaArray {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int array1 [] = {5,4,3,7,9,12,34,56};
		int sumaPares=0;
		int sumaImpares=0;
				
		for (int i = 0;i<array1.length;i+=2) {
			sumaPares = array1[i] + sumaPares;
	}
				
		for (int i = 1;i<array1.length;i+=2) {
			sumaImpares = array1[i] + sumaImpares;
	}
		System.out.println("La suma de las posiciones impares es: "+sumaImpares);
		System.out.println("La suma de las posiciones pares es: "+sumaPares);
	}

}
