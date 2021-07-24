package exercicios33;

public class LadosTriangulo {
	
	public static void main(String[] args) {
		
	double lado1 = 0;
	double lado2 = 2;
	double lado3 = 5;
	
	if(lado1 == 0 || lado2 == 0 || lado3 ==0 ) {
		System.out.println("nenhum dos lados pode ser igual a zero;");
	}else if (lado1 > lado2 + lado3 || lado2 > lado1 + lado3 || lado3 > lado1 + lado2) {
		System.out.println("um lado n�o pode ser maior do que a soma dos outros dois;");
	}else if (lado1 == lado2 && lado1 == lado3) {
		System.out.println("eq�il�tero (3 lados iguais);");		
	}else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
		System.out.println("is�sceles (2 lados iguais);");
	}else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
		System.out.println("escaleno (3 lados diferentes).");
	}
	
	
	}

}
