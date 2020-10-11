package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Product;

public class Program {

	public static void main(String[] args) {
	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("enter product data:");
		System.out.println("name:");
		product.name = sc.nextLine();
		System.out.println("price");
		product.price = sc.nextDouble();
		System.out.println("quantity in stock:");
		product.quantity = sc.nextInt();
		
		System.out.println("product data:"  + product);
		
		System.out.println("enter the number of products to be added in stock:");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("update  data:"  + product);
		System.out.println();

		System.out.println("enter the number of products to be removed in stock:");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println();
		
		
		System.out.println("update  data:"  + product);
		
		
		
		sc.close();
	}

}
