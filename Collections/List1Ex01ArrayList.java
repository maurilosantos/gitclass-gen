package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class List1Ex01ArrayList {

	public static void main(String[] args) {
	
				// Cria a Collection ArrayList, do tipo String, chamada cores
				ArrayList<String> cores = new ArrayList<String>();
				Scanner scanner = new Scanner(System.in);
				String cor;
			
				// Fazendo a chamada doas cores pelo usuário:
				
					for (int i = 0; i < 5; i++) {
			            System.out.print("\nInsira uma cor: ");
			            cor = scanner.nextLine();	
			            cores.add(cor);
					}
				
				
				
				// Mostra na Tela todas as cores: 
				System.out.println(" ");
				System.out.println("\nCores Inseridas: ");
				Iterator<String> iCores = cores.iterator();
				
				while(iCores.hasNext()) {
					
					System.out.println(iCores.next());
				}
		
				// Odenando em ordem crescente
				
				Collections.sort(cores, null);
				System.out.println("\nCores Ordenadas: ");
				
				Iterator<String> iCor = cores.iterator();
				
				while(iCor.hasNext()) {
					
					System.out.println(iCor.next());
				}
				
				
				
				
	}

}
