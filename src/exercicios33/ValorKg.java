package exercicios33;

public class ValorKg {
	
	public static void main(String[] args) {
		
		double valorKg = 10;
		double consumoEmGramas = 500;
		double valorDaGrama = valorKg / 1000;
		double precoAPagar = valorDaGrama * consumoEmGramas;
		
		System.out.println(String.format("Valor a ser pago: R$" +  precoAPagar));
	}

}
