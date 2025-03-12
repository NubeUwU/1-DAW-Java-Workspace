package Tarea06_POO_I;
import java.util.Scanner;
public class Main_Raices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//Creamos el teclado y el string repeticion
		Scanner sc = new Scanner (System.in);
		String repeticion;
		System.out.println("Programa Ecuacion de Segundo Grado\n"
				+ "Formula Ecuacion de Segundo Grado:((-b±√((b^2)-(4*a*c)))/(2*a))\n");
		
	//Llamamos al objeto Raices para calcular las raices inicializando (a, b y c) en (0, 0 y 0)
		do {
		Raices raiz = new Raices(0,0,0);
		raiz.Raiz(); //Llamamos al metodo raíz que calcule las raices
		
	//Preguntamos si desea calcular otra raíz
		System.out.print("¿Desea calcular otra raíz? (S/N): ");
		repeticion = sc.nextLine().toUpperCase();
		
		//Si no es "N" o "S" lo pide de nuevo
				while (!repeticion.equals("N")&&!repeticion.equals("S")) {
					System.out.print("Error, debe escribir S ó N: ");
					repeticion = sc.nextLine().toUpperCase();
				}
				System.out.println();
			
		//Si no desea hacer otra raíz, finaliza el bucle		
			}while (repeticion.equals("S"));
	
	//Finalizamos el programa y cerramos el teclado	
		System.out.print("Fin del Programa");
		sc.close();
	}

}
