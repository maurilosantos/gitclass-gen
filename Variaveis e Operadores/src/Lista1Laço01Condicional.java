package pacoteJava;

import java.util.Scanner;

public class Lista1Laço01Condicional {

	public static void main(String[] args) {
		
		float A, B, C, soma;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro valor: ");
		A = leitura.nextFloat();
		System.out.println("\nEntre com o Segundo valor: ");
		B = leitura.nextFloat();
		System.out.println("\nEntre com o Terceiro valor: ");
		C = leitura.nextFloat();
		
		soma = A + B;
		
		if (soma > C) {
			System.out.println("\nA Soma de A + B é Maior do que C");
		} else if (soma < C) {
			System.out.println("\nA Soma de A + B é Menor do que C");
		} else {
			System.out.println("\nA Soma de A + B é Igual a C");
		}

	}

}
