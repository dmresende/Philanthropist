package aula4;

import java.util.Scanner;

public class areaQuadradofuncao {
	public static double quadrado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual é a altura do quadrado? ");
		double altura = sc.nextDouble();
		System.out.println("Qual a base do quadrado?");
		double base = sc.nextDouble();
		System.out.println("Calculando...");
		
		return altura * base;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(quadrado());
		
	}

}

//outra forma

/*	public static double areaQuadrado(double lado, double base) {
return lado*base;
}

public static double areaTriangulo(double base, double altura) {
return (base*altura)/2;
}

public static double somaDasAreas(double lado, double base, double baset, double alturat) {
return areaQuadrado(lado, base) + areaTriangulo(baset, alturat);	
}

public static void main(String[] args) {


System.out.println("A area do quadrado é: " + areaQuadrado(2, 2));

System.out.println("A area do triangulo é: " + areaTriangulo(3, 6));

System.out.println(somaDasAreas(0, 0, 0, 0));
	
}


*/