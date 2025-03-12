package Tarea08_Cambio_Monedas;
import java.util.*;
public class Ejercicio08_Cambio_Monedas {
	
	//Metodo que calcula la cantidad de billetes necesarios
	public static void cantidadBilletes(int cantidad) {
		
		//Iniciamos el array "billetes" y el total de billetes
		int[] billetes = {500,200,100,50,20,10,5};
		int totalBilletes = 0;

        //Mostramos por pantalla la cantidad de dinero
        System.out.println("Para la cantidad " + cantidad + "€ se necesitan:");

        
        //Iteramos sobre los billetes de mayor a menor
        for (int i = 0; i < billetes.length; i++) {
            //Contamos cuántos billetes de este tipo necesitamos
            if (cantidad >= billetes[i]) {
                int numBilletes = cantidad / billetes[i];  //Número de billetes de ese tipo
                totalBilletes += numBilletes;              //Añadimos al total de billetes
                cantidad %= billetes[i];                   //Reducimos la cantidad de dinero
                
                //Mostramos por pantalla el numero de billetes de cada tipo que hacen falta
                System.out.println(numBilletes + " billetes de " + billetes[i] + "€");
            }
        }
        
        //Si después de las iteraciones sobra dinero, lo devuelve en monedas
        if (cantidad > 0) {
            System.out.println("Restante: " + cantidad + "€\n");
        }
        
        //Mostramos el total de billetes usados
        System.out.println("Total de billetes: " + totalBilletes);
    }

	
	//Main
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//Pedimos que introduzca una cantidad de dinero
		System.out.print("Introduzca una cantidad de dinero: ");
		int cantidad = sc.nextInt();
		
		//Llamamos al metodo que calcula la cantidad de billetes
		cantidadBilletes(cantidad);
		
		//Cerramos el teclado
		sc.close();
	}

}
