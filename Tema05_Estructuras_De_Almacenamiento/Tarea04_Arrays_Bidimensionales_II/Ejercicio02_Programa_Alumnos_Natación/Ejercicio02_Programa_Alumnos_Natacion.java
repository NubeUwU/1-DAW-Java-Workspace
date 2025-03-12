package Ejercicio02_Programa_Alumnos_Natación;
import java.util.*;

public class Ejercicio02_Programa_Alumnos_Natacion {
	
	// Método que muestra el número de alumnos por día y hora con formato alineado
	public static void mostrarTotalAlumnos(int[][] matriz) {
	    System.out.println("\nDía\t\tHora 1\tHora 2\tHora 3\tHora 4");

	    for (int i = 0; i < matriz.length; i++) {
	        
	    	// Determinar el nombre del día
	        String dia;
	        switch (i + 1) {
	            case 1 -> dia = "Lunes";
	            case 2 -> dia = "Martes";
	            case 3 -> dia = "Miércoles";
	            case 4 -> dia = "Jueves";
	            case 5 -> dia = "Viernes";
	            default -> dia = "Día " + (i + 1);
	        }

	        // Se imprime el día con espaciado uniforme
	        System.out.printf("%-10s", dia); // "%-10s" alinea los dias a la izquierda con ancho de 10"

	        // Se imprimen los valores de la fila con espaciado uniforme
	        for (int j = 0; j < matriz[i].length; j++) {
	            System.out.printf("%8d", matriz[i][j]); // "%8d" alinea los números en columnas de 8 caracteres
	        }
	        System.out.println();
	    }
	}


	
	//	Metodo que calcula el total de alumnos en cada día
	public static void totalAlumnosDia(int[][] matriz, String []dias,Scanner sc) {
		int sumaAlumnosDia=0;
		int dia = 0;
		
		System.out.print("\nIntroduzca el número del día desea ver el total de alumnos\n"
				+ "1. Lunes\n"
				+ "2. Martes\n"
				+ "3. Miercoles\n"
				+ "4. Jueves\n"
				+ "5. Viernes\n"
				+ "\nDía: ");
		
		dia = sc.nextInt();
		
		//	Validación para el día
		while (dia < 1 || dia > 4) {
            System.out.print("Número de día inválido.\n"
            		+ "Introduzca un numero de hora valido (1-5)\n"
            		+ "\nDía:");
            dia = sc.nextInt();
        }
		
		// Recorremos la matriz y sumamos los valores del dia seleccionado
        for (int i = 0; i < matriz[dia-1].length; i++) {
            sumaAlumnosDia += matriz[dia-1][i]; 
        }
        
        // Mostramos el resultado
        System.out.println("El total de alumnos del " + dias[dia - 1] + " es: " + sumaAlumnosDia);
	}
	
	
	
    // Método que calcula el total de alumnos en cada hora
    public static void totalAlumnosHora(int[][] matriz, String [] horas, Scanner sc) {
        int sumaAlumnosHora = 0;
        int hora = 0;

        // Pedir al usuario que ingrese la hora
        System.out.print("Introduzca el número de la hora de la que desea ver el total de alumnos\n"
        		+ "1. Primera hora\n"
        		+ "2. Segunda hora\n"
        		+ "3. Tercera hora\n"
        		+ "4. Cuarta hora\n"
        		+ "\nHora: ");

        hora = sc.nextInt();
        
        // Validacion para la hora
            while (hora < 1 || hora > 4) {
            System.out.print("Número de hora inválido.\n"
            		+ "Introduzca un numero de hora valido (1-4)\n"
            		+ "\nHora:");
            hora = sc.nextInt();
        }

        // Recorremos la matriz y sumamos los valores de la hora seleccionada
        for (int i = 0; i < matriz.length; i++) {
            sumaAlumnosHora += matriz[i][hora - 1]; 
        }

        // Mostramos el resultado
        System.out.println("El total de alumnos de la " + horas[hora - 1] + " es: " + sumaAlumnosHora);
    }
	
    
    
    //	Metodo que calcula la media de los alumnos por hora
    public static void mediaAlumnosHoras(int [][] matriz) {
    	double sumaMediaHoras=0;
    	double [] mediaAlumnosHora = new double[matriz[0].length];
    	
    	//	Iteramos sobre las columnas de la matriz
    	for (int j = 0; j<matriz[0].length;j++) {
    		//	Reiniciamos las suma de los alumnos a 0
    		sumaMediaHoras=0;
    		
    		for (int i = 0 ;i < matriz.length ;i++) {
    			sumaMediaHoras += matriz [i][j];
    		}
    		//	Asignamos la media de las horas a un array
    		mediaAlumnosHora[j] = (sumaMediaHoras/matriz[0].length);
    		
    	}
    	//	Mostramos el resultado
    	System.out.println("La media de alumnos por hora es: "+Arrays.toString(mediaAlumnosHora));
    }
    
    
    
