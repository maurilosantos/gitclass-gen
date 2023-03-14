package pacoteJava;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String args[])
	{
		float n1, n2, n3, n4, calculo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nOlá, vamos calcular! ");
		System.out.println("\nDigite o N1: ");
		n1 = leia.nextFloat();
		System.out.println("\nDigite o N2: ");
		n2 = leia.nextFloat();
		System.out.println("\nDigite o N3: ");
		n3 = leia.nextFloat();
		System.out.println("\nDigite o N4: ");
		n4 = leia.nextFloat();
		
		calculo = n1*n2 - n3*n4;
		
		System.out.println("\nSeu a Diferença é: "+calculo);
		System.out.println("\n Fim.");
		
	}
}
