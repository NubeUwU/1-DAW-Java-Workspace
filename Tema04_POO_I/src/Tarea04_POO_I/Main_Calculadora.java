package Tarea04_POO_I;

import java.util.Scanner;

public class Main_Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Creamos el teclado
		Scanner sc = new Scanner (System.in);
		int operacion;
		String repeticion="";
		
	do {	
	//Pedimos los números al usuario
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
      
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

    // Creamos el objeto de Calculadora con los valores ingresados
        Calculadora calculadora = new Calculadora(num1, num2);
      
    //Preguntamos que operación desea realizar y sus resultados
        System.out.println();
        System.out.print(
                "Seleccione la operación que desea realizar:\n" +
                "1. Suma\n" +
                "2. Resta\n" +
                "3. Multiplicación\n" +
                "4. División\n" +
                "5. Potencia\n" +
                "6. Módulo\n" +
                "\n" +
                "Ingrese el número de la operación: ");

        		operacion = sc.nextInt();
        
     //Volvemos a pedir el número hasta que sea valido
        while (operacion != 1 && operacion != 2 & operacion != 3 && operacion != 4 && operacion != 5 && operacion != 6) {
        	System.out.println("Error, introduzca un número de operación valido (1, 2, 3, 4, 5 ó 6): ");
        	operacion=sc.nextInt();
        }	
        
        System.out.println();
        
    //Devolvemos el resultado de la operación con un switch
        switch (operacion) {
        	case 1:
        		System.out.println("Resultado de la suma: " + calculadora.Suma());
        		break;
        	case 2:
        		System.out.println("Resultado de la resta: " + calculadora.Resta());
        		break;
        	case 3:
        		System.out.println("Resultado de la multiplicación: " + calculadora.Multiplicacion());
        		break;
        	case 4:
        		System.out.println("Resultado de la división: " + calculadora.Division());
        		break;
        	case 5:
        		System.out.println("Resultado de la potencia: " + calculadora.Potencia());
        		break;
        	case 6:
        		System.out.println("Resultado del módulo: " + calculadora.Modulo());
        		break;
    }
        System.out.println();
    	sc.nextLine();
        
	//Si desea hacer mas operaciones repetimos el bucle	
		System.out.print("¿Desea hacer alguna operacion más? (S/N): ");
		repeticion = sc.nextLine().toUpperCase();
		
	//Si no es "N" o "S" lo pide de nuevo
		while (!repeticion.equals("N")&&!repeticion.equals("S")) {
			System.out.println("Error, debe escribir S ó N: ");
			repeticion = sc.nextLine().toUpperCase();
		}
		System.out.println();
		
	}while (repeticion.equals("S"));
		System.out.print("Fin del Programa");
	
	//Cerramos el teclado
		sc.close();
	}

}
