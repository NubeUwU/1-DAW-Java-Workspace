package Ejercicio14_Grados_Celsius_Fahrenheit;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio14_Grados_Celsius_Fahrenheit {

	public static void main(String[] args) {
        
		//	Creamos:
		Scanner scanner = new Scanner(System.in);	//	Teclado
        String temperatura;							//	Temperatura
        
        
        //	Pedimos la temperatura al usuario
        System.out.print("Introduce el numero de la temperatura seguido de un espacio y la letra: ");
        temperatura = scanner.nextLine().trim();
        
        
        // Validación con un patrón
        String regex = "^-?\\d+\\s+[cCfF]$"; // Patrón que valida número seguido de espacio y una letra (c, C, f o F)
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(temperatura);
        
        
        if (matcher.matches()) {
            // Separamos el número y la letra
            String[] parts = temperatura.split("\\s+");
            double numero = Double.parseDouble(parts[0]);
            char letra = parts[1].charAt(0);
            
            // Conversion de Fahrenheit a Celsius
            if (letra == 'f' || letra == 'F') {
                double celsius = (numero - 32) * 5 / 9;
                System.out.printf("%.2f grados Fahrenheit equivalen a %.2f grados Celsius.%n", numero, celsius);
                
            // Conversion de Celsius a Fahrenheit
            } else if (letra == 'c' || letra == 'C') {
                double fahrenheit = (numero * 9 / 5) + 32;
                System.out.printf("%.2f grados Celsius equivalen a %.2f grados Fahrenheit.%n", numero, fahrenheit);
            }
            
        } else {
            // Si no cumple con el formato muestra un mensaje
            System.out.println("Datos incorrectos.");
        }
       
        //	Finalizamos el programa
        System.out.println("Fin del programa");
       	scanner.close();
	}

}
