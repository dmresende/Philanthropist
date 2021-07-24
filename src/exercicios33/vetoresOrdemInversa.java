package exercicios33;

public class vetoresOrdemInversa {
	
	public static void main(String[] args) {
		
		int array [] = {1,2,3,4,5,6,7,8,9,10};	
		//int newArray [] = new int [array.length];
		for(int i = 0; i < array.length; i++) { // porque quando  i = 0 ele me retorna 1? ( porque ele est� se referenciando a posi��o, o [0] � a posi��o que est� alocado o n�mero [1];t
			System.out.print(array[i]);
		}
		
		System.out.print("\n");
		
		for(int j = 10; j > array.length; j--) {
			System.out.print(array[j]);
		}
	}

}
//13) Fa�a um programa que receba 10 valores inteiros e os coloque em um vetor.
//Em seguida exiba-os em ordem inversa � ordem de entrada.