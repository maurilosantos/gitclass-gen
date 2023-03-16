package pacoteJava;

import java.util.Scanner;

//Lista 03 - Exercício 06 -  Laço de Repetição DO WHILE

public class Lista3Laço06RepetiçãoDOWHILE {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		int numero, soma = 0, cont = 0;
		float media;
		
		do {
			System.out.println("Digite o número:");
			numero = leia.nextInt(); 
			
				
			if ( numero % 3 == 0 && numero != 0) {
			    soma+=numero;
			    cont++;
			    System.out.println(soma);
				 	}
			
			} while (numero != 0);
		
		    media = soma / cont;

			System.out.println("\nA média de todos os números múltiplos de 3 é: "+media);
		
	}

}
