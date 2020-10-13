package Salario;

public class Sal {

	public String nome;
	public double salarioBruto;
	public double taxas;
	public double porcentagem;
	
	public double desconto() {
		
	return salarioBruto - taxas;	
}
	public double adicional() {
		
	return salarioBruto += (1 * 00.1);
		
	}
	
	
}
