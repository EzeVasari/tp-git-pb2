import java.util.Scanner;

public class Ahorcado {
	public static void main(String[] args) {
  private Integer a;
  private Integer b;
  private Integer opcion;
  private Integer resultado;
    
   do{
    System.out.println("Ingrese su operación /n 1 para dividir /n 2 para multiplicar /n 3 para suma /n 4 para resta");
     
    opcion = teclado.next();
      
   }while(opcion < 1 && opcion > 4);
    
    System.out.println("Ingrese el primer numero");
     a = teclado.next();
    System.out.println("Ingrese el segundo numero");
     b = teclado.next();
 
     switch(opcion) {
     case 1:
        if (b != 0) {
    	 resultado = a / b;
       } else {
        System.out.println("Error, no se puede realizar"); }
    	 break;
     case 2:
    	 resultado = a * b;
    	 break;
     case 3: 
    	 resultado = a + b;
    	 break;
     case 4: 
    	 
				resultado = a - b;
			
    	 break;
     }
 System.out.println("El resultado es " + resultado.toString());
 }
}
