package pacoteJava;

import java.util.Scanner;

public class Lista2Laço01CondicionalSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int cod, qtde;
		float preco, valorTotal;
		
		System.out.println("\nEntre com o Código do Produto: ");
		cod = leia.nextInt();
		System.out.println("\nEntre com a Quantidade: ");
		qtde = leia.nextInt();
		
		
		switch (cod) {
		case 1: 
			preco = 10;
			valorTotal = qtde*preco;
			System.out.println("\nProduto: Cachorro Quente ");
			System.out.printf("\nValor total: R$ %.2f ", valorTotal);
			break;
		case 2: 
			preco = 15;
			valorTotal = qtde*preco;
			System.out.println("\nProduto: X-Salada ");
			System.out.printf("\nValor total: R$ %.2f ", valorTotal);
			break;
		case 3: 
			preco = 18;
			valorTotal = qtde*preco;
			System.out.println("\nProduto: X-Bacon ");
			System.out.printf("\nValor total: R$ %.2f ", valorTotal);
			break;
		case 4: 
			preco = 18;
			valorTotal = qtde*preco;
			System.out.println("\nProduto: Bauru ");
			System.out.printf("\nValor total: R$ %.2f ", valorTotal);
			break;
		case 5: 
			preco = 8;
			valorTotal = qtde*preco;
			System.out.println("\nProduto: Refrigerante ");
			System.out.printf("\nValor total: R$ %.2f ", valorTotal);
			break;
		case 6: 
			preco = 13;
			valorTotal = qtde*preco;
			System.out.println("\nProduto: Suco de Laranja ");
			System.out.printf("\nValor total: R$ %.2f ", valorTotal);
			break;
		
		default:
			System.out.println("\nOpção inválida!!!");
		}
		
	}

}
