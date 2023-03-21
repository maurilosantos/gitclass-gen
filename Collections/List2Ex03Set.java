package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class List2Ex03Set {

	public static void main(String[] args) {
	
		Set<Integer> setNumeros = new HashSet<Integer>();
		Scanner scanner = new Scanner(System.in);
		Integer valor;
		
		// Insererindo até 10 valores não-repetidos.
		for (int i = 0; i < 10; i++) {
            System.out.print("\nInsira os valores não-repetidos: ");
            valor = scanner.nextInt();	
            setNumeros.add(valor);
		}
		
	
		System.out.println("\nListar dados do Set: ");
		// Mostrando os valores com a classe Iterator
		
		Iterator<Integer> iNum = setNumeros.iterator();
		
		while(iNum.hasNext()) {
			
			System.out.println(iNum.next());
		}
		
		
		
		
		
	}

}
