package Funcionario;

import java.util.Locale;
import java.util.Scanner;

import Salario.Sal;

public class Fun {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Sal sal = new Sal();
		
		System.out.println("digite o nome do funcionario");
		sal.nome = sc.next();
		
		System.out.println("digite o salario bruto do  funcionario");
		sal.salarioBruto = sc.nextDouble();
		
		System.out.println("digite a porcentagem do  funcionario");
		sal.porcentagem = sc.nextDouble();

		
		System.out.println("o nome do funcionario e " + sal.nome);
		
		System.out.println("o salario liquido e  " + sal.desconto());
		
		System.out.println("o salario atualizado do funcionario e " + sal.adicional());
		
		

	}

}
