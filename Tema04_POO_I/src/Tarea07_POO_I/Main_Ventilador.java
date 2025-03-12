package Tarea07_POO_I;
import java.util.Scanner;

public class Main_Ventilador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operacion;
        String marca = "";
        String modelo = "";
        String tipo = "";
        
        Ventilador ventilador = new Ventilador(marca, modelo, tipo, false, 0);

        do {
            System.out.print(
                "Seleccione la operación que desea realizar:\n" +
                "1. Ajustar velocidad\n" +
                "2. Parar\n" +
                "3. Mostrar Velocidad\n" +
                "4. Cambiar el tipo de ventilador\n" +
                "5. Mostrar todos los datos del ventilador\n" +
                "6. Salir\n" +
                "\nOperación: ");
            operacion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer
            System.out.println();

            switch (operacion) {
                case 1:
                    ventilador.ajustarVel();
                    System.out.println();
                    break;

                case 2:
                    ventilador.apagado();
                    System.out.println();
                    break;

                case 3:
                    System.out.println("La velocidad actual es " + ventilador.getVelocidad());
                    System.out.println();
                    break;

                case 4:
                    ventilador.cambioDatos();
                    System.out.println("Cambio realizado con éxito");
                    System.out.println();
                    break;

                case 5:
                    ventilador.datosVentilador();
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Error. Nº de Operación Incorrecto");
                    System.out.println();
                    break;
            }

        } while (operacion != 6);

        sc.close();
    }
}
