import java.util.Scanner;

public class Ahorcado {
	public static void main(String[] args) {
  private Integer op1;
  private Integer op2;
  private Integer opcion;
  private Integer resultado;
    
    public void asignarOperandos(Integer op1, Integer op2){
        this.operandoUno = op1;
        this.operandoDos = op2;
    }
        
    Calculadora miCalculadora = new Calculadora();  
    
    do{
    System.out.println("Ingrese su operación /n 1 para dividir /n 2 para multiplicar /n 3 para suma /n 4 para resta");
     
    opcion = teclado.next();
      
    }while(opcion < 1 && opcion > 4);
    
    System.out.println("Ingrese el primer numero");
     a = teclado.next();
    System.out.println("Ingrese el segundo numero");
     b = teclado.next();
      
    miCalculadora.asignarOperandos(op1, op2);
     
    switch(opcion) {
     case 1:
        if (b != 0) {
    	 resultado = miCalculadora.division();
       } else {
        System.out.println("Error, no se puede realizar"); }
    	 break;
     case 2:
    	 resultado = miCalculadora.multiplicacion();
    	 break;
     case 3: 
    	 resultado = miCalculadora.suma();
    	 break;
     case 4: 
    	 resultado = miCalculadora.resta();	
    	 break;
     }
    
        System.out.println("El resultado es " + resultado.toString());
 }
    
    
    public class Calculadora {

	private Integer operandoUno = 0, operandoDos = 0;

	public void asignarOperandos(Integer op1, Integer op2) {

		this.operandoUno = op1;
		this.operandoDos = op2;
	}

	public Integer suma() {
		Integer resultado;
		resultado = this.operandoUno + this.operandoDos;

		return resultado;
	}
        
    public Integer resta(){
        Integer resultado;
		resultado = this.operandoUno - this.operandoDos;

		return resultado;
    }
        
    public Integer multiplicacion(){
        Integer resultado;
        resultado = this.operandoUno * this.operandoDos;
        
        return resultado;
    }
        
    public Integer division(){
        Integer resultado;
        resultado = this.operandoUno / this.operandoDos;
        
        return resultado;
    }

}
}
