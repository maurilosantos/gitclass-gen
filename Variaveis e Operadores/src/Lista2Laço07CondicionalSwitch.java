package pacoteJava;

import java.util.Scanner;

public class Lista2Laço03CondicionalSwitch {
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
	
		int cod;
		float numero1, numero2, resultado;
	
	System.out.println("\nDigite o 1º número: ");
	numero1 = leia.nextFloat();
	
	System.out.println("\nDigite o 2º número: ");
	numero2 = leia.nextFloat();
	
	System.out.println("\nOperação: ");
	cod = leia.nextInt();
	
	switch (cod) {
	case 1: 
		resultado = numero1 + numero2;
		System.out.println(resultado);
		
		break;
	case 2: 
		resultado = numero1 - numero2;
		System.out.println(resultado);
		break;
	case 3: 
		resultado = numero1 * numero2;
		System.out.println(resultado);
		break;
	case 4: 
		resultado = numero1 / numero2;
		System.out.println(resultado);
		break;

	default:
		System.out.println("\nOpção inválida!");
	}
	
	}
}
