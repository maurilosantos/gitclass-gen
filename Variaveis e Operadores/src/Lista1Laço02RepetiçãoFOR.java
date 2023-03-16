package pacoteJava;

import java.util.Scanner;

public class Lista1Laço02RepetiçãoFOR {

	public static void main(String[] args) {
		
		 // Exercício 02 da Lista 01 - Laço de Repetição FOR 
		
		Scanner leia = new Scanner(System.in);
		int num, par=0, impar=0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("\nDigite o número: ");
			num = leia.nextInt();
			if(num % 2 == 0 ) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("\nTotal de números pares: "+par);
		System.out.println("\nTotal de números ímpares: "+impar);



	}

}
