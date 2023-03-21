package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class List2Ex04Set {

	public static void main(String[] args) {

		// Cria a Collection Set, do tipo Integer chamada setNumeros
		Set<Integer> setNumeros = new HashSet<Integer>();
		Scanner scanner = new Scanner(System.in);
		Integer valor;
		
		// Add os números
		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);

		 System.out.print("\nDigite o número que você deseja encontrar: ");
         valor = scanner.nextInt();
     
         // Verificando com o método contains se existe o valor digitado.
         
         if (setNumeros.contains(valor) == true) {
        	 System.out.print("\nO número "+valor+" foi encontrado! "); 
         } else {
        System.out.print("\nO número "+valor+" não foi encontrado! ");
         }
				
		
	}

}
