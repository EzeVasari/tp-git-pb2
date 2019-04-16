public class Calculadora {

  private Integer a;
  private Integer b;
  
  public Calculadora(){

  }

public Calculadora(Integer operadorA , Integer operadorB){

  this.a = operadorA;
  this.b = operadorB; 
}

public Integer getA(){
  return this.a;
}

public void setA(Integer nuevoValorDeA){

  this.a= nuevoValorDeA;
}

public Integer getB(){
  return this.a;
}

public void setB(Integer nuevoValorDeB){

  this.a= nuevoValorDeB;
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