package pacoteJava;

import java.util.Scanner;

public class Lista1Laço04Condicional {

	public static void main(String[] args) {
		// Exercício 04 Lista 1
		
		Scanner leia = new Scanner(System.in);
		String nome1, nome2, nome3;
		
		
		System.out.println("\nDigite o primeiro nome da espécie: ");
		nome1 = leia.nextLine();
		System.out.println("\nDigite o segundo nome da espécie: ");
		nome2 = leia.nextLine();
		System.out.println("\nDigite o terceiro nome da espécie: ");
		nome3 = leia.nextLine();
		
		if(nome1.equalsIgnoreCase("vertebrado")) {
			if(nome2.equalsIgnoreCase("ave")) {
				if(nome3.equalsIgnoreCase("carnívoro")) {
					System.out.println("\nÉ uma águia");
				}else {
					System.out.println("\nÉ uma pomba");
				}
			}else {
				if(nome3.equalsIgnoreCase("onívoro")) {
					System.out.println("\nÉ um ser humano");
				}else {
					System.out.println("\nÉ uma vaca");
				}
			}
		}else {
			if(nome2.equalsIgnoreCase("inseto")) {
				if(nome3.equalsIgnoreCase("hematófago")) {
					System.out.println("\nÉ uma pulga");
				}else {
					System.out.println("\nÉ uma lagarta");
				}
			} else {
				if(nome3.equalsIgnoreCase("hematófago")) {
					System.out.println("\nÉ uma sanguessuga");
				}else {
					System.out.println("\nÉ uma minhoca");
				}
			}
		}
			
	}

}
	
