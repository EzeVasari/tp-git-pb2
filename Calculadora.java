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
 
     public String multiplicar (String a, String b) {
    	 String respuesta = "";
    	 respuesta = (Double.parseDouble(a)* Double.parseDouble(b))+"";
    	 return respuesta;

    	 }
    	 public String dividir (String a, String b) {
    	 String respuesta = "";
    	 try {
    	 respuesta = (Double.parseDouble(a)/ Double.parseDouble(b))+"";
    	 }
    	 catch (Exception e) {
    	 respuesta ="Error al dividir por cero";
    	 }
    	 return respuesta;

    	 }
 System.out.println("El resultado es " + resultado.toString());
 }
}
