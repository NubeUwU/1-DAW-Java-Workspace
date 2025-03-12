package Tarea10_Array_Empleados;
import java.util.Scanner;

public class Ejercicio10_Array_Empleados {

    public static void datosEmpleados(String[] args) {
        
    	// Teclado
        Scanner sc = new Scanner(System.in);

        // Atributos "nombre", "edad" y "salario"
        String nombre = "";
        int edad = 0;
        double salario = 0;

        // Creamos el array "empleados" que contiene objetos de la clase "Empleado"
        Empleado[] empleados = new Empleado[5];

        // Llenamos el array con los empleados
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca los datos del empleado nº" + (i + 1));

            
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
                    System.out.println("Error: El nombre no puede estar vacío.");
                } else if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                    System.out.println("Error: El nombre solo puede contener letras y espacios.");
                }
            } while (nombre.isEmpty() || !nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+"));

            
            
            // Edad
            do {
                System.out.print("Edad: ");
                edad = sc.nextInt();
                
                // Validacion Edad
                if (edad < 16) {
                    System.out.println("Error: El empleado no puede tener menos de 16 años.");
                } else if (edad > 120) {
                    System.out.println("Error: La edad introducida es mayor de la esperada (máx. 120 años).");
                }
            } while (edad < 16 || edad > 120);

            
            // Salario
            do {
                System.out.print("Salario: ");
                salario = sc.nextDouble();
                
                // Validacion Salario
                if (salario < 0) {
                    System.out.println("Error: El empleado no puede cobrar menos de 0€.");
                }
            } while (salario < 0);
            

            // Vaciamos el buffer
            sc.nextLine();

            // Llenamos el array con los datos del empleado
            empleados[i] = new Empleado(nombre, edad, salario);
            System.out.println();
        }

        // Mostramos el array de empleados
        System.out.println("\nLista de empleados:");
        System.out.println("----------------------------------------------------");
        for (int j = 0; j < empleados.length; j++) {
            System.out.println(empleados[j]);
        }
        System.out.println("----------------------------------------------------");

        // Cerramos el teclado
        sc.close();
    }

    
    // Main
    public static void main(String[] args) {
        
    	// Llamamos al método datosEmpleados
        datosEmpleados(args);
    }
}
