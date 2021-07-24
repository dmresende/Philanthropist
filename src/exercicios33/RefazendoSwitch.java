package exercicios33;

public class RefazendoSwitch {
	
	public static void main(String[] args) {
		
		int num = 3;// variavel que ser� comparada no switch
		
		int c1 = 1; // cada condi��o que n�o sera a vari�vel de par�metro ser� usada com case, ou seja 
		int c2 = 2; // o sistema pegara o par�metro "num" e comparara ao c1, se for ele imprimir� caso contr�rio segue a leitura.
		int c3 = 3;
		
		
		switch(num) {
		case 1: //c1
			System.out.println(c1 + ". pregos");
			break;
		case 2: //c2
			System.out.println(c2 + ". porcas");
			break;
		case 3: //c3
			System.out.println(c3 + ". pregos");
			break;
		default: // nenhuma das vari�veis acima;
			System.out.println("*Diversos*");
		}
		
	}

}
