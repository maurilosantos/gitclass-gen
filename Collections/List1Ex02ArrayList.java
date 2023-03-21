package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class List1Ex02ArrayList {

	public static void main(String[] args) {
		
		// Cria a Collection ArrayList, do tipo Integer, chamada numeros
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		Integer num;
		
		// Add os números da Lista
		
				numeros.add(2);
				numeros.add(5);
				numeros.add(1);
				numeros.add(3);
				numeros.add(4);
				numeros.add(9);
				numeros.add(7);
				numeros.add(8);
				numeros.add(10);
				numeros.add(6);
				
		
				System.out.print("\nDigite o número que você deseja encontrar: ");
				num = scanner.nextInt();
				
				
				/* Com a condição de existir o número com o método contains e mostrando o seu índice com
				 o método index.of : */
				
				 if (numeros.contains(num) == true) {
		        	 System.out.print("\nO número "+num+" está localizado na posição: "+numeros.indexOf(num)); 
		         } else {
		        System.out.print("\nO número "+num+" não foi encontrado! ");
		         }
				
				
	}

}
