package pacoteJava;

import java.util.Scanner;
// Lista 3 - Exercício 04 - Laço de Repetição WHILE

public class Lista2Laço04RepetiçãoWHILE {
public static void main(String[] args) {
		
		int idade, genero, categoria,i1 = 0,i2=0,i3=0,i4=0;
		char continuar;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nCadastrar colaboradore? \n(S/N)");
		continuar = leia.next().charAt(0);
		
		
		while (continuar == 'S') {
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			System.out.println("\nDigite o genero: \n1 - Masculino\n2 - Feminino\n3 - Outros");
			genero = leia.nextInt();
			System.out.println("\n Digite a categoria: \n1 - Backend\n2 - Frontend\n3 - Mobile\n4 - FullStack");
			categoria = leia.nextInt();
			System.out.println("\nDeseja continuar? \n(S/N)");
			continuar = leia.next().charAt(0);
			
			if(categoria == 1) {
				i1++;
			}else if (genero == 2 && categoria == 2) {
				i2++;
			}else if (genero == 1 && categoria == 3 && idade > 40) {
				i3++;
			}else if (genero == 2 && categoria == 4 && idade < 30) {
				i4++;
			}	
		
			
		}
		
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: "+i1);
		System.out.println("\nTotal de mulheres desenvolvedoras Frontend: "+i2);
		System.out.println("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: "+i3);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: "+i4);

	}
}
