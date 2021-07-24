package aula4;

import java.util.Scanner;

public class idadeNomefuncao {
	public static String mensagensNome(String nome, String ultimoNome) {
		return "O seu primeiro nome é: " + nome + " e o seu último nome é: " + ultimoNome ;
	}
	
	public static String retornaFrase() {
		return "Retornando uma frase de uma função";
	}
	
	public static String mensagem(String nome, int idade) {
		return "Seu nome é: " + nome + " e sua idade é:  " + idade;
	}
	
	public static void main(String[] args) {
		System.out.println(retornaFrase());
		
//		String a = "Diego";
//		String b = "Maia";
//		System.out.println(mensagensNome(a, b));
//		System.out.println(mensagensNome("Dougla", "Resende" ));
//		System.out.println(mensagem(a,30));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira seu nome: " );
		String nome = sc.nextLine();
		
		System.out.println("Insira sua idade: ");
		int idade = sc.nextInt();
		
		System.out.println(mensagem(nome, idade));
	}


}
