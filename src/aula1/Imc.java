package aula1;

public class Imc {

	public static void main(String[] args) {
		
				// lembre-se, vai por bloco;
				double altura = 1.68;
				double peso = 95.5;

				
				double pesoNormalMin = 18.50;
				double pesoNormalMax = 24.90;
				double sobrePesoMin = 25;
				double sobrePesoMax = 29.9;
				double obesidadeGrau1Min = 30;
				double obesidadeGrau1Max = 34.9;
				double obesidadeGrau2Min = 35;
				double obesidadeGrau2Max = 39.0;

				double calculoImc = peso / (altura * altura); // calculo imc
				String valorSemCasaDecimal = String.format("%.2f", calculoImc ); // formata��o para n�o dar muitos zeros
				String mensagem = " O seu IMC �:  " + valorSemCasaDecimal ; // mensagem para usu�rio

				if (calculoImc <= 18.50) {
					System.out.println(mensagem);
					System.out.println("seu peso est� abaixo do esperado");
				} else if (calculoImc >= pesoNormalMin && calculoImc <= pesoNormalMax) {
					System.out.println(mensagem);
					System.out.println("seu peso dentro do esperado");
				} else if (calculoImc >= sobrePesoMin && calculoImc <= sobrePesoMax) {
					System.out.println(mensagem);
					System.out.println("seu peso est� um pouco acimo do esperado");
				} else if (calculoImc >= obesidadeGrau1Min && calculoImc <= obesidadeGrau1Max) {
					System.out.println(mensagem);
					System.out.println("seu peso est� acima do esperado, voc� est� classificado com Obesidade Grau 1");
				} else if (calculoImc >= obesidadeGrau2Min && calculoImc <= obesidadeGrau2Max) {
					System.out.println(mensagem);
					System.out.println("seu peso est� acima do esperado, voc� est� classificado com Obesidade Grau 2");
				}else {
					System.out.println(mensagem);
					System.out.println("seu peso muito acido que o esperado, procure um m�dicoss");
				}
		}

}
