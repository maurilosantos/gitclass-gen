/*
 *Faça um programa que crie um vetor por leitura 
 *com 5 valores de pontuação de uma 
 *atividade e o escreva em seguida. 
 *Encontre após a maior pontuação e a apresente. 
 */

package pacoteJava;

import java.util.Scanner;

public class Extra01Array {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		int [] vet = new int[5];
		int maiorPontuacao = 0, x;
		
		// crie um vetor e o escreva em seguida:
		
			System.out.println("\nDigite os valores: ");
			vet[0] = leia.nextInt();
			maiorPontuacao = vet[0];
		
		for (x = 1; x < 5; x++) {
			System.out.println("\nDigite os valores: ");
			vet[x] = leia.nextInt();
		}
		
		System.out.println("\nNosso vetor é: ");
		for (x = 0; x < 5; x++) {
			System.out.println(vet[x]);
		}
		
		// Encontre após a maior pontuação e a apresente:
		
		for (x = 0; x < 5; x++) {
			
			if (vet[x] > maiorPontuacao ) {
				maiorPontuacao = vet[x];
				}
		}
		
		
		System.out.println("\nMaior Pontuação: "+maiorPontuacao);

	
		}

	}


