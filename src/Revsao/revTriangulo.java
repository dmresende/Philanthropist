package Revsao;

import java.util.Scanner;

public class revTriangulo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("A Area do triângulo é definida por: Area = b * h/2");
		System.out.println("Desta forma , quanto mede a base do truiângulo ?");
		double baseTriangulo =  scanner.nextDouble();
		System.out.println("E quanto mede a altura do triangulo? ");
		double alturaTriangulo = scanner.nextDouble();
		
		System.out.println("A Area do triangulo é de : " + (baseTriangulo * alturaTriangulo) / 2 );
	}

}
