package Revsao;

import java.util.Scanner;

public class revTriangulo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("A Area do tri�ngulo � definida por: Area = b * h/2");
		System.out.println("Desta forma , quanto mede a base do trui�ngulo ?");
		double baseTriangulo =  scanner.nextDouble();
		System.out.println("E quanto mede a altura do triangulo? ");
		double alturaTriangulo = scanner.nextDouble();
		
		System.out.println("A Area do triangulo � de : " + (baseTriangulo * alturaTriangulo) / 2 );
	}

}
