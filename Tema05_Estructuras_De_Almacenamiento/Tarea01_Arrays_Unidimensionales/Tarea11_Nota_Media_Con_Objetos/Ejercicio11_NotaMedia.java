package Tarea11_Nota_Media_Con_Objetos;
import java.util.Scanner;

public class Ejercicio11_NotaMedia {

	public static void notaMedia(String[] args) {
		// Teclado
        Scanner sc = new Scanner(System.in);

        // Atributos "nombre", "notaMedia"
        String nombre = "";
        double notaMediaAlumno = 0;
        double notaMediaTotal = 0;
        
        // Creamos el array "empleados" que contiene objetos de la clase "Empleado"
        Alumnos[] alumno = new Alumnos[5];

        
        // Llenamos el array con los alumnos
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca los datos del alumno nº" + (i + 1));
            
        // Nombre
            do {
                System.out.print("Nombre: ");
                nombre = sc.nextLine().toLowerCase().trim();

                // Mayusculas a la primera letra de cada palabra del nombre
                if (!nombre.isEmpty()) {
                    String[] partes = nombre.split(" "); // Dividimos el nombre en partes
                    for (int j = 0; j < partes.length; j++) {
                        partes[j] = partes[j].substring(0, 1).toUpperCase() + partes[j].substring(1); // Capitalizamos la primera letra
                    }
                    nombre = String.join(" ", partes); // Volvemos a unir las partes con espacio
                }

                // Validacion Nombre
                if (nombre.isEmpty()) {
                    System.out.println("\nError: El nombre no puede estar vacío.");
                } else if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                    System.out.println("\nError: El nombre solo puede contener letras y espacios.");
                }
            } while (nombre.isEmpty() || !nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+"));

            
         // notaMediaAlumno
            do {
                System.out.print("Nota Media: ");
                notaMediaAlumno = sc.nextDouble();
                
                // Validacion notaMediaAlumno
                if (notaMediaAlumno < 0) {
                    System.out.println("\nError: La nota no puede ser menor que 0");
                } else if (notaMediaAlumno > 10) {
                    System.out.println("\nError: La nota no puede ser mayor de 10.");
                }
            } while (notaMediaAlumno < 0 || notaMediaAlumno > 10);
           
            
            //Rellenamos el array y añadimos la nota del alumno a la nota media total
            alumno[i] = new Alumnos(nombre, notaMediaAlumno);
            notaMediaTotal += notaMediaAlumno;
            System.out.println();
    
            // Vaciamos el buffer
            sc.nextLine();
        }
            
     
     // Mostramos el array de "alumno"
        System.out.println("\nLista de alumnos:");
        System.out.println("----------------------------------------------------");
        for (int j = 0; j < alumno.length; j++) {
            System.out.println(alumno[j]);
        }  
        System.out.println("----------------------------------------------------");
        System.out.println("\nLa nota media del curso es: "+String.format("%.2f",(notaMediaTotal/alumno.length)));
        
        // Cerramos el teclado
        sc.close();
}
	
	// Main
	public static void main(String[] args) {
		notaMedia(args);
	}

}
