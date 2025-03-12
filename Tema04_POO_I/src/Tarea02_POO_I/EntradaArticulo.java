package Tarea02_POO_I;

import java.util.Scanner;

public class EntradaArticulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Creamos el escaner	
		Scanner sc = new Scanner (System.in);
		
	//Declaramos e inicializamos las variables
		String codigoBarras="";
		String denominacion="";
		int unidades=0;
		double precioCompra=0;
		int beneficio=0;
		
		
	//Creamos el "articulo 1"
		Articulo articulo1 = new Articulo(codigoBarras, denominacion, unidades, precioCompra, beneficio);
		System.out.println("Introduzca los siguientes datos del Articulo 1");
		
		System.out.print("Introduzca el código de barras: ");
		codigoBarras = sc.nextLine();
		
		System.out.print("Introduzca la denominacion del artículo: ");
		denominacion = sc.nextLine();
		
		System.out.print("Introduzca el número de unidades del artículo: ");
		unidades = sc.nextInt();
		
		System.out.print("Introduzca el precio de compra: ");
		precioCompra = sc.nextDouble();
		
		System.out.print("Introduzca el beneficio de compra (Entre 0 y 100): ");
		beneficio=sc.nextInt();
			while (beneficio<0 || beneficio>100){
				System.out.println("Error, introduzca un beneficio de compra valido (Entre 0 y 100)");
				beneficio=sc.nextInt();
		
		}sc.nextLine();//Vaciamos el Buffer
		
		
	//Creamos el "articulo 2" 
		Articulo articulo2 = new Articulo(codigoBarras, denominacion, unidades, precioCompra, beneficio);

	//Pedimos que introduzca los datos del segundo artículo
		System.out.println("Introduzca los siguientes datos del Artículo 2");

		System.out.print("Introduzca el código de barras: ");
		codigoBarras = sc.nextLine();
		articulo2.setCodigoBarras(codigoBarras);

		System.out.print("Introduzca la denominación del artículo: ");
		denominacion = sc.nextLine();
		articulo2.setDenominacion(denominacion);

		System.out.print("Introduzca el número de unidades del artículo: ");
		unidades = sc.nextInt();
		articulo2.setUnidades(unidades);

		System.out.print("Introduzca el precio de compra: ");
		precioCompra = sc.nextDouble();
		articulo2.setPrecioCompra(precioCompra);

		System.out.print("Introduzca el beneficio de compra (Entre 0 y 100): ");
		beneficio = sc.nextInt();
		while (beneficio < 0 || beneficio > 100) {
		    System.out.println("Error, introduzca un beneficio de compra válido (Entre 0 y 100)");
		    beneficio = sc.nextInt();
		}
		articulo2.setBeneficio(beneficio);

	//Mostramos el PvP del segundo artículo después de configurar correctamente todos los valores
		System.out.println("\nDatos del Artículo 2:");
		System.out.println(articulo2.toString());
		System.out.println("PvP: " + articulo2.pvp());

	//Imprimimos por pantalla cual es el articulo que tiene mas unidades y su PvP
		if (articulo1.getUnidades() > articulo2.getUnidades()) {
	            System.out.println("\nEl artículo con más unidades es:");
	            System.out.println("Nombre: " + articulo1.getDenominacion());
	            System.out.println("PvP: " + articulo1.pvp());
	  } else if (articulo2.getUnidades() > articulo1.getUnidades()) {
	            System.out.println("\nEl artículo con más unidades es:");
	            System.out.println("Nombre: " + articulo2.getDenominacion());
	            System.out.println("PvP: " + articulo2.pvp());
		
	  }        
	//Cerramos el teclado
		sc.close();
	}

}
