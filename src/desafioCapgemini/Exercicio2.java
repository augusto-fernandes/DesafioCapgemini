package desafioCapgemini;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome de usuario por favor: ");
		String nome = sc.nextLine();
		
		System.out.printf("a senha precisa ter no minimo 6 caracteres" 
				+ "\n1 digito" 
				+ "\n1 letra minuscula"
				+ "\n1 letra maiscula" 
				+ "\n1 caractere especial\n");

		System.out.println("digite a senha: ");
		String senha = sc.nextLine();

		if (senha.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$^&*()-+]).{6,}")) {
			System.out.println(nome + "! seu cadastro foi realizado!");
		} else {
			System.out.println("sua senha não é forte o suficiente!");
		}

		sc.close();
	}

}
