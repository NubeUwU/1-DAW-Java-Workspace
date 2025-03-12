package Tarea10_Array_Empleados;

public class Empleado {

    // Atributos del objeto
    private String nombre;
    private int edad;
    private double salario;

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Constructor
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    // Método toString
    @Override
    public String toString() {
        return String.format("Nombre: %-20s | Edad: %-3d | Salario: %-10.2f€", nombre, edad, salario);
    }
}
