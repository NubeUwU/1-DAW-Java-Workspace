package Tarea05_POO_I;

//Creamos el objeto Titular
public class Titular {
	
//Creamos los atributos del titular (nombre, apellidos, dni, direccion)
	private String nombre;
	private String apellidos;
	private String dni;
	private String direccion;
	
//Creamos los getters y los setters	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
//Creamos el constructor del objeto titular
	public Titular(String nombre, String apellidos, String dni, String direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
	}
	
}

