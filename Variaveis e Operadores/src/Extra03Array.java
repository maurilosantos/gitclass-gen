/*
 * Escreve um programa que lê duas matrizes N1 (3,2) e N2(3,2) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as subtrações dos elementos de mesma posição das matrizes N1 e N2.

 */

package pacoteJava;

import java.util.Scanner;

public class Extra03Array {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int [][] N1 = new int[3][2];
		int [][] N2 = new int[3][2];
		int [][] M1 = new int[3][2];
		int [][] M2 = new int[3][2];
		
		int numN1, numN2;
		
		for (int i = 0; i < 3 ; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("\nDigite o valor do lançamento na posição: ("+i+")"+"("+j+") de N1: ");
				numN1 = leia.nextInt();
				N1[i][j] = numN1;
			}
		}
		
		for (int i = 0; i < 3 ; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("\nDigite o valor do lançamento na posição: ("+i+")"+"("+j+") de N2: ");
				numN2 = leia.nextInt();
				N2[i][j] = numN2;
			}
		}
		
		//M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2:
		
		for (int i=0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				M1[i][j] = N1[i][j] + N2[i][j];
			}
		}
		
		// M2 cujos elementos serão as subtrações dos elementos de mesma posição das matrizes N1 e N2:
		
		for (int i=0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				M2[i][j] = N1[i][j] - N2[i][j];
			}
		}
		// Fim
		
		
		// Caso pedisse, Mostrando M1 e M2:
		
		System.out.println("\nMatriz M1 e M2: ");

		for (int i=0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
			System.out.println(M1[i][j]);
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		
		for (int i=0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
		
			System.out.println(M2[i][j]);
			}
			System.out.println(" ");
		}
		
	
	}
}

