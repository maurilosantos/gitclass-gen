package pacoteJava;

import java.util.Scanner;

// Lista 03 - Exercício 05 -  Laço de Repetição DO WHILE

public class Lista3Laço05RepetiçãoDOWHILE {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero, soma=0;
		
		do {
		System.out.println("Digite o número:");
		numero = leia.nextInt(); 
			
				if ( numero > 0 ) {
				 	soma+=numero;
			 	}
		
		} while (numero != 0);
		
		System.out.println("A soma dos números positivos é: "+soma);
		
		
	}

}
