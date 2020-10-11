package calculo;

import java.util.Locale;
import java.util.Scanner;

public class Porcentagem {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);	
   Scanner sc = new Scanner(System.in);
		
   double a ;
   double b;
   double c;
   double alg;
   
   System.out.println("digite o valor de a");
   a = sc.nextDouble();
   
   System.out.println("digite o valor de b");
   b = sc.nextDouble();
   
   System.out.println("digite o valor de c");
   c = sc.nextDouble();
   
   alg = (-b - Math.sqrt((b*b) -4*a*c))/2*a;
		
	System.out.println("o valor e " + alg);
}
}