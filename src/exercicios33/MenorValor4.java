package exercicios33;

public class MenorValor4 {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		if(a < b && a < c && a < d) {
			System.out.println("Esse � o menor n�mero (a): " + a);
		}else if(b < a && b < c && b < d){
			System.out.println("Esse � o menor n�mero (b): " + b);
		}else if(c < a && c < b && c < d) {
			System.out.println("Esse � o menor n�mero (c): " + c);			
		}else if (d < a && d < b && d < c) {
			System.out.println("Esse � o menor numero (d): " + d);
		}else if (a == b && a == c && a == d){
			System.out.println("Todos os n�meros s�o iguais ;)");
		}
	}

}
