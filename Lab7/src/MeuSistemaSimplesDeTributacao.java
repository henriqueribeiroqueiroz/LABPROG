import java.util.Scanner;

//Aluno 1: Jos� Henrique Ribeiro

public class MeuSistemaSimplesDeTributacao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Contribuinte c1 = new Contribuinte();
		System.out
				.println("===BEM VINDO AO SISTEMA DE TRIBUTA��O===\n"
						+ "Digite o n�mero correspondente a a��o que deseja executar.\n"
						+ "1- Cadastrar Contribuinte.\n"
						+ "2- Calcular e mostrar impostos e descontos associados a um contribuinte.\n"
						+ "3- Listar os contribuintes em fun��o dos sinais exteriores de riqueza.");
		int op = ler.nextInt();

		if (op == 1) {
			c1.cadastraContribuinte();
			
		} else if (op == 2) {

		} else if (op == 3) {

		}

	}
}
