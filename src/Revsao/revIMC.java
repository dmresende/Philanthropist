package Revsao;

public class revIMC {
	
	public static void main(String[] args) {
		
		double altura = 1.68;
		double peso = 98.5;
		
		//PARÂMETROS PARA DISTINGUIR IMC;
		double pesoNormalMin = 18.50;
		double pesoNormalMax = 24.9;
		
		double sobrePesoMin = 25;
		double sobrePesoMax = 29.9;
		
		double obesidade1Min = 30;
		double obesidade1Max = 34.9;
		
		double obesidade2Min = 35;
		double obesidade2Max = 39.0;
		
		
		//CALCULO PARA RESULTADO DO IMC;
		double calculoImc = peso / (altura * altura);
		
		//FUNÇÃO PARA ARREDONDAMENTO DO RESULTADO DO CALCULO IMC;
		String valorSemCasaDecimal = String.format("%.2f", calculoImc);
		
		String mensagem = "O seu IMC é: " + valorSemCasaDecimal;
		
		
		//CONDIÇÕES  E RESULTADOS;
		if (calculoImc <= 18.50) {
			System.out.println(mensagem);
			System.out.println("Peso abaixo do desejado. ");
			
		} else if(calculoImc >= pesoNormalMin && calculoImc <= pesoNormalMax){
			System.out.println(mensagem);
			System.out.println("Peso dentro do desejado. ");
			
		} else if (calculoImc >= sobrePesoMin && calculoImc <= sobrePesoMax) {
			System.out.println(mensagem);
			System.out.println("Peso acima do desejado. ");
			
		} else if (calculoImc >= obesidade1Min && calculoImc <= obesidade1Max) {
			System.out.println(mensagem);
			System.out.println("Pesso classificado como Obeso 1");
			
		} else if (calculoImc >= obesidade2Min && calculoImc <= obesidade2Max) {
			System.out.println(mensagem);
			System.out.println("Peso classificado como Obeso 2");
			
		}
			
		
		
		
	}

}
