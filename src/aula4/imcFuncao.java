package aula4;

import java.util.Scanner;

public class imcFuncao {
	public static void mensagem() {
		System.out.println("oi");
	}	
	
	public static double imc(double altura, double peso) {
		return peso/(altura*altura);
	}
	
	/*public static void verificaIdade() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual a sua idade: ");
		int idade = sc.nextInt();
		
		if(idade < 0) {
			System.out.println("Idade inválida");
		}else {
			int resultado = 2021 - idade;
			System.out.println("Você nasceu no ano " + resultado);
		}
		
	}*/
	
	public static void main(String[] args) {
//		mensagem();
//		
//		System.out.println(imc(1.68, 100.0));
//		double valor = imc(1.68, 100.0);
//		System.out.println(valor);
		
		
	}

}
