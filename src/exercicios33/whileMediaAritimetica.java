package exercicios33;

public class whileMediaAritimetica {

	public static void main(String[] args) {
		//cria��o de vari�veis para a declara��o dos valores a serem comparados;
		double soma = 0; // soma est� vazia par receber o valor da _soma_;
		int quantNumeros = 50; // Aqui eu quis j� definir o limite;
		double resultado = soma / quantNumeros; // como as boas pr�ticas ensinam, uma vari�vel para receber um resultado de outras vari�veis;
		int contador= 1; // o contador eu quiz que come�asse em 1 para ter o lapso de 1-50 e n�o de 0-49;
						
		while(contador <= quantNumeros) { //compara��o de vari�veis
		soma += Math.round(Math.random() *50); // lembrando que para somar eu uso o "+=", e a fun��o Math para a opera��o matematica e para gerar n�meros aleat�rios;
		contador++; 
		}			
		System.out.println(soma); // quis conferir a conta, mas � importante que seja printado fora do escopo do for;
		System.out.print(soma / quantNumeros); // equa��o para m�dia aritim�tica;	
		
				
	}

		

}