package desafioCapgemini;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
// Primeiro desafio Capgemini
	Scanner sc = new Scanner(System.in);	
		StringBuilder sb = new StringBuilder();
		String estrela = "*";
		
		System.out.print("Digite o tamanho da escada ");
		int escada = sc.nextInt();

		for (int i = 0; i < escada; i++) {
			for (int j = 1; j < escada-i; j++)
				System.out.print(" ");
			System.out.println(sb.append(estrela));
		}
		sc.close();
	}
}

