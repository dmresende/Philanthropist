package exerFuncao;

//importação biblioteca
import java.util.Scanner;

public class aposentadoriaFuncao {									//------PROBLEMA----- COMO SÃO VARIAVEIS GLOBAIS ACABA QUE ELA NÃO ACUMULAM OS VALORES

	// variável globais // lembrar do "static"
	static String nomeFuncionario;
	static int dataEntrada;
	static int dataNascimento;
	static int anoAtual;
	static double salario;
	static int maiorIdade;
	static int tempoEmpresa = dataEntrada - anoAtual;
	static double salarioCorrigido;
	static int idade = anoAtual - dataNascimento;

	/// Funções:
	public static void inforFuncionario() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome do funcionário: ");
		String nomeFuncionario = sc.nextLine(); // no caso de String no Scanner usa-se para capturar -nextLine-
		
		System.out.println("Qual a data de entrada: ");
		int dataEntrada = sc.nextInt();
		
		System.out.println("Qual a data de nascimento: ");
		int dataNascimento = sc.nextInt();
		
		System.out.println("Ano atual: "); // aqui podeira colocar uma variavel que mudasse com o tempo
		int anoAtual = sc.nextInt();
		
		System.out.println("Qual o salário do funcionário: ");
		double salario = sc.nextDouble();
	}

	public static void condicoes() {

		// condições para correção com if inclusivo
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

		if (tempoEmpresa >= 35) {
			salarioCorrigido = salario + (salario * 0.25);
		}

	}

	// mensagem para o usuário contatenados com as variáveis
	public static String mensagem(int tempoEmpresa, int dataEntrada, int dataNascimento, double salario,
			double salarioCorrigido) {

		return "\n Você entrou na empresa em: " + dataEntrada + "\n Você entrou na empresa com: "
				+ (dataEntrada - dataNascimento) + "\n Você está a: " + tempoEmpresa + "anos na empresa."
				+ "\n Seu salário atualmente é de: R$" + salario + " reais." + "\n Seu salário corrigido é: R$"
				+ salarioCorrigido;

	}

	// mensagem para não alteração
	public static String mensagemParaNaoAlteracao(int tempoEmpresa, int dataEntrada, int dataNascimento,
			double salario) {

		return "\n Você entrou na empresa em: " + dataEntrada + "\n Você entrou na empresa com: "
				+ (dataEntrada - dataNascimento) + "\n Você está a: " + tempoEmpresa + "anos na empresa."
				+ "\n Seu salário atualmente é de: R$" + salario + " reais."
				+ "\n Você ainda não tem correção salarial";
	}

	// mensagem sugestão de aposentadoria
	public static String mensagemAposentadoria(int tempoEmpresa, int dataEntrada, int dataNascimento, double salario,
			double salarioCorrigido) {

		return "\n Você entrou na empresa em: " + dataEntrada + "\n Você entrou na empresa com: "
				+ (dataEntrada - dataNascimento) + "\n Você está a: " + tempoEmpresa + "anos na empresa."
				+ "\n Seu salário atualmente é de: R$" + salario + " reais." + "\n Seu salário corrigido é: R$"
				+ salarioCorrigido + "\n Sugerimos que você procure o INSS para se aposentar";
	}

	public static void comparacoes() {

		if (idade < maiorIdade) {
			System.out.println("Você ainda não tem idade para trabalhar.");
		} else if (tempoEmpresa <= 5) {
			System.out.println(mensagemParaNaoAlteracao(tempoEmpresa, dataEntrada, dataNascimento, salario));
		} else if (tempoEmpresa >= 10 && tempoEmpresa <= 14) {
			System.out.println(mensagem(tempoEmpresa, dataEntrada, dataNascimento, salario, salarioCorrigido));
		} else if (tempoEmpresa >= 15 && tempoEmpresa <= 19) {
			System.out.println(mensagem(tempoEmpresa, dataEntrada, dataNascimento, salario, salarioCorrigido));
		} else if (tempoEmpresa <= 20 && tempoEmpresa <= 29) {
			System.out.println(mensagem(tempoEmpresa, dataEntrada, dataNascimento, salario, salarioCorrigido));
		} else if (tempoEmpresa >= 30 && tempoEmpresa <= 34) {
			System.out.println(mensagem(tempoEmpresa, dataEntrada, dataNascimento, salario, salarioCorrigido));
		} else {
			System.out.println(
					mensagemAposentadoria(tempoEmpresa, dataEntrada, dataNascimento, salario, salarioCorrigido));
		}

	}

	
	public static void main(String[] args) {

		

		inforFuncionario();
		condicoes();
		comparacoes();
	}

}
