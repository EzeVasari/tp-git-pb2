public class Calculadora {


public class Ahorcado {
	public static void main(String[] args) {
  private Integer a;
  private Integer b;
  private Integer opcion;
  private Integer resultado;
    
   do{
    System.out.println("Ingrese su operaci�n /n 1 para dividir /n 2 para multiplicar /n 3 para suma /n 4 para resta");
     
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
     case 4:
    	 resultado = a * b;
    	 break;
     case 3: 
    	 resultado = a + b;
    	 break;
     case 2: 
    	 
				resultado = a - b;
			
    	 break;
     }
 System.out.println("El resultado es " + resultado.toString());
 }
=======
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
