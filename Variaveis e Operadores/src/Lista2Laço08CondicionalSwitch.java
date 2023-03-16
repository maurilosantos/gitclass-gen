package pacoteJava;

import java.util.Scanner;

public class Lista2Laço04CondicionalSwitch {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int cod;
		float valor, saldo = (float) 1000.00;
		
		System.out.println("\nDigite o Operador: ");
		cod = leia.nextInt();
		
		switch (cod) {
		case 1: 
			
			System.out.println("\nOperação - Saldo ");
			System.out.printf("\nSaldo: R$ %.2f", saldo);
			break;
			
		case 2: 
			
			System.out.println("\nOperação - Saque");
			System.out.println("\nDigite o Valor do seu saque: ");
			valor = leia.nextFloat();
			saldo = saldo - valor;
			if (saldo < 0) {
				System.out.println("\nSaldo Insuficiente!");
			} else {
				System.out.printf("\nNovo Saldo: R$ %.2f", saldo);
			}

			break;
			
		case 3: 
			
			System.out.println("\nOperação - Deposito");
			System.out.println("\nDigite o Valor do seu deposito: ");
			valor = leia.nextFloat();
			saldo = saldo + valor;
			
			System.out.printf("\nNovo Saldo: R$ %.2f", saldo);
			break;

		default:
			System.out.println("\nOpção inválida!");
		}
		
	}

}
