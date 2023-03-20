/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal,
 *  ou seja, diagonal principal.

 */

package pacoteJava;

import java.util.Scanner;

public class Extra04Array {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int [][] valores = new int [3][3];
		int num, somaTotal = 0, somaDiagonal = 0;
		
		for (int i = 0; i < valores.length; i++) {
			for ( int j = 0; j < valores.length; j++) {
				System.out.println("\nDigite o valor do lançamento na posição: ("+i+")"+"("+j+") na matriz: ");
				num = leia.nextInt();
				somaTotal += num;
				if (i == j) {
					somaDiagonal+=num;
				}
			}
		}
		
		System.out.println("\nA soma Total: "+somaTotal);
		System.out.println("\nA soma da Diagonal Principal: "+somaDiagonal);
		
		
		
	}

}
