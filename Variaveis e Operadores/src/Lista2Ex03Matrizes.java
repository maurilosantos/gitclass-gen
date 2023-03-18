package pacoteJava;

import java.util.Scanner;

public class Lista2Ex03Matrizes {

	public static void main(String[] args) {

		/*
		 * Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
			Todos os elementos da Diagonal Principal
			Todos os elementos da Diagonal Secundária
			A Soma de todos os elementos da Diagonal Principal
			A Soma de todos os elementos da Diagonal Secundária
			

		 */
			
		
			Scanner leia = new Scanner(System.in);
		
			int [][] matriz = new int[3][3];
			int somaDiagonalP = 0, somaDiagonalS = 0;
			int [] elementosP = new int[3];
			int [] elementosS = new int[3];
			
		
			 	
	 
	  	for(int linha=0;linha<3;linha++) {
			
			for(int coluna=0;coluna<3;coluna++) {

				System.out.println("\nDigite o "+(coluna+1)+"ª elemnento: ");
				matriz[linha][coluna] = leia.nextInt();
				
				
				}
		}
		
			
			
			
			
			for(int linha=0;linha<3;linha++) {
			
				for(int coluna=0;coluna<3;coluna++) {
	
					if (linha == coluna) {
					
					 somaDiagonalP += matriz[linha][coluna];
					 elementosP[linha] = matriz[linha][coluna];
					
					}
				}
			}
			
			for(int linha=0;linha<3;linha++) {
				
				for(int coluna=0;coluna<3;coluna++) {
	
					if (linha + coluna == matriz.length - 1) {
					
					 somaDiagonalS += matriz[linha][coluna];
					 elementosS[linha] = matriz[linha][coluna];
					
					}
				}
			}
			
			
			
			
			System.out.println("\nElementos da Diagonal Principal: ");
		
			for (int i = 0; i < elementosP.length; i++) {
	            System.out.print(elementosP[i] + " ");
	        }
			
			
			System.out.println("\nElementos da Diagonal Secundária:: ");
			
			for (int i = 0; i < elementosP.length; i++) {
	            System.out.print(elementosS[i] + " ");
	        }
			
			System.out.println("\nA Soma de todos os elementos da Diagonal Principal é: "+somaDiagonalP);
			System.out.println("\nA Soma de todos os elementos da Diagonal Secundária é: "+somaDiagonalS);
			
			

	}

}
