package pacoteJava;

import java.util.Scanner;

public class Lista2Laço02CondicionalSwitch {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int cod;
		String nome;
		float salario;
		double novoSalario;
		
		System.out.println("\nNome do Colaborador: ");
		nome = leia.nextLine();
		System.out.println("\nEntre com o Código do Cargo: ");
		cod = leia.nextInt();
		System.out.println("\nEntre com o Salário: ");
		salario = leia.nextFloat();
		
		
		switch (cod) {
		case 1: 
			novoSalario = salario*1.1;
			System.out.println("\nNome do Colaborador: "+nome);
			System.out.println("\nNome do Cargo: Gerente ");
			System.out.printf("\nSalário: R$ %.2f ", novoSalario);
			break;
		case 2: 
			novoSalario = salario*1.07;
			System.out.println("\nNome do Colaborador: "+nome);
			System.out.println("\nNome do Cargo: Vendedor ");
			System.out.printf("\nSalário: R$ %.2f ", novoSalario);
			break;
		case 3: 
			novoSalario = salario*1.09;
			System.out.println("\nNome do Colaborador: "+nome);
			System.out.println("\nNome do Cargo: Supervisor ");
			System.out.printf("\nSalário: R$ %.2f ", novoSalario);
			break;
		case 4: 
			novoSalario = salario*1.06;
			System.out.println("\nNome do Colaborador: "+nome);
			System.out.println("\nNome do Cargo: Motorista ");
			System.out.printf("\nSalário: R$ %.2f ", novoSalario);
			break;
		case 5: 
			novoSalario = salario*1.05;
			System.out.println("\nNome do Colaborador: "+nome);
			System.out.println("\nNome do Cargo: Estoquista ");
			System.out.printf("\nSalário: R$ %.2f ", novoSalario);
			break;
		case 6: 
			novoSalario = salario*1.08;
			System.out.println("\nNome do Colaborador: "+nome);
			System.out.println("\nNome do Cargo: Técnico de TI ");
			System.out.printf("\nSalário: R$ %.2f ", novoSalario);
			break;
		
		default:
			System.out.println("\nOpção inválida!!!");
		}
		
	}
	

}
