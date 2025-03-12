package Tarea06_POO_I;
import java.util.Scanner;

public class Raices {

//Creamos el teclado "sc" y las variables "a", "b", "c", "raizPositiva", "raizNegativa" y "discriminante"
	Scanner sc = new Scanner (System.in);
	private int a;
	private int b;
	private int c;
	private double raizPositiva;
	private double raizNegativa;
	public double discriminante;

//Creamos el constructor	
	public Raices(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
//Creamos los getters y los setters
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
//Creamos un metodo que devuelva las raices de los valores introducidos
	public void Raiz(){
		System.out.println("Introduzca los valores numericos de 'A', 'B' y 'C' ");
		System.out.println();
		
	//Pedimos los valores de entrada de A, B y C
		System.out.print("Valor de A: ");
		a=sc.nextInt();
		
		//A debe de ser distinto de 0 porque no se puede dividir por 0
		while (a==0) {
			System.out.print("Error, el valor de A tiene que ser distinto de 0\n"
					+ "Por favor, introduzca otro numero: ");
			a=sc.nextInt();
		}
		System.out.print("Valor de B: ");
		b=sc.nextInt();
		System.out.print("Valor de C: ");
		c=sc.nextInt();
		System.out.println();
		discriminante = Math.pow(b, 2) - 4 * a * c;

		if (discriminante >= 0) {
			//Si el discriminante es positivo se devuelve las raíces y el discriminante
			raizPositiva = ((-b) + Math.sqrt(discriminante)) / (2 * a);
		    raizNegativa = ((-b) - Math.sqrt(discriminante)) / (2 * a);

		    System.out.println("Raíz 1: " + raizPositiva);
		    System.out.println("Raíz 2: " + raizNegativa);
		    System.out.println("Discriminante: " + discriminante);
		    
		  //Si no, se devuelve que no existe una raiz real y el discriminante
		} else {
		    System.out.println("No existen raíces reales.");
		    System.out.println("Discriminante: " + discriminante);
		}

	}
}

