package Tarea03_Array_Aleatorio;

public class Ejercicio03_Array_Aleatorio {

	//Creamos un metodo que muestre el array
    public static void rellenarArray(int[] array) {
        System.out.print("Array {");
        
        //Hacemos un bucle for que recorra cada hueco del array y le asigne un numero aleatorio
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101) + 1;
            
            System.out.print(array[i]); 
            
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
    	//Creamos el array de 20 números
        int[] array = new int[20];
        
        //Llamamos al metodo que rellene el array y lo muestra
        rellenarArray(array);
    }
}
