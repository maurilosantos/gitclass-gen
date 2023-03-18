package pacoteJava;

import java.util.Scanner;

public class Lista1Ex1Vetores {

	public static void main(String[] args) {
		
		/*
		 * Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
		 *  construa um algoritmo que consiga pesquisar dados no vetor, 
		 *  onde o usuário irá digitar um número e o programa deve exibir na tela 
		 *  a posição deste número no vetor. Caso o número não seja encontrado, 
		 *  a mensagem: “Não foi encontrado!” deve ser exibida na tela.
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int [] vetor = new int[10];
		int num;
		boolean encontrou = false;
		
		vetor[0] = 2;
		vetor[1] = 5;
		vetor[2] = 1;
		vetor[3] = 3;		
		vetor[4] = 4;
		vetor[5] = 9;
		vetor[6] = 7;
		vetor[7] = 8;
		vetor[8] = 10;
		vetor[9] = 6;
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
		num = leia.nextInt();
	
		
		
		for (int i = 0; i < 10; i++) {
			if (num == vetor[i]) {
			System.out.println("\nO número "+num+" está localizado na posição: "+i);
			encontrou = true;
			  
			}
		}
		
		
		
		if (!encontrou) {
	      System.out.println("Não foi encontrado!");
	    }
		
		
	}

}
