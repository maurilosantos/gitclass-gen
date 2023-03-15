package pacoteJava;
import java.util.Scanner;

public class Exercício01 {
	public static void main(String args[])
	{
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		
		
		
		System.out.println("\nDigite o Salário: ");
		salario = leia.nextFloat();
		System.out.println("\nDigite o Abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("\nSeu novo Salário é: %.2f",novoSalario);
		System.out.println("\n Fim.");
		
	}
	
}
