package Tarea05_POO_I;

import java.util.Scanner;

//Creamos el objeto "Cuenta_Banco"
public class Cuenta_Banco {
	
	//Creamos los atributos de la cuenta "nCuenta", "titular", (Referencia al objeto Titular), "saldo"
	//Creamos el teclado "sc" 
    private String nCuenta;
    private Titular titular;
    private double saldo;
    private Scanner sc = new Scanner(System.in);

    //Creamos el constructor
    public Cuenta_Banco(String nCuenta, Titular titular, double saldo) {
        this.nCuenta = nCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    //Creamos los getters y setters
    public String getnCuenta() {
		return nCuenta;
	}

	public void setnCuenta(String nCuenta) {
		this.nCuenta = nCuenta;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


//Método para crear una cuenta
    public void crearCuenta() {
        System.out.print("Ingrese los siguientes datos del titular de la cuenta\n"
        		+ "Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();

        String dni;
        do {//Comprobamos si el DNI tiene 9 caracteres con un do-while
            System.out.print("DNI (9 caracteres): ");
            dni = sc.nextLine();
            if (dni.length() != 9 || !dni.substring(0, 8).matches("\\d{8}") || !Character.isLetter(dni.charAt(8))) {
                System.out.println("Error: El DNI debe tener exactamente 9 caracteres y el ultimo tiene que ser una letra.\n"
                		+ "Inténtelo de nuevo.");
                System.out.println();
            }
        } while (dni.length() != 9 || !Character.isLetter(dni.charAt(8))|| !dni.substring(0, 8).matches("\\d{8}"));

        System.out.print("Dirección: ");
        String direccion = sc.nextLine();
        
      //Creamos el titular de la cuenta con los datos aportados  
        titular = new Titular(nombre, apellidos, dni, direccion);

        System.out.print("Introduzca el número de cuenta: ");
        nCuenta = sc.nextLine();

      //Se inicializa el saldo en 0 al haber sido recien creada.
        saldo = 0;
        System.out.println("Cuenta creada con éxito.");
    }

 
//Método para mostrar los datos de la cuenta
    public void datosCuenta() {
        System.out.println("Tu número de cuenta es: " + nCuenta);
        System.out.println("Tu saldo es de: " + saldo + "€");
        System.out.println();
    }

 //Método para ingresar o retirar dinero 
    public void movCuenta() {
        System.out.print("¿Qué operación desea realizar?\n"
                + "1. Ingresar Dinero\n"
                + "2. Retirar Dinero\n"
                + "Nº Operación: ");
        int operacion = sc.nextInt();
        sc.nextLine();
        
        switch (operacion) {
            
        	case 1: //Ingreso de Dinero
                System.out.print("¿Cuánto dinero desea ingresar? : ");
                double ingreso = sc.nextDouble();
                sc.nextLine();
                saldo += ingreso;
                System.out.println("Depósito exitoso. Nuevo saldo: " + saldo + "€");
                break;

            case 2: //Retirada de dinero
                System.out.print("¿Cuánto dinero desea retirar?: ");
                double retiro = sc.nextDouble();
                sc.nextLine();
                
                if (retiro > saldo) {  //Si el saldo es menor al dinero retirado se mostrara un error  
                    System.out.println("Error: Saldo insuficiente.");
                } else {
                    saldo -= retiro;
                    System.out.println("Retiro exitoso. Nuevo saldo: " + saldo + "€");
                }
                break;

            default:
                System.out.println("Operación no válida.");
        }
        System.out.println();
    }

  
//Método para cambiar la direccion del titular
    public void actDireccion() {
        System.out.print("Introduzca la nueva dirección: ");
        String nuevaDireccion = sc.nextLine();
        titular.setDireccion(nuevaDireccion);
        System.out.println("Dirección actualizada correctamente.");
        System.out.println();
    }
    
    
    
//Método para cambiar los datos del titular
    public void datosTitular() {
        System.out.print("Introduzca el nombre del nuevo titular: ");
        String nombreTitular = sc.nextLine();
        titular.setNombre(nombreTitular);

        System.out.print("Introduzca los apellidos del nuevo titular: ");
        String apellidosTitular = sc.nextLine();
        titular.setApellidos(apellidosTitular);

        String dni;
        do {
        	System.out.print("Introduzca el DNI del nuevo titular: ");
        	dni = sc.nextLine();
            if (dni.length() != 9 || !dni.substring(0, 8).matches("\\d{8}") || !Character.isLetter(dni.charAt(8))) {
                System.out.println("Error: El DNI debe tener exactamente 9 caracteres y el ultimo tiene que ser una letra.\n"
                		+ "Inténtelo de nuevo.");
                System.out.println();
            }
        } while (dni.length() != 9 || !Character.isLetter(dni.charAt(8))|| !dni.substring(0, 8).matches("\\d{8}"));
        titular.setDni(dni);

        System.out.print("Introduzca la nueva dirección: ");
        String direccion = sc.nextLine();
        titular.setDireccion(direccion);
        System.out.println("Titular actualizado correctamente.");
        System.out.println();
    }
}
