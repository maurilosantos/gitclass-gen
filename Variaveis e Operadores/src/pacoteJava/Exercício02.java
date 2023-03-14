package pacoteJava;

import java.util.Scanner;

public class Exercício02 {
	public static void main(String args[])
	{
		float nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nOlá participante!! ");
		System.out.println("\nDigite sua Primeira Nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nDigite sua Segunda Nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nDigite sua Terceita Nota: ");
		nota3 = leia.nextFloat();
		System.out.println("\nDigite sua Quarta Nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("\nMédia Final: "+media);
		System.out.println("\n Fim.");
		
	}
	
}