    public static void numeroAlumnos(int[][] matriz, String [] dias, String[] horas, Scanner sc) {
        int numAlumnos = 0;
        boolean existe = false;  // Variable para verificar si el valor existe

        System.out.print("Introduzca el número de alumnos que desea buscar: ");
        numAlumnos = sc.nextInt();
        System.out.println("\nDías con " + numAlumnos + " alumnos:");

        // Iteramos sobre la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == numAlumnos) {  // Si encontramos la cantidad de alumnos
                    System.out.println("El " + dias[i] + " a " + horas[j]);
                    existe = true;
                }
            }
        }

        // Si no encontramos ningún día o hora con el número de alumnos
        if (!existe) {
            System.out.println("No hay ningún día con esa cantidad de alumnos.");
        }
    }
    
    
    
    // Método que calcula el número de días y horas con alumnos superiores a la media
    public static void mediaAlumnosDiaHora(int[][] matriz, String[] dias, String[] horas) {
        double sumaMediaDias = 0;
        double sumaMediaHoras = 0;
        double[] mediaAlumnosDias = new double[matriz.length];  	// Media de alumnos por día
        double[] mediaAlumnosHora = new double[matriz[0].length];   // Media de alumnos por hora

        // Calculamos la media de alumnos por día
        for (int i = 0; i < matriz.length; i++) {
            sumaMediaDias = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                sumaMediaDias += matriz[i][j];  
            }
            mediaAlumnosDias[i] = sumaMediaDias / matriz[0].length;  // Media por día
        }

        // Calculamos la media de alumnos por hora
        for (int j = 0; j < matriz[0].length; j++) {
            sumaMediaHoras = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaMediaHoras += matriz[i][j];  
            }
            mediaAlumnosHora[j] = sumaMediaHoras / matriz.length;  // Media por hora
        }

        // Mostramos los días y las horas donde el número de alumnos es superior a la media

        // Para los días:
	        System.out.println("\nDías con alumnos superiores a la media:");
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[0].length; j++) {
	                if (matriz[i][j] > mediaAlumnosDias[i]) {
	                    System.out.println("El " + dias[i] + " a " + horas[j] + ", hay más alumnos que la media del día.");
                }
            }
        }

        // Para las horas:
        System.out.println("\n\nHoras con alumnos superiores a la media:");
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][j] > mediaAlumnosHora[j]) {
                    System.out.println("A " + horas[j] + " 	el " + dias[i] + ", hay más alumnos que la media de las hora.");
                }
            }
        }
    }
   
    
    
    //	Main
	public static void main(String[] args) {
		
		//	Creamos:
		Scanner sc = new Scanner (System.in);												//Teclado
		int operacion = 0;																	//Numero de la operacion
        String[] dias = {"lunes", "martes", "miercoles", "jueves", "viernes"};				//Array con los dias
        String[] horas = {"primera hora", "segunda hora", "tercera hora", "cuarta hora"};	//Array con las horas
        
        //	Creamos la matriz
		int [][] matriz = {
				{15, 19, 20, 12}, 
	            {16, 14, 12, 11}, 
	            {17, 20, 11, 10}, 
	            {11, 12, 13, 18}, 
	            {18, 19, 20, 19}
		};
		
		
		//	Creamos un menu con un bucle do-while para elegir las operaciones
		do {
		System.out.print("\nIntroduzca el número de la operacion que desee realizar\n"
				+ "1. Consultar el número de alumnos por día y hora\n"
				+ "2. Consultar el total de alumnos por día\n"
				+ "3. Consultar el total de alumnos por hora\n"
				+ "4. Consultar la media de alumnos por clase de cada hora\n"
				+ "5. Consultar el qué día tiene un número de alumnos concreto\n"
				+ "6. Consultar que dias hay un número de alumnos superior a la media\n"
				+ "7. Salir\n"
				+ "\nOperación: ");

		operacion = sc.nextInt();
		
		//	Switch para moverse entre operaciones
		switch (operacion) {
		case 1:	//	Muestra los alumnos
			mostrarTotalAlumnos(matriz);
			break;
		
		case 2:	//	Muestra el total de alumnos por dia
			totalAlumnosDia(matriz,dias,sc);
			break;
			
		case 3:	//	Muestra el total de alumnos por hora
			totalAlumnosHora(matriz,horas,sc);
			break;
			
		case 4:	//	Muestra la media de alumnos por dia
			mediaAlumnosHoras(matriz);
			break;
		
		case 5:	//	Muestra el número concreto de alumnos de un dia
			numeroAlumnos(matriz, dias, horas, sc);
			break;
			
		case 6: //	Muestra que días hay mas alumnos que la media
			mediaAlumnosDiaHora(matriz, dias, horas);
			break;
		
		case 7: //	Si el numero de operacion es 7 finaliza el programa
			System.out.println("\nFin del programa");
			break;
			
		default: //	Si el numero es cualquier otro muestra un mensaje de error y vuelve al menu
			System.out.println("Número equivocado, por favor, introduzca un número de operacion valido\n");
		}
	
		}while (operacion != 7);
	}

}
