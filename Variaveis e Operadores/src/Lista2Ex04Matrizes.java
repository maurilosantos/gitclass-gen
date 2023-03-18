package pacoteJava;

import java.util.Scanner;

public class Lista2Ex04Matrizes {

	public static void main(String[] args) {
		
/*
 * Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano. 
 * As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de números reais, 
 * logo cada linha da matriz serão as notas de um participante. Em um vetor de números reais, 
 * armazene as médias de cada participante e exiba as médias de cada um na tela.
 */
		
		Scanner leia = new Scanner(System.in);
		float [][] notas = new float[10][4];
		float [] medias = new float[10];
		float [] somaNota = new float[10];
		float media=0;
		
		
		for(int linha=0;linha<10;linha++) {
			
			for(int coluna=0;coluna<4;coluna++) {

				System.out.println("\nDigite a "+(coluna+1)+"ª nota do aluno: "+(linha+1));
				notas[linha][coluna] = leia.nextFloat();
				
				
				}
		}
		
		
		
		for(int linha=0;linha<10;linha++) {
			
			for(int coluna=0;coluna<4;coluna++) {

				somaNota[linha] += notas[linha][coluna];
				medias[linha] = somaNota[linha] / 4;
				
				}
		}
		
		
		
		System.out.println("\nAs médias são: ");
		
		for(int linha=0;linha<10;linha++) {
			
			System.out.printf("%.1f\n",medias[linha]);
				
		}
			
		
		
		
		}
		
		

	}


