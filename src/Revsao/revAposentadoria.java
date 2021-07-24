package Revsao;

public class revAposentadoria {
	
	public static void main(String[] args) {
		
		//INFORMAÇÕES DO FUNCIONARIO
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
		
		
		//DEFINIÇÕES DE CONDIÇÕES PARA APOSENTADORIA E CORREÇÃO SALARIAL
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
		"\nVocê entrou na empresa em: " + dataEntrada + 
		"\nVocê entrou na empresa com: " + idadeIgresso +
		"\nVocê está na empresa há: " + tempoEmpresa + " anos na empresa." + 
		"\nSeu salário atualmente é de: R$" + salario + " reais." +
		"\nSeu salário corrigido passa a ser de: R$" + salarioCorrigido;
		
		
		String mensagemParaNaoAlteracao = nomeFuncionario + 
		"\nVocê entrou na empresa em: " + dataEntrada + 
		"\nVocê entrou na empresa com: " + idadeIgresso + 
		"\nVocê está há: " + tempoEmpresa + " anos na empresa." + 
		"\nSeu salário atualmente é de: R$" + salario + " reais." + 
		"\nVocê ainda não tem uma correção salarial.";
		
		
		String mensagemAposentadoria = nomeFuncionario + 
		"\nVocê entrou na empresa em: " + dataEntrada + 
		"\nVocê entrou na empresa com: " + idadeIgresso + 
		"\nVocê está há: " + tempoEmpresa + " anos na empresa." + 
		"\nSeu salário atualmente é de: R$" + salario + " reais." + 
		"\nSeu salario corrigido passaa a ser de: R$" + salarioCorrigido + 
		"\nSugerimos que você procure o INSS para se aposentar!";
		
		
		//PARÂMETRO DE DECISÕES DAS INFORMAÇÕES
		if (idade < maiorIdade) {
			
			System.out.println("Você ainda não tem idade para trabalhar.");			
			
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




















































