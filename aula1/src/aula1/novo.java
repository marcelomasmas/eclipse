package aula1;
import java.util.Scanner;
public class novo {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina =0;
		int diesel = 0;
		
		System.out.println("digite um numero ");
		alcool = sc.nextInt();
		
		if (alcool == 1) {
			System.out.println("o cliente comprou alcool");
			
			}
		else if(gasolina == 2) {
			System.out.println("o cliente comprou gasolina");
			
		}
		else if (diesel== 3) {
			System.out.println("o cliente comprou diesel");
			
		}
		else {
			System.out.println("muito obrigado ");
			
			
		}
		
		
		
	
		
	
	
	
	
	

}}
