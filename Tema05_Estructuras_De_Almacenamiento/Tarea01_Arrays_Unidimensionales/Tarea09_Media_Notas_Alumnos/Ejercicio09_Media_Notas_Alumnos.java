package Tarea09_Media_Notas_Alumnos;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ejercicio09_Media_Notas_Alumnos {
    
	//Metodo para calcular la nota media
    public static void notaMedia() {
        
    	//Creamos el teclado
    	Scanner sc = new Scanner(System.in);
       
        //Iniciamos los atributos "aprobados" "notaTotal" "notaSuperior"
        int aprobados = 0;
        double notaTotal = 0;
        int notaSuperior = 0;
        
        
        //Pedimos el número de alumnos
        System.out.print("¿Cuántos alumnos son?: ");
        int alumnos = sc.nextInt();
        while (alumnos <=0) {
        	System.out.print("Error, el número de alumnos tiene que ser mayor que 0\n"
        			+ "Introduzca un número valido de alumnos: ");
        	alumnos = sc.nextInt();
        }
        
        
        //Creamos un array que guarde las notas de los alumnos
        double[] notasAlumnos = new double[alumnos];        
        
        //Pedimos la nota de cada alumno
        for(int i = 0; i < alumnos; i++) {
            System.out.print("Nota del alumno " + (i + 1) + " : ");
            double nota = sc.nextDouble();
            
            //Si la nota no esta comprendida entre 0 y 10 muestra un error
            while (nota < 0 || nota > 10) {
                System.out.print("Error, la nota debe estar entre 0 y 10 : ");
                nota = sc.nextDouble();
            }
            
            //Almacenamos las notas de los alumnos en un array
            notasAlumnos[i] = nota;
            notaTotal += nota;
            
            //Si la nota es mayor que 5, aumenta la cantidad de aprobados
            if (nota >= 5) {
                aprobados++;
            }
        }
        
        //Calculamos la nota media de los alumnos y la redondeamos a 4 decimales
        double notaMedia = notaTotal / alumnos;
        BigDecimal bigDecimalNotaMedia = new BigDecimal(notaMedia);
        BigDecimal notaMediaRedondeada = bigDecimalNotaMedia.setScale(4, RoundingMode.HALF_UP);
        
        //Si entre las notas de los alumnos hay alguna que sea superior a la media, incrementa notaSuperior
        for (double nota : notasAlumnos) {
            if (nota > notaMedia) {
                notaSuperior++;
            }
        }
        
        //Mostrammos por pantalla la notaMedia, la cantidad de aprobados y los alumnos con una nota superior a la media
        System.out.println("\nLa nota media de los alumnos es: " + notaMediaRedondeada);
        System.out.println("Han aprobado: " + aprobados + " alumnos");
        System.out.println("Tienen una nota superior a la media: " + notaSuperior + " alumnos\n");
        
        
        //Cerramos el teclado
        sc.close();
    }
    
    
    //Main
    public static void main(String[] args) {
        
    	//Llamamos al metodo notaMedia
    	notaMedia();
    	
    	//Mostramos que ha finalizado el programa
        System.out.println("Fin del Programa");
    }
}