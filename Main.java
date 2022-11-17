package Aula75;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		
		System.out.println("Entre com os dados do produto");
		System.out.println("Entre com o nome do produto: ");
		String name = read.nextLine();
		System.out.println("Entre com o preço: ");
		double price = read.nextDouble();
		System.out.println("Entre com a quantidade em estoque: ");
		int quantity = read.nextInt();
		
		Product newProduct = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("Dados do produto: "+newProduct);
		
		System.out.println();
		System.out.print("Entre com o número que deseja adicionar ao estoque: ");
		quantity = read.nextInt();
		newProduct.addProducts(quantity);
		
		System.out.println();
		System.out.println("Atualização dos dados: "+newProduct);
		
		System.out.println();
		System.out.print("Entre com o número que deseja remover do estoque: ");
		quantity = read.nextInt();
		newProduct.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Atualização dos dados: "+newProduct);
			
		
		read.close();
	}

}
