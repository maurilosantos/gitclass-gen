package pacoteJava;

import java.util.Scanner;

public class Lista1Ex02Vetores {

	public static void main(String[] args) {
		
		/*
		 * Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
		 * 
          Todos os elementos dos índices ímpares do vetor 
          Todos os elementos do vetor que são números pares
          A Soma de todos os elementos do vetor
          A Média de todos os elementos do vetor, armazenada em uma variável do tipo real

		 */
		
		Scanner leia = new Scanner(System.in);
		int [] vetor = new int[10];
		int num, soma=0;
		float media;
		
		for (int i = 0; i<10; i++) {
		
			System.out.println("\nDigite os números: ");
			num = leia.nextInt();
			vetor[i] = num;
		}
		
		
		System.out.println("\n Todos os elementos dos índices ímpares do vetor: ");
		
		for (int i = 0; i<10; i++) {
			
			if (i % 2 != 0 && i != 0) {
				 System.out.println(vetor[i]);
			}
			
		}
		
		System.out.println("\n Todos os elementos do vetor que são pares: ");
		
			for (int i = 0; i<10; i++) {
			
			if (vetor[i] % 2 == 0 && vetor[i] != 0) {
				 System.out.println(vetor[i]);
				}
			
			}
			
		
				for (int i = 0; i<10; i++) {
			
				soma+= vetor[i];
						
				}
				System.out.println("\n A Soma de todos os elementos do vetor: "+soma);
				
				media = soma / 10;
				
				System.out.println("\n A Média de todos os elementos do vetor "+media);
				
		
	}

}
