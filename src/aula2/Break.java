package aula2;

public class Break {
	
	public static void main(String[] args) {
		
		/*int numero = 7;
		int numeroMultiplicador = 2;
			
		for(int i = 0; i <=10; i++) {
			
			//System.out.println("O n�mero �: " + i);
			numeroMultiplicador = numeroMultiplicador * 3;
			System.out.println("O n�mero multiplicador vale:  " + numeroMultiplicador + "\n" );
		}*/
		
		/*int contador = 0;
		while(contador <=10)  {
			
			System.out.println(contador);
			
			contador++;
			
		}*/
		
		/*for(int i = 1; i<=10; i++ ) {			
			if(i == 7) {				
				break;				
			}
			System.out.println(i);			
		}*/
		
		/*for(int i = 1; i <=10; i++){
			if(i != 3 && i !=7) {
				System.out.println(i);				
			}
		*/
		
/*		for(int i = 1; i <=10; i++) {
			if(i == 3 || i==7) {
				continue; // comando da condi��o pr�-estabelecida no if
			}
			System.out.println(i);	
		} 	*/
		
		
		/*for(int i = 0; i <= 20; i++) {
			if(i %2 == 1) { //%2 � para verificar o resto
				System.out.println(   i   );				
			}
		}*/
		
		int numeros[] = new int [5];    // lista [] Array
		numeros [0] = 8;
		numeros [1] = 7;
		numeros [2] = 9;
		numeros [3] = 10;
		numeros [4] = 2;
		
		//System.out.println(numeros [5]);
		//System.out.println(numeros.length);
		//usar o for para contar posi��es
		
		int[] outrosNumeros = {7,12,17,13,22,101,14,7,0,-3,};
		
		//System.out.println(outrosNumeros.length);
		
		for (int i = 0; i < outrosNumeros.length; i++) { // o .lemgth � para saber a quantidade de elemento;
			if(i %2==0) {
				System.out.println(outrosNumeros[i]);				// index == posi��o != valor == elemento;
			}
			
		}
		
		
		
	}
	
}
