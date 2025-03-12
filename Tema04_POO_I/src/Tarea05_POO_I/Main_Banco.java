package Tarea05_POO_I;
import java.util.Scanner;

public class Main_Banco {
    public static void main(String[] args) {
    
    //Creamos el teclado    
    	Scanner sc = new Scanner(System.in);
     
    //Declaramos la cuenta y el atributo "operacion"
        Cuenta_Banco cuenta = null;
        int operacion = 0;

    //Creamos un menú con un switch anidado dentro de un bucle do-while
        do {
            System.out.print(
                "Seleccione la operación que desea realizar:\n" +
                "1. Crear una cuenta\n" +
                "2. Consultar saldo\n" +
                "3. Ingresar / Retirar dinero\n" +
                "4. Actualizar dirección\n" +
                "5. Cambiar titular\n" +
                "6. Salir\n" +
                "\nOperación: ");
            operacion = sc.nextInt();
            System.out.println();

        //Añadimos el Switch
            switch (operacion) {
            
                case 1:  //Llamamos al método crearCuenta para crear una cuenta
                    if (cuenta == null) {  //Nos aseguramos de que no haya una cuenta creada
                        cuenta = new Cuenta_Banco("", null, 0);  // Creamos una cuenta con valores por defecto
                        cuenta.crearCuenta();	//Modificamos la cuenta con los valores proporcionados por el usuario
                        System.out.println();
                    } else {
                        System.out.println("Ya existe una cuenta. No se puede crear una nueva.");
                    }
                    break;

                    
                case 2:	//Verificamos si la cuenta existe antes de acceder a ella
                    if (cuenta != null) {
                        cuenta.datosCuenta(); // Llamamos al método datosCuenta para mostrar los datos de esa cuenta
                    } else {
                        System.out.println("Error: No hay ninguna cuenta creada.");
                    }
                    break;

                case 3:	//Llamamos al metodo movCuenta para ingresar o retirar dinero
                    if (cuenta != null) {
                        cuenta.movCuenta();
                    } else {
                        System.out.println("Error: No hay ninguna cuenta creada.");
                    }
                    break;

                    
                case 4:	//Llamamos al metodo actDireccion para actualizar la dirección
                    if (cuenta != null) {
                    	cuenta.actDireccion();
                    } else {
                        System.out.println("Error: No hay ninguna cuenta creada.");
                    }
                    break;

                    
                case 5: //Llamamos al metodo datosTitular para cambiar los datos del titular
                    if (cuenta != null) {
                        cuenta.datosTitular();
                    } else {
                        System.out.println("Error: No hay ninguna cuenta creada.");
                    }
                    break;

                case 6: //Finaliza el programa
                    System.out.println("Fin del Programa.");
                    break;

                default: //Si se elige una opcion no valida (1-6), se vuelve al do-while
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }

        } while (operacion != 6); // El bucle se repite hasta que el usuario elija salir (Opcion 6)
        sc.close(); // Cerramos el teclado
    }
}
