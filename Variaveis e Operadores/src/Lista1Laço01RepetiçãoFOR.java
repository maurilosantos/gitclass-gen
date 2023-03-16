package pacoteJava;

import java.util.Scanner;

public class Lista1Laço01RepetiçãoFOR {
	
	// Exercício 01 da Lista 01 - Laço de Repetição FOR   

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("\nDigite o primeiro número do intervalo: ");
		num1 = leia.nextInt();
		
		System.out.println("\nDigite o último número do intervalo: ");
		num2 = leia.nextInt();
		
		if (num1 < num2) {
			
			for (int i = num1; i <= num2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i+" é múltiplo de 3 e 5.");
				}
			}
			
		} else {
			System.out.println("Intervalor inválido!");
		}
		
	}

}
