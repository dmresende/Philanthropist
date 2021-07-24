package aula2;

public class NumerosImpares {
	
	public static void main(String[] args) {
		
		for (int i = 0; i <= 100; i++) {
			if (i %2 ==1) { // se a divisao do " i " for resto 0 ou seja for resto "par", "ignore e continue"
				continue;
			}
			System.out.print(i + "    "  + " \n");
			
		}
	}

}
