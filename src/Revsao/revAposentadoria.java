package Revsao;

public class revAposentadoria {
	
	public static void main(String[] args) {
		
		//INFORMA��ES DO FUNCIONARIO
		String nomeFuncionario = "Doglas Resende";
		int dataNascimento = 1991;
		int anoAtual = 2021;
		int dataEntrada = 2019;
		double salario = 2900;
		double salarioCorrigido = 0.0;
		
		
		//CALCULO PARA <IDADE> E <TEMPO DE EMPRESA>
		int idade = anoAtual - dataNascimento;
		int idadeIgresso = dataEntrada - dataNascimento;
		int tempoEmpresa = anoAtual - dataEntrada;
		
		
		//CRITERIO IMUTAVEL
		final int maiorIdade = 18;
		
		
		//DEFINI��ES DE CONDI��ES PARA APOSENTADORIA E CORRE��O SALARIAL
		if (tempoEmpresa >= 10 && tempoEmpresa <= 14) {
			salarioCorrigido = salario + (salario * 0.02);
		}
		
		if (tempoEmpresa >= 15 && tempoEmpresa <= 19) {
			salarioCorrigido = salario + (salario * 0.05);
		}
		
		if (tempoEmpresa >= 20 && tempoEmpresa <= 29) {
			salarioCorrigido = salario + (salario * 0.07);
		}
		
		if (tempoEmpresa >= 30 && tempoEmpresa <= 34) {
			salarioCorrigido = salario + (salario * 0.15);
		}
		
		if (tempoEmpresa >=35) {
			salarioCorrigido = salario + (salario * 0.25);
		}
		
		
		//MENSAGENS PARA DIFERENTES CONTEXTOS
		String mensagem = nomeFuncionario + 
		"\nVoc� entrou na empresa em: " + dataEntrada + 
		"\nVoc� entrou na empresa com: " + idadeIgresso +
		"\nVoc� est� na empresa h�: " + tempoEmpresa + " anos na empresa." + 
		"\nSeu sal�rio atualmente � de: R$" + salario + " reais." +
		"\nSeu sal�rio corrigido passa a ser de: R$" + salarioCorrigido;
		
		
		String mensagemParaNaoAlteracao = nomeFuncionario + 
		"\nVoc� entrou na empresa em: " + dataEntrada + 
		"\nVoc� entrou na empresa com: " + idadeIgresso + 
		"\nVoc� est� h�: " + tempoEmpresa + " anos na empresa." + 
		"\nSeu sal�rio atualmente � de: R$" + salario + " reais." + 
		"\nVoc� ainda n�o tem uma corre��o salarial.";
		
		
		String mensagemAposentadoria = nomeFuncionario + 
		"\nVoc� entrou na empresa em: " + dataEntrada + 
		"\nVoc� entrou na empresa com: " + idadeIgresso + 
		"\nVoc� est� h�: " + tempoEmpresa + " anos na empresa." + 
		"\nSeu sal�rio atualmente � de: R$" + salario + " reais." + 
		"\nSeu salario corrigido passaa a ser de: R$" + salarioCorrigido + 
		"\nSugerimos que voc� procure o INSS para se aposentar!";
		
		
		//PAR�METRO DE DECIS�ES DAS INFORMA��ES
		if (idade < maiorIdade) {
			
			System.out.println("Voc� ainda n�o tem idade para trabalhar.");			
			
		} else if (tempoEmpresa <= 5 ) {
			
			System.out.println(mensagemParaNaoAlteracao);

		} else if (tempoEmpresa >= 10 && tempoEmpresa <= 14) {
			
			System.out.println(mensagem);
			
		} else if (tempoEmpresa >=15 && tempoEmpresa <= 19) {
			
			System.out.println(mensagem);
			
		} else if (tempoEmpresa >=20 && tempoEmpresa <=29) {
			
			System.out.println(mensagem);
			
		} else if (tempoEmpresa >=30 && tempoEmpresa <= 34) {
			
			System.out.println(mensagem);
			
		} else {
			
			System.out.println(mensagemAposentadoria);
		}
			
			
	}
	
}




















































