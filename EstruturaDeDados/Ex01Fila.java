package EstruturaDeDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01Fila {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		String cliente;
		int opcao;
		
		
		
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            GERENCIAMENTO FILA DO BANCO              ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1: Adicionar um novo Cliente na fila.    ");
			System.out.println("            2: Listar todos os Clientes na fila      ");
			System.out.println("            3: Chamar (retirar) uma pessoa da fila   ");
			System.out.println("            0: O programa deve ser finalizado.       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("\nPrograma Finalizado!");
				leia.close();
				System.exit(0);
			}
			
			
			switch (opcao) {
				case 1:
					System.out.println("Digite o nome do Novo Cliente: \n\n");
					cliente = leia.next();
					
					fila.add(cliente);
					System.out.println("\nCliente Adicionado!");
					
					break;
				case 2:
					System.out.println("Todos os Clientes da Fila: \n\n");
					
					Iterator<String> iCliente = fila.iterator();
					
					while(iCliente.hasNext()) {
						System.out.println(iCliente.next());
					}
					
					break;
				case 3:
					if(fila.isEmpty()) {
						System.out.println("\nFila está vazia! ");

					}else {
						System.out.println("\nPróximo Cliente a ser chamado: " + fila.poll());
					}
					
					break;
				
				default:
					
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
		
		
		
		
		
		
	}

	

}
