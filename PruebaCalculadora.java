import java.util.Scanner;
public class PruebaCalculadora {
	public static void main(String[] args) {
  Integer a=0;
  Integer b=0 ;
  Double a1=0.0;
  Double b1=0.0;
  Integer opcion = 0;
  

  Scanner teclado = new Scanner(System.in);

  Calculadora calculadora1 = new Calculadora();
    
   do{
    System.out.println("Ingrese su operación \n 1 para dividir \n 2 para multiplicar \n 3 para suma \n 4 para resta");
     
    opcion = teclado.nextInt();
      
   }while(opcion < 1 && opcion > 4);
 
     switch(opcion) {
     case 1:
       System.out.println("Ingrese el primer numero");
       a1 = teclado.nextDouble();
       System.out.println("Ingrese el segundo numero");
       b1 = teclado.nextDouble(); 

       if(b1!=0){

        System.out.println("El resultado es " +calculadora1.division(a1,b1));
       }

       else {

         System.out.println("ERROR! NO SE PUEDE DIVIDIR POR 0 . \n Intente de nuevo :)");

       }

       
       


    	 break;
     case 2:
       System.out.println("Ingrese el primer numero");
       a = teclado.nextInt();
       System.out.println("Ingrese el segundo numero");
       b = teclado.nextInt();
    	System.out.println("El resultado es " +calculadora1.multiplicacion(a,b));
    	 break;
     case 3: 
      System.out.println("Ingrese el primer numero");
       a = teclado.nextInt();
       System.out.println("Ingrese el segundo numero");
       b = teclado.nextInt();
    	 System.out.println("El resultado es " +calculadora1.suma(a,b));
    	 break;
     case 4:
       System.out.println("Ingrese el primer numero");
       a = teclado.nextInt();
       System.out.println("Ingrese el segundo numero");
       b = teclado.nextInt(); 
    	 System.out.println("El resultado es " +calculadora1.resta(a,b));
			
    	 break;
     }
 }
}
