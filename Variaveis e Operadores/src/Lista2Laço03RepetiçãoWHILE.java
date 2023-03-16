package pacoteJava;

import java.util.Scanner;

public class Lista2Laço03RepetiçãoWHILE {
	
	 // Exercício 03 da Lista 02 - Laço de Repetição WHILE  
	
	public static void main(String[] args) {
	
		
		Scanner leia = new Scanner(System.in);
		int idade, contadorMenor = 0, contadorMaior = 0, contadorT=0;
		
		System.out.println("Digite uma idade:");
		idade = leia.nextInt();
		
		while (idade > 0){
			
			System.out.println("Digite uma idade:");
			idade = leia.nextInt();
			
			if (idade < 21) {
				contadorMenor++;
				
			} else if (idade > 50) {
				contadorMaior++;
				
			}
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: "+contadorMenor);
		System.out.println("\nTotal de pessoas maiores de 50 anos: "+contadorMaior);

		
	}

}
