package Revsao;

public class revSwap {
	
	public static void main(String[] args) {
		
		String valor1 = " esse é o valor de 1 .";
		String valor2 = " esse é o valor de 2 ."; 
		String valorTemporario = " ";
		
		valorTemporario = valor1; // como se eu tivesse dupluicado o "valor da primeira String"
		valor1 = valor2;
		valor2 = valorTemporario;
		
		
		
		System.out.println(valor1  + valor2);
	}

}
