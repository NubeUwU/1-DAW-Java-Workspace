package Tarea07_POO_I;
import java.util.Scanner;

public class Ventilador {
    
    private String marca;
    private String modelo;
    private String tipo;
    private boolean encendido;
    private int velocidad;
    private Scanner sc;

    public Ventilador(String marca, String modelo, String tipo, boolean encendido, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.encendido = encendido;
        this.velocidad = velocidad;
        this.sc = new Scanner(System.in);
    }

    // Getters & Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public int getVelocidad() {
        return velocidad;
    }

    // Método para ajustar la velocidad
    public void ajustarVel() {
        do {
            System.out.print("Introduzca la velocidad a la que quiere ajustar el ventilador (1, 2 o 3): ");
            velocidad = sc.nextInt();
            sc.nextLine(); // Limpiar buffer
            
            if (velocidad < 1 || velocidad > 3) {
                System.out.println("Error, número de velocidad incorrecto\n");
            }
        } while (velocidad < 1 || velocidad > 3);
        
        encendido = true;
        System.out.println("La velocidad ha sido ajustada a " + velocidad);
    }

    // Método para apagar el ventilador
    public void apagado() {
        if (!encendido) { 
            System.out.println("El ventilador ya está apagado.");
        } else {
            encendido = false;
            velocidad = 0; // También se resetea la velocidad al apagar
            System.out.println("El ventilador se ha apagado.");
        }
    }

    // Método para cambiar datos del ventilador
    public void cambioDatos() {
        System.out.print("Introduzca la marca del ventilador: ");
        marca = sc.nextLine();

        do {
            System.out.print("Introduzca el tipo del ventilador (techo, pared, suelo): ");
            tipo = sc.nextLine().toLowerCase();
        } while (!tipo.equals("techo") && !tipo.equals("pared") && !tipo.equals("suelo"));
    }

    // Método para mostrar todos los datos del ventilador
    public void datosVentilador() {
        System.out.println("Marca del ventilador: " + marca);
        System.out.println("Tipo de ventilador: " + tipo);
        if (encendido) {
            System.out.println("El ventilador está encendido\nSu velocidad es " + velocidad);
        } else {
            System.out.println("El ventilador está apagado\nLa velocidad es 0");
        }
    }

    // Método para cerrar el Scanner
    public void cerrarScanner() {
        sc.close();
    }
}
