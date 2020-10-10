package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
        double xa,xb,xc,ya,yb,yc;
   
     System.out.println("entro com o lado do triangulo x");
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextDouble();
		
		System.out.println("entre com o lado do triangulo y");
		ya = sc.nextDouble();
		yb = sc.nextDouble();
		yc = sc.nextDouble();
		
		double p = (xa+xb+xc)/ 2.0;
		double areax = Math.sqrt(p*(p-xa)*(p-xb)* (p-xc) );
		
	     p = (ya+yb+yc)/ 2.0;
		double areay = Math.sqrt(p*(p-ya)*(p-yb)* (p-yc) );
		
		System.out.printf("triangulo x area: %.4f%n", areax);
		System.out.printf("triangulo x area: %.4f%n", areay);
		
		if (areax> areay) {
			
			System.out.println("maior area x");
		}
		else {
			
			System.out.println("maior area y");
		}
	}
	
	

}
