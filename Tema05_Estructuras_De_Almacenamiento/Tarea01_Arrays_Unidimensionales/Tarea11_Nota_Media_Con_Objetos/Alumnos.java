package Tarea11_Nota_Media_Con_Objetos;

public class Alumnos {
	
	// Atributos
	private String nombre;
	private double notaMediaAlumno;
	
	
	// Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNotaMediaAlumno() {
		return notaMediaAlumno;
	}

	public void setNotaMediaAlumno(double notaMediaAlumno) {
		this.notaMediaAlumno = notaMediaAlumno;
	}

	
	// Constructor
	public Alumnos(String nombre, double notaMediaAlumno) {
		super();
		this.nombre = nombre;
		this.notaMediaAlumno = notaMediaAlumno;
	}
	
	// Metodo toString
    @Override
    public String toString() {
        return String.format("Nombre: %-20s | Nota Media: %.2f", nombre, notaMediaAlumno);
    }
	
	
	
}
