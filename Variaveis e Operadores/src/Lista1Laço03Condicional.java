package pacoteJava;

import java.util.Scanner;

public class Lista1Laço03Condicional {

	public static void main(String[] args) {
		// Exercício 03 Lista 1
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade;
		boolean primeiraVez;
		
		System.out.println("\nNome do Doador: ");
		nome = leia.nextLine();
		System.out.println("\nDigite a Idade do Doador: ");
		idade = leia.nextInt();
		System.out.println("\nPrimeira Doação de Sangue? ");
		primeiraVez = leia.nextBoolean();
		
		if (idade < 18 || idade > 69) {
			System.out.println(nome+" não está apto(a) a doar sangue!");
		} else if (idade >= 60 && idade <= 69 && primeiraVez == false) {
		  System.out.println(nome+" não está apto(a) a doar sangue!");
		} else {
			System.out.println(nome+" está apto(a) a doar sangue!");
		}
		
	}

}
