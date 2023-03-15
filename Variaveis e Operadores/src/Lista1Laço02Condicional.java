package pacoteJava;

import java.util.Scanner;

public class Lista1Laço02Condicional {

	public static void main(String[] args) {
		
		int n1;
		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com o número: ");
		n1 = leia.nextInt();
		
		if (n1 % 2 == 0 && n1 > 0) {
			System.out.println("\nO Número "+n1+" é par e positivo!");
		} else if (n1 % 2 == 0 && n1 < 0) {
			System.out.println("\nO Número "+n1+" é par e negativo!");
		} else if (n1>0) {
			System.out.println("\nO Número "+n1+" é ímpar e positivo!");
		} else if (n1<0) { 
			System.out.println("\nO Número "+n1+" é ímpar e negativo!");
		}
	}

}
