public class Calculadora {

  private Integer numeroA;
  private Integer numeroB;
  
  public Calculadora(){

  }

public Calculadora(Integer operadorA , Integer operadorB){

  this.numeroA = operadorA;
  this.numeroB = operadorB; 
}

public Integer getA(){
  return this.numeroA;
}

public void setA(Integer nuevoValorDeA){

  this.numeroA= nuevoValorDeA;
}

public Integer getB(){
  return this.numeroB;
}

public void setB(Integer nuevoValorDeB){

  this.numeroB= nuevoValorDeB;
}

public Integer suma(Integer a , Integer b){

  Integer suma =0;

  return suma = a+b;
}

public Integer resta(Integer a , Integer b){

  Integer resta =0;

  return resta = a-b;
}

public Integer multiplicacion(Integer a , Integer b){

  Integer multiplicacion =0;

  return multiplicacion = a*b;
}

public Double division (Double a , Double b){

  Double division =0.0D;

  if (b != 0) {
        division = a / b;
       } 

       else {
        
        System.out.println("Error, no se puede realizar"); 
    }

    return division;

}
    
  
}
