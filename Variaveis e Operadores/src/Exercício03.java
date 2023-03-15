package pacoteJava;

import java.util.Scanner;

public class Exercício03 {
	public static void main(String args[])
	{
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nOlá Colaborador! ");
		System.out.println("\nDigite seu Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("\nDigite seu Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("\nDigite suas Horas Extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("\nDigite seus Descontos ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		
		System.out.printf("\nSeu Salário Líquido é: %.2f",salarioLiquido);
		System.out.println("\n Fim.");
		
	}
	
	

}
