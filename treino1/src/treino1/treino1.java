package treino1;

import java.util.Scanner;

public class treino1 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		
		double npartidas;
		double vitorias;
		double derrotas ;
		double empate;
		double calculo;
		
		System.out.println("digite o numero de jogos");
		
		npartidas= p.nextDouble();
		
         System.out.println("digite o numero de vitorias ");
		
		vitorias = p.nextDouble();
		
         System.out.println("digite o numero de derrotas ");
		
		derrotas = p.nextDouble();
		
        System.out.println("digite o numero de empates ");
		
		empate = p.nextDouble();
		
		calculo = npartidas * vitorias/ empate + derrotas;
		
		System.out.println("a porcentagem de vitoria e :"  + calculo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
			
			
		
		

	}

}
