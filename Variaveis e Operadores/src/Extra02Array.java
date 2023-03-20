/*
 * Um dado convencional (6 lados) é lançado 10 vezes e o valor correspondente é anotado. 
 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
 * A seguir determine e imprima a média aritmética dos lançamentos, 
 * contabilize e apresente também quantas foram as ocorrências da maior pontuação
 * Resolução Prof: Luis
 * */
package pacoteJava;

import java.util.Scanner;

public class Extra02Array {

	public static void main(String[] args) {
		int[] dado = new int[10];
		int somaLancamento=0,quantMaior=0,x,maior=0,quantmaior=0;
		float mediaLancamento;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<10;x++) {
			System.out.println("\nDigite o valor do lançamento: ");
			dado[x] = leia.nextInt();//8
			while(dado[x]<1 || dado[x]>6) {
				System.out.println("\nDigite o valor do lançamento novamente: ");
				dado[x] = leia.nextInt();//9 5
			}
			
			somaLancamento += dado[x];
			
			if(dado[x] == 6) {
				quantMaior++;//quantMaior = quantMaior + 1
			}
			
			if(maior<dado[x]) {
				maior = dado[x];
			}
			
		}
		
		for(x=0;x<10;x++) {
			if(dado[x] == maior) {
				quantmaior++;
			}
		}
		mediaLancamento = somaLancamento / 10;
		System.out.println("\nQuantidade de vezes que saiu o maior valor: "+quantMaior);
		System.out.println("\nMédia dos lançamentos: "+mediaLancamento);
		System.out.println("\nO maior lançamento foi: "+maior+" e apareceu: "+quantmaior+" vez(es)");


	}

}
