package exercicios33;

public class forMediaAritimetica {
	
	public static void main(String[] args) {
		//o que eu quero fazer?
		int limite = 50;
		double soma = 0;
		//As condi��es necess�rias para alcan�ar meus objetivos
		for(int i = 1; i <= limite; i++) {
			soma += Math.round(Math.random()*50);			
		}		
		double resultado = soma / limite; // a vari�vel "resultado" tem que estar depois do for, isso � importante porque as vari�veis do for s�o declaradas dentro dele e podem ser chamadas de fora para dentro para fazer opera��es, mas o resultado que far� a opera��o metem�tica tem que estar depois dele;
		System.out.println(soma);
		System.out.println(resultado);
	}

}
