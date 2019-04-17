
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
