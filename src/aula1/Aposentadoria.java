package aula1;

public class Aposentadoria {
	
	public static void main(String[] args) {
		
		String nomeFuncionario = "Natália Resende    ";
		int dataEntrada = 2000;
		int dataNascimento = 1995;		
		int anoAtual = 2021;
		double salario = 3100.00;
		double salarioCorrigido = 0.0;
		
		int idade = anoAtual - dataNascimento;		
		//int idadeEntradaEmpresa = dataNascimento - dataEntrada;
		int tempoDeEmpresa = anoAtual - dataEntrada;
		
		final int maiorIdade = 18;
		
		if(tempoDeEmpresa >=10 && tempoDeEmpresa <=14) {
			salarioCorrigido = salario + (salario * 0.02);
		}
		
		if(tempoDeEmpresa >=15 && tempoDeEmpresa <=19) {
			salarioCorrigido = salario + (salario * 0.05);
		}
		
		if(tempoDeEmpresa >=20 && tempoDeEmpresa <=29) {
			salarioCorrigido = salario + (salario * 0.07);			
		}
		
		if(tempoDeEmpresa >=30 && tempoDeEmpresa <=34) {
			salarioCorrigido = salario + (salario * 0.15);
		}
		
		if (tempoDeEmpresa >=35) {
			salarioCorrigido = salario + (salario * 0.25);
		}
		
		String mensagem = nomeFuncionario + 
		"\nVocê entrou na empresa em:  " + dataEntrada + 
		"\nVocê entrou na empresa com: " + (dataEntrada - dataNascimento)  +
		"\nVocê esta é  :  " + tempoDeEmpresa + " anos na empresa."+
		"\nSeu salário atualmente é de:  R$" + salario + "  reais." + 
		"\nSeu salário a partir de hoje, corrigido, passa a ser de:  R$" + salarioCorrigido;
		
		String mensagemParaNaoAlteracao = nomeFuncionario + 
		"\nVocê entrou na empresa em  :  " + dataEntrada + 
		"\nVocê entrou na empresa com  : " +(dataEntrada - dataNascimento)  +
		"\nVocê esta é  :  " + tempoDeEmpresa + "  anos na empresa"+
		"\nSeu salário atualmente é de:  R$" + salario + "  reais" + 
		"\nVocê ainda não tem uma correção salarial.   ";
		
		String mensagemSugestaoAposentadoria = nomeFuncionario + 
		"\nVocê entrou na empresa em:  " + dataEntrada + 
		"\nVocê entrou na empresa com:   " + (dataEntrada - dataNascimento) +
		"\nVocê esta é:  " + tempoDeEmpresa + "  anos na empresa"+
		"\nSeu salário atualmente é de:  R$" + salario + "  reais" + 
		"\nSeu salário a partir de hoje, corrigido, passa a ser de:  R$" + salarioCorrigido +
		"\nSugerimos que você procure o INSS para se aposentar  ";
		
		if (idade < maiorIdade){
			System.out.println("você ainda não tem idade para trabalhar");
		} else if (tempoDeEmpresa <= 5) {
			System.out.println(mensagemParaNaoAlteracao);
		}else if (tempoDeEmpresa >=10 && tempoDeEmpresa <= 14) {
			System.out.println(mensagem);
		}else if (tempoDeEmpresa >=15 && tempoDeEmpresa <=19) {
			System.out.println(mensagem);
		}else if (tempoDeEmpresa >=20 && tempoDeEmpresa <=29) {
			System.out.println(mensagem);
		}else if (tempoDeEmpresa >=30 && tempoDeEmpresa <=34) {
			System.out.println(mensagem);
		}else {
			System.out.println(mensagemSugestaoAposentadoria);
		}	
		
	}

}


//cod diego
/*public class Aposentadoria {

    public static void main(String[] args) {

        String nome = "Diego Maia";
        int anoDeEntrada = 1991;
        int anoNascimento = 1990;
        int anoAtual = 2021;
        double salario = 4500.00;
        double salarioCorrido = 0.0;

        int idade = anoAtual - anoNascimento;
        int tempoDeTrabalho = anoAtual - anoDeEntrada;

        int maturidade = 18;

        if(tempoDeTrabalho >= 10 && tempoDeTrabalho <= 14 ){
            salarioCorrido = salario + (salario * 0.02);
        }

        if(tempoDeTrabalho >= 15 && tempoDeTrabalho <= 19 ){
            salarioCorrido = salario + (salario * 0.05);
        }

        if(tempoDeTrabalho >= 20 && tempoDeTrabalho <= 29 ){
            salarioCorrido = salario + (salario * 0.07);
        }

        if(tempoDeTrabalho >= 30 && tempoDeTrabalho <= 34 ){
            salarioCorrido = salario + (salario * 0.15);
        }

        if(tempoDeTrabalho >= 35 ){
            salarioCorrido = salario + (salario * 0.25);
        }

        String mensagem = nome + ".\n" +
                "Entrada na empresa: " + anoDeEntrada +
                "\nSua idade quando come�ou na empresa era de: " + (anoDeEntrada - anoNascimento) +
                "\nVoc� tem " + tempoDeTrabalho + " anos de emprea." +
                "\nSeu sal�rio era de: " + salario +
                "\nAgora seu sal�rio corrigido �: " + salarioCorrido;

        String mensagemParaNaoAlteracao = nome + ".\n" +
                "Entrada na empresa: " + anoDeEntrada +
                "\nSua idade quando come�ou na empresa era de: " + (anoDeEntrada - anoNascimento) +
                "\nVoc� tem " + tempoDeTrabalho + " anos de emprea." +
                "\nSeu sal�rio � de: " + salario;

        String mensagemSugestaoAposentadoria = nome + ".\n" +
                "Entrada na empresa: " + anoDeEntrada +
                "\nSua idade quando come�ou na empresa era de: " + (anoDeEntrada - anoNascimento) +
                "\nVoc� tem " + tempoDeTrabalho + " anos de emprea." +
                "\nSeu sal�rio era de: " + salario +
                "\nAgora seu sal�rio corrigido �: " + salarioCorrido +
                "\nSugerimos que voc� procura o INSS para se aposentar.";

        if(idade < maturidade){
            System.out.println("Voc� n�o est� sequer eleg�vel para trabalhar");
        } else if( tempoDeTrabalho <= 5){
            System.out.println(mensagemParaNaoAlteracao);
        } else if(tempoDeTrabalho >= 10 && tempoDeTrabalho <= 14){
            System.out.println(mensagem);
        } else if(tempoDeTrabalho >= 15 && tempoDeTrabalho <= 19){
            System.out.println(mensagem);
        } else if(tempoDeTrabalho >= 20 && tempoDeTrabalho <= 29){
            System.out.println(mensagem);
        }else if(tempoDeTrabalho >= 30 && tempoDeTrabalho <= 34) {
            System.out.println(mensagem);
        } else {
            System.out.println(mensagemSugestaoAposentadoria);
        }

    }

}*/

