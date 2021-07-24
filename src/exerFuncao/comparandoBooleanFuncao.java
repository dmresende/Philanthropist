package exerFuncao;

import java.util.Scanner;

public class comparandoBooleanFuncao {	
		
	public static void compara() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual primeiro numero para comparação? ");
		int a = sc.nextInt();
		
		System.out.println("Qual o segundo número para comparação ? ");
		int b = sc.nextInt();
		
		boolean comparando = a ==b;
		System.out.println(comparando);	
		
	}

	public static void main(String[] args) {
		
		compara();
		
				
	}

}
