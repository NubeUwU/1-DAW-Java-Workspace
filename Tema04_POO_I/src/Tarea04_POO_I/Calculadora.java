package Tarea04_POO_I;

//Creamos el objeto calculadora
public class Calculadora {
	private int num1;
	private int num2;

	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public Calculadora(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//Creamos los metodos a emplear por la calculadora
		public int Suma() {	//Metodo Suma
	        return num1 + num2;
	    }
	 
	    public int Resta() { //Metodo Resta
	        return num1 - num2;
	    }

	    public int Multiplicacion() { //Metodo Multiplicación
	        return num1 * num2;
	    }

	    public double Division() { //Metodo Division
	    	return (double) num1 / num2;
	    }

	    public double Potencia() { //Metodo Potencia
	        return Math.pow(num1, num2);
	    }

	    public int Modulo() { //Metodo Modulo
	        return num1 % num2;
	    }
	
}
