package exercicios33;

public class PorcaParafuso7 {
	
	public static void main(String[] args) {
		
		double codUsu = 004;
		
		double cod1 = 001;
		double cod2 = 002;
		double cod3 = 003;
				
		
		if(codUsu == cod1) {
			System.out.println(cod1 + ".  pregos");			
		}else if(codUsu == cod2) {
			System.out.println(cod2 + ".  porcas");
		}else if(codUsu == cod3) {
			System.out.println(cod3 + ".  pregos");
		}else {
			System.out.println("diversos");
		}
		
		
	}

}

//07) Utilize a estrutura if para fazer um programa que retorne o nome de um produto a partir do c�digo do mesmo. Considere os seguintes c�digos:
//001 ? Parafuso; 002 ? Porca; 003 ? Prego; Para qualquer outro c�digo indicar? Diversos?