package Tarea03_POO_I;

class Juego {
 private int numAleatorio;

 //Creamos un objeto que genere un numero aleatorio entre "mínimo" y "máximo"
 public Juego(int minimo, int maximo) {
     this.numAleatorio = generaNumeroAleatorio(minimo, maximo);
 }
//Creamos un metodo que genere un numero aleatorio
 public int generaNumeroAleatorio(int minimo, int maximo) {
     return (int) Math.floor(Math.random() * (maximo - minimo + 1) + minimo);
 }
 
//Creamos un metodo que compare los números y devuelva el resultado
 public String mismoNumero(int numero) {
     if (numero > numAleatorio) {
         return "El número es menor que "+numero+". Intentelo de nuevo";
     } else if (numero < numAleatorio) {
         return "El número es mayor que "+numero+". Intentelo de nuevo";
     } else {
         return "¡Has acertado!";
     }
   }
}
