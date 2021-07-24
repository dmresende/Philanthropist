package exercicios33;

public class Basico_ValorETroco {
	
	public static void main(String[] args) {
		
		double valorPago = 100.00;
		double valorProduto = 50.00;
		double troco = valorPago - valorProduto;
		
		System.out.println("Com R$" + valorPago + " reais, \nvoc� comprou um produto de: R$" +
				valorProduto + "\nDesta forma seu troco � de: R$" + troco);
	}

}
